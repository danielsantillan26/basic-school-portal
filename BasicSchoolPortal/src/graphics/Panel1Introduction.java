package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The Panel1Introduction class creates the JPanel for the introductory page of
 * the Basic School Portal. This includes a title graphic and a graphical user
 * interface that prompts users to either log in to their school-affiliated
 * account or create a new database of users for a school using this program
 * for the first time.
 * 
 * @version 1.0
 * @author Daniel Santillan
 */
public class Panel1Introduction extends JPanel {

	/** Version */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * This constructor sets up the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel1Introduction() {
		setLayout(new BorderLayout());
		
		createNorthPanel();
		createCenterPanel();
		
	}
	
	
	/**
	 * 
	 */
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	/**
	 * 
	 */
	private void createCenterPanel() {
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(GraphicsConstants.centerColor);
		JLabel intro = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("EDUPORTAL_INTRO_LOGO.png")));
		centerPanel.add(intro);
		add(centerPanel, BorderLayout.CENTER);
		
	}
	
	
	public void addChangePageButtons(JButton register, JButton login) {
		JPanel southPanel = new JPanel();
		southPanel.setBackground(GraphicsConstants.centerColor);
		southPanel.add(register);
		southPanel.add(login);
		add(southPanel, BorderLayout.SOUTH);
	}
	
}
