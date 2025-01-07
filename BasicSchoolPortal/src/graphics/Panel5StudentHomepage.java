package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import files.FileManagement;

/**
 * The Panel5StudentHomepage constructs the fifth page of the project. This page
 * encompasses the Student Homepage, a hub for students to go to various pages
 * of the program meant for them.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel5StudentHomepage extends JPanel {

	/** Version */
	private static final long serialVersionUID = 1L;

	/** The page center */
	private JPanel centerPanel;
	/** The page center layout */
	private SpringLayout sl;

	/** A label for classes - this is not used in the project due to lack of
	 * time to implement this. */
	private JLabel classesLabel;


	/**
	 * Constructs the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel5StudentHomepage() {
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

		JLabel labelStudentHomeHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("STUDENT_HOME_HEADER.png")));
		northPanel.add(labelStudentHomeHeader);
		add(northPanel, BorderLayout.NORTH);
	}


	/**
	 * Constructs the center portion of the panel. In this case, a class list
	 * label is added.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);

		JLabel classList = new JLabel("Your classes");
		classList.setFont(GraphicsConstants.montserratBold50);

		classesLabel = new JLabel();
		classesLabel.setFont(GraphicsConstants.montserratBold30);


		centerPanel.add(classList);
		centerPanel.add(classesLabel);

		sl.putConstraint(SpringLayout.WEST, classList, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, classList, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, classesLabel, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, classesLabel, 125, SpringLayout.NORTH, centerPanel);

		add(centerPanel, BorderLayout.CENTER);
	}


	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class.
	 * 
	 * @param viewGrades a button that goes to the view grades section
	 * @param gradingSim a button that goes to the grading simulator
	 * @param viewClassmates a button that goes to the roster page
	 */
	public void addChangePageButtons(JButton viewGrades, JButton gradingSim, JButton viewClassmates) {
		centerPanel.add(viewGrades);
		centerPanel.add(gradingSim);
		centerPanel.add(viewClassmates);

		sl.putConstraint(SpringLayout.WEST, viewGrades, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, viewGrades, 550, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, gradingSim, 425, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, gradingSim, 550, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, viewClassmates, 825, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, viewClassmates, 550, SpringLayout.NORTH, centerPanel);
	}


	/**
	 * Adds user classes for the classes label prompt.
	 */
	public void addClasses() {
		ArrayList<String> classes = FileManagement.getUserClasses();
		for (String s : classes) {
			classesLabel.setText(classesLabel.getText() + s + "\n");
		}
		repaint();
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel5StudentHomepage [centerPanel=" + centerPanel + ", sl=" + sl + ", classesLabel=" + classesLabel
				+ "]";
	}
}
