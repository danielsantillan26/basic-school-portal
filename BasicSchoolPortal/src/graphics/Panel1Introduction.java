package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

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
	
	/** JPanel for the header of the page. */
	private JPanel northPanel;
	/** JPanel for the center portion of the page. */
	private JPanel centerPanel;
	
	
	/**
	 * 
	 */
	public Panel1Introduction() {
		setLayout(new BorderLayout());
		northPanel = new JPanel();
		centerPanel = new JPanel();
		add(northPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		
		createNorthPanel();
		createCenterPanel();
		
	}
	
	
	/**
	 * 
	 */
	private void createNorthPanel() {
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
	}
	
	
	/**
	 * 
	 */
	private void createCenterPanel() {
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
	}
	
}
