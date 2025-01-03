package graphics;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
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
		Panel4CreateUsers panelCreateUsers = new Panel4CreateUsers();
		Panel5StudentHomepage panelStudentHomepage = new Panel5StudentHomepage();
		
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
		
		Dimension dimensionButtonReturn = new Dimension(220, 45);

		JButton buttonPanelLoginLogin = new JButton("Login");
		buttonPanelLoginLogin.setPreferredSize(new Dimension(200, 45));
		buttonPanelLoginLogin.setFont(GraphicsConstants.montserratBold30);
		
		JButton buttonPanelLoginReturn = new JButton("Return");
		buttonPanelLoginReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelLoginReturn.setFont(GraphicsConstants.montserratBold30);
		
		JButton buttonPanelRegisterCreate = new JButton("Create Account");
		buttonPanelRegisterCreate.setPreferredSize(new Dimension(300, 45));
		buttonPanelRegisterCreate.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelRegisterReturn = new JButton("Return");
		buttonPanelRegisterReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelRegisterReturn.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelCreateUsersAdd = new JButton("Add User");
		buttonPanelCreateUsersAdd.setPreferredSize(dimensionButtonReturn);
		buttonPanelCreateUsersAdd.setFont(GraphicsConstants.montserratBold30);
		
		JButton buttonPanelCreateUsersReturn = new JButton("Admin Homepage");
		buttonPanelCreateUsersReturn.setPreferredSize(new Dimension(320, 45));
		buttonPanelCreateUsersReturn.setFont(GraphicsConstants.montserratBold30);
		
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == buttonPanelIntroRegister) {
					cl.next(container);
					cl.next(container);
				} else if (e.getSource() == buttonPanelIntroLogin) {
					cl.next(container);
				} else if (e.getSource() == buttonPanelLoginReturn || 
						e.getSource() == buttonPanelRegisterReturn) {
					cl.first(container);
				} else if (e.getSource() == buttonPanelRegisterCreate) {
					cl.next(container);
				} else if (e.getSource() == buttonPanelLoginLogin) {
					int test = 0;
					if (test == 0) {
						System.out.println("Hi Mrs. Kelly\n" +
								"I usually hide easter eggs in my programs. However,\n"
								+ "I decided to hide my easter egg in my GitHub history.\n" +
								"I am sorry to you and myself that I procrastinated on this\n" +
								"project, LOL. Anyway I'm going to eat lunch while I cram\n" +
								"so I will update my GitHub. You can access this easter egg\n" +
								"by clicking login on the login page and looking at console.\n");
						cl.next(container);
						cl.next(container);
						cl.next(container);
					} else if (test == 1) {
						
					} else if (test == 2) {
						
					}
				}
			}


		};

		buttonPanelIntroRegister.addActionListener(al);
		buttonPanelIntroLogin.addActionListener(al);
		buttonPanelLoginLogin.addActionListener(al);
		buttonPanelLoginReturn.addActionListener(al);
		buttonPanelRegisterCreate.addActionListener(al);
		buttonPanelRegisterReturn.addActionListener(al);
		buttonPanelCreateUsersAdd.addActionListener(al);
		buttonPanelCreateUsersReturn.addActionListener(al);

		panelIntro.addChangePageButtons(buttonPanelIntroRegister, buttonPanelIntroLogin);
		panelLogin.addChangePageButtons(buttonPanelLoginLogin, buttonPanelLoginReturn);
		panelRegister.addChangePageButtons(buttonPanelRegisterCreate, buttonPanelRegisterReturn);
		panelCreateUsers.addChangePageButtons(buttonPanelCreateUsersAdd, buttonPanelCreateUsersReturn);
		
		container.add(panelIntro);
		container.add(panelLogin);
		container.add(panelRegister);
		container.add(panelCreateUsers);
		container.add(panelStudentHomepage);

	}

}
