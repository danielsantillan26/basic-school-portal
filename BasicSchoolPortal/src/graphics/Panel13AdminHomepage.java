package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * The Panel13AdminHomepage class constructs the thirteenth page of the
 * project. This page encompasses the admin homepage of the project, where
 * administrators can navigate to other pages meant for administrators.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel13AdminHomepage extends JPanel {

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
	public Panel13AdminHomepage() {
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
		
		JLabel labelAdminHome = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("ADMIN_HOME_HEADER.png")));
		northPanel.add(labelAdminHome);
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	/**
	 * Constructs the center portion of the panel.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		add(centerPanel, BorderLayout.CENTER);
	}
	
	
	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class.
	 * 
	 * @param userCreation a button to go to the user creation page
	 * @param classCreation a button to go to the class creation page
	 * @param teacherAssignments a button to go to the teacher assignment page
	 * @param studentAssignments a button to go to the student assignment page
	 */
	public void addChangePageButtons(JButton userCreation, JButton classCreation, JButton teacherAssignments, JButton studentAssignments) {
		centerPanel.add(userCreation);
		centerPanel.add(classCreation);
		centerPanel.add(teacherAssignments);
		centerPanel.add(studentAssignments);
		studentAssignments.setPreferredSize(new Dimension(300, 45));
		
		sl.putConstraint(SpringLayout.WEST, userCreation, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, userCreation, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, classCreation, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, classCreation, 250, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, teacherAssignments, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, teacherAssignments, 350, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, studentAssignments, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, studentAssignments, 450, SpringLayout.NORTH, centerPanel);
		
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel13AdminHomepage [centerPanel=" + centerPanel + ", sl=" + sl + "]";
	}
}
