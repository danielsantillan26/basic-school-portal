package graphics;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Daniel Santillan
 */
public class Frame extends JFrame {

	/** Version */
	private static final long serialVersionUID = 1L;
	/** Container for the card layout */
	private Container container;
	/** Card layout that holds all the JPanels together and allows for the
	 * 	interchanging of pages
	 */
	private CardLayout cl;
	
	
	/**
	 * 
	 */
	public Frame() {
		setTitle("Basic School Portal");
		Dimension x = Toolkit.getDefaultToolkit().getScreenSize();
		int length = x.width;
		int width = x.height;
		setSize(length, width);
		setExtendedState(JFrame. MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);	
		setFocusable(true);
	
		cl = new CardLayout();
		container = getContentPane();
		container.setLayout(cl);
		prepareCardLayout();
	}
	
	
	
	private void prepareCardLayout() {
		Panel1Introduction panelIntro = new Panel1Introduction();
		Panel2Login panelLogin = new Panel2Login();
		Panel3Register panelRegister = new Panel3Register();
		
		JButton buttonPanelIntroRegister = new JButton(new ImageIcon(getClass().getClassLoader().getResource("REGISTER.png")));
		buttonPanelIntroRegister.setBorder(null);
		buttonPanelIntroRegister.setOpaque(false);
		buttonPanelIntroRegister.setContentAreaFilled(false);
		buttonPanelIntroRegister.setBorderPainted(false);
		
		JButton buttonPanelIntroLogin = new JButton(new ImageIcon(getClass().getClassLoader().getResource("LOGIN.png")));
		buttonPanelIntroLogin.setBorder(null);
		buttonPanelIntroLogin.setOpaque(false);
		buttonPanelIntroLogin.setContentAreaFilled(false);
		buttonPanelIntroLogin.setBorderPainted(false);
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == buttonPanelIntroRegister) {
					cl.next(container);
					cl.next(container);
				} else if (e.getSource() == buttonPanelIntroLogin) {
					cl.next(container);
				}
			}
			
			
		};
		
		buttonPanelIntroRegister.addActionListener(al);
		buttonPanelIntroLogin.addActionListener(al);
		
		panelIntro.addChangePageButtons(buttonPanelIntroRegister, buttonPanelIntroLogin);
		
		container.add(panelIntro);
		container.add(panelLogin);
		container.add(panelRegister);
		
	}
	
}
