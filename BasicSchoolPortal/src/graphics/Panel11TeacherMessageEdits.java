package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

/**
 * The Panel11TeacherMessageEdits class constructs the eleventh page of the
 * project. This class encompasses a field that allows teachers to make a 
 * message for each of their classes, similar to how a school portal allows
 * teachers to edit their class pages. Due to time constraints, this feature
 * was not added in the first version of this program.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel11TeacherMessageEdits extends JPanel {

	/** Version */
	private static final long serialVersionUID = 1L;
	
	/** The page center */
	private JPanel centerPanel;
	/** The page center layout */
	private SpringLayout sl;
	
	
	/**
	 * Constructs the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel11TeacherMessageEdits() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	/**
	 * Constructs the northern portion of the panel, adding the header.
	 */
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelTeacherEdits = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("TEACHER_MESSAGE_EDITS_HEADER.png")));
		northPanel.add(labelTeacherEdits);
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	/**
	 * Constructs the center portion of the panel. In this case, prompts to 
	 * enter a message and a field for said message is made.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		JLabel enterClass = new JLabel("Enter Class");
		enterClass.setFont(GraphicsConstants.montserratBold30);
		
		JComboBox<String> selectClass = new JComboBox<String>();
		
		JLabel enterMessage = new JLabel("Enter your message:");
		enterMessage.setFont(GraphicsConstants.montserratBold30);
	
		JTextArea givenMessage = new JTextArea();
		givenMessage.setFont(GraphicsConstants.montserratBold30);
		givenMessage.setPreferredSize(new Dimension(800, 550));
		givenMessage.setLineWrap(true);
		
		centerPanel.add(enterClass);
		centerPanel.add(selectClass);
		centerPanel.add(enterMessage);
		centerPanel.add(givenMessage);
		
		sl.putConstraint(SpringLayout.WEST, enterClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterClass, 40, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, selectClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, selectClass, 100, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterMessage, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterMessage, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenMessage, 450, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenMessage, 50, SpringLayout.NORTH, centerPanel);
		
		add(centerPanel, BorderLayout.CENTER);
		
	}
	
	
	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class.
	 * 
	 * @param goHome a button to return to the teacher homepage
	 */
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		sl.putConstraint(SpringLayout.WEST, goHome, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 550, SpringLayout.NORTH, centerPanel);
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel11TeacherMessageEdits [centerPanel=" + centerPanel + ", sl=" + sl + "]";
	}

}
