package graphics;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

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
		
		
		
		
		container.add(panelIntro);	
		
	}
	
}
