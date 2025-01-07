package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * The Panel6StudentGrades class constructs the sixth page of the project. This
 * page encompasses the section where students can view their grades by class.
 * Due to time constraints, this was not finished in the first version of the
 * project.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel6StudentGrades extends JPanel {

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
	public Panel6StudentGrades() {
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

		JLabel labelStudentGrades = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("STUDENT_GRADES_HEADER.png")));
		northPanel.add(labelStudentGrades);
		add(northPanel, BorderLayout.NORTH);
	}


	/**
	 * Constructs the center portion of the panel. In this case, prompts asking
	 * to enter the desired class and a button asking to obtain the grade is made,
	 * along with a JComboBox with what should be the list of classes.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);

		JLabel enterClass = new JLabel("Select Class");
		enterClass.setFont(GraphicsConstants.montserratBold50);

		JComboBox<String> givenClass = new JComboBox<String>();
		givenClass.setFont(GraphicsConstants.montserratBold30);

		JButton obtainGrade = new JButton("See Grade");
		obtainGrade.setFont(GraphicsConstants.montserratBold30);

		centerPanel.add(enterClass);
		centerPanel.add(givenClass);
		centerPanel.add(obtainGrade);

		sl.putConstraint(SpringLayout.WEST, enterClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterClass, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenClass, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, obtainGrade, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, obtainGrade, 250, SpringLayout.NORTH, centerPanel);

		add(centerPanel, BorderLayout.CENTER);

	}


	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class.
	 * 
	 * @param goHome a button that returns to the student homepage
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
		return "Panel6StudentGrades [centerPanel=" + centerPanel + ", sl=" + sl + "]";
	}
}
