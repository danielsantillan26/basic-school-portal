package graphics;

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
		
		add(new Panel1Introduction());
	}
	
}
