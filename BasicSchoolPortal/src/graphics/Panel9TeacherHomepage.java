package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * The Panel9TeacherHomepage class constructs the ninth page of the project. This
 * page encompasses the teacher homepage, a hub for teachers to move between
 * sections meant for them in the project.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel9TeacherHomepage extends JPanel {

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
	public Panel9TeacherHomepage() {
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

		JLabel labelStudentGrades = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("TEACHER_HOME_HEADER.png")));
		northPanel.add(labelStudentGrades);
		add(northPanel, BorderLayout.NORTH);
	}


	/**
	 * Constructs the center portion of the panel. In this case, a prompt
	 * with the class list is added. Due to time constraints, this functionality
	 * was not implemented.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);

		JLabel classList = new JLabel("Your classes");
		classList.setFont(GraphicsConstants.montserratBold50);


		centerPanel.add(classList);

		sl.putConstraint(SpringLayout.WEST, classList, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, classList, 50, SpringLayout.NORTH, centerPanel);

		add(centerPanel, BorderLayout.CENTER);
	}


	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class.
	 * 
	 * @param grader a button that goes to the grader
	 * @param messageEdits a button that goes to message edits
	 * @param rosters a button that goes to the rosters
	 */
	public void addChangePageButtons(JButton grader, JButton messageEdits, JButton rosters) {
		centerPanel.add(grader);
		centerPanel.add(messageEdits);
		centerPanel.add(rosters);

		sl.putConstraint(SpringLayout.WEST, grader, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, grader, 550, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, messageEdits, 50, SpringLayout.EAST, grader);
		sl.putConstraint(SpringLayout.NORTH, messageEdits, 550, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, rosters, 50, SpringLayout.EAST, messageEdits);
		sl.putConstraint(SpringLayout.NORTH, rosters, 550, SpringLayout.NORTH, centerPanel);
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel9TeacherHomepage [centerPanel=" + centerPanel + ", sl=" + sl + "]";
	}
}
