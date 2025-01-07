package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import calculations.GradeCalculations;

/**
 * The Panel7StudentGradeSim class constructs the seventh page of the project.
 * This page encompasses a student grade simulator where students can project
 * their grades or determine what they need to score on the exam to do well in 
 * the semester.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel7StudentGradeSim extends JPanel {

	/** Version */
	private static final long serialVersionUID = 1L;

	/** The page center */
	private JPanel centerPanel;
	/** The page center layout */
	private SpringLayout sl;

	/** The given first quarter grade */
	private JTextField givenFirstQuarterGrade;
	/** The given second quarter grade */
	private JTextField givenSecondQuarterGrade;
	/** The given final exam grade */
	private JTextField givenFinalExamGrade;
	/** The given final grade */
	private JTextField givenFinalGrade;
	/** The given first quarter weight */
	private JTextField givenFirstQuarterWeight;
	/** The given second quarter weight */
	private JTextField givenSecondQuarterWeight;
	/** The given final exam weight */
	private JTextField givenFinalExamWeight;
	/** A JLabel holding a failure message if needed */
	private JLabel failed;


	/**
	 * Constructs the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel7StudentGradeSim() {
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

		JLabel labelStudentHomeHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("STUDENT_GRADE_SIM_HEADER.png")));
		northPanel.add(labelStudentHomeHeader);
		add(northPanel, BorderLayout.NORTH);
	}


	/**
	 * Constructs the center portion of the panel. In this case, prompts with
	 * instructions for the user in using the grading simulator with JTextFields
	 * to hold the information are made.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);

		JLabel enterInformation = new JLabel("Fill in all values except final grade OR semester exam.");
		enterInformation.setFont(GraphicsConstants.montserratBold30);

		JLabel enterWeightsInformation = new JLabel("Ensure your weights are equal to 100 percent.");
		enterWeightsInformation.setFont(GraphicsConstants.montserratBold30);

		Dimension textFieldGradeSize = new Dimension(200, 45);
		Dimension textFieldWeightSize = new Dimension(100, 45);

		JLabel enterFirstQuarterGrade = new JLabel("First Quarter Grade");
		enterFirstQuarterGrade.setFont(GraphicsConstants.montserratBold15);

		givenFirstQuarterGrade = new JTextField();
		givenFirstQuarterGrade.setPreferredSize(textFieldGradeSize);
		givenFirstQuarterGrade.setFont(GraphicsConstants.montserratBold30);

		JLabel enterSecondQuarterGrade = new JLabel("Second Quarter Grade");
		enterSecondQuarterGrade.setFont(GraphicsConstants.montserratBold15);

		givenSecondQuarterGrade = new JTextField();
		givenSecondQuarterGrade.setPreferredSize(textFieldGradeSize);
		givenSecondQuarterGrade.setFont(GraphicsConstants.montserratBold30);

		JLabel enterFinalExamGrade = new JLabel("Semester Exam Grade");
		enterFinalExamGrade.setFont(GraphicsConstants.montserratBold15);

		givenFinalExamGrade = new JTextField();
		givenFinalExamGrade.setPreferredSize(textFieldGradeSize);
		givenFinalExamGrade.setFont(GraphicsConstants.montserratBold30);

		JLabel enterFinalGrade = new JLabel("Final Grade");
		enterFinalGrade.setFont(GraphicsConstants.montserratBold15);

		givenFinalGrade = new JTextField();
		givenFinalGrade.setPreferredSize(textFieldGradeSize);
		givenFinalGrade.setFont(GraphicsConstants.montserratBold30);

		JLabel enterFirstQuarterWeight = new JLabel("First Quarter Weight");
		enterFirstQuarterWeight.setFont(GraphicsConstants.montserratBold15);

		givenFirstQuarterWeight = new JTextField();
		givenFirstQuarterWeight.setPreferredSize(textFieldWeightSize);
		givenFirstQuarterWeight.setFont(GraphicsConstants.montserratBold30);

		JLabel enterSecondQuarterWeight = new JLabel("Second Quarter Weight");
		enterSecondQuarterWeight.setFont(GraphicsConstants.montserratBold15);

		givenSecondQuarterWeight = new JTextField();
		givenSecondQuarterWeight.setPreferredSize(textFieldWeightSize);
		givenSecondQuarterWeight.setFont(GraphicsConstants.montserratBold30);

		JLabel enterFinalExamWeight = new JLabel("Semester Exam Weight");
		enterFinalExamWeight.setFont(GraphicsConstants.montserratBold15);

		givenFinalExamWeight = new JTextField();
		givenFinalExamWeight.setPreferredSize(textFieldWeightSize);
		givenFinalExamWeight.setFont(GraphicsConstants.montserratBold30);

		JButton calculate = new JButton("Calculate");
		calculate.setFont(GraphicsConstants.montserratBold30);
		calculate.addActionListener(new ActionListener() {

			/**
			 * Invoked when a user calculates their grade.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				failed.setText("");
				failed.setForeground(Color.RED);

				// Ensuring that all values are filled
				if (givenFirstQuarterGrade.getText().strip() == "" ||
						givenSecondQuarterGrade.getText().strip() == "" ||
						givenFirstQuarterWeight.getText().strip() == "" ||
						givenSecondQuarterWeight.getText().strip() == "" ||
						givenFinalExamWeight.getText().strip() == "" ||
						(givenFinalExamGrade.getText().strip() == "" &&
						givenFinalGrade.getText().strip() == "")) {
					failed.setText("Failed: Fill in all required values, please.");
					return;
				}

				double firstQuarterGrade = 0;
				double secondQuarterGrade = 0;
				double finalExamGrade = 0;
				double finalGrade = 0;
				double firstQuarterWeight = 0;
				double secondQuarterWeight = 0;
				double finalExamWeight = 0;

				// Ensuring all values are numbers
				try {
					firstQuarterGrade = Double.parseDouble(givenFirstQuarterGrade.getText());
					secondQuarterGrade = Double.parseDouble(givenSecondQuarterGrade.getText());

					if (givenFinalExamGrade.getText().strip() == "") {
						finalGrade = Double.parseDouble(givenFinalGrade.getText());
					} else { 
						finalExamGrade = Double.parseDouble(givenFinalExamGrade.getText());
					}

					firstQuarterWeight = Double.parseDouble(givenFirstQuarterWeight.getText());
					secondQuarterWeight = Double.parseDouble(givenSecondQuarterWeight.getText());
					finalExamWeight = Double.parseDouble(givenFinalExamWeight.getText());

				} catch (NumberFormatException exception) {
					failed.setText("Failed: Use numbers, please.");
					return;
				}

				if (firstQuarterWeight + secondQuarterWeight + finalExamWeight != 100) {
					failed.setText("Make sure weights equal 100 percent.");
					return;
				}

				// Determining the result 
				if (givenFinalExamGrade.getText().strip() == "") {
					failed.setForeground(Color.BLACK);
					double result = GradeCalculations.calculateRequiredSemesterExamGrade(firstQuarterGrade, 
							secondQuarterGrade, finalGrade, firstQuarterWeight, secondQuarterWeight, finalExamWeight);
					failed.setText("You need a " + result + " on your semester exam.");
					return;
				} else {
					failed.setForeground(Color.BLACK);
					double result = GradeCalculations.calculateFinalGrade(firstQuarterGrade, secondQuarterGrade, 
							finalExamGrade, firstQuarterWeight, secondQuarterWeight, finalExamWeight);
					failed.setText("You will get a " + result + " for the semester.");
					return;

				}

			}

		});

		failed = new JLabel("");
		failed.setFont(GraphicsConstants.montserratBold30);
		failed.setForeground(Color.RED);

		centerPanel.add(enterInformation);
		centerPanel.add(enterWeightsInformation);
		centerPanel.add(enterFirstQuarterGrade);
		centerPanel.add(givenFirstQuarterGrade);
		centerPanel.add(enterSecondQuarterGrade);
		centerPanel.add(givenSecondQuarterGrade);
		centerPanel.add(enterFinalExamGrade);
		centerPanel.add(givenFinalExamGrade);
		centerPanel.add(enterFinalGrade);
		centerPanel.add(givenFinalGrade);
		centerPanel.add(enterFirstQuarterWeight);
		centerPanel.add(givenFirstQuarterWeight);
		centerPanel.add(enterSecondQuarterWeight);
		centerPanel.add(givenSecondQuarterWeight);
		centerPanel.add(enterFinalExamWeight);
		centerPanel.add(givenFinalExamWeight);
		centerPanel.add(calculate);
		centerPanel.add(failed);

		sl.putConstraint(SpringLayout.WEST, enterInformation, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterInformation, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterWeightsInformation, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterWeightsInformation, 100, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterFirstQuarterGrade, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterFirstQuarterGrade, 175, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenFirstQuarterGrade, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenFirstQuarterGrade, 225, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterSecondQuarterGrade, 350, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterSecondQuarterGrade, 175, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenSecondQuarterGrade, 350, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenSecondQuarterGrade, 225, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterFinalExamGrade, 600, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterFinalExamGrade, 175, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenFinalExamGrade, 600, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenFinalExamGrade, 225, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterFinalGrade, 850, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterFinalGrade, 175, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenFinalGrade, 850, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenFinalGrade, 225, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterFirstQuarterWeight, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterFirstQuarterWeight, 275, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenFirstQuarterWeight, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenFirstQuarterWeight, 325, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterSecondQuarterWeight, 350, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterSecondQuarterWeight, 275, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenSecondQuarterWeight, 350, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenSecondQuarterWeight, 325, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterFinalExamWeight, 600, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterFinalExamWeight, 275, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenFinalExamWeight, 600, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenFinalExamWeight, 325, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, calculate, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, calculate, 400, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, failed, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, failed, 460, SpringLayout.NORTH, centerPanel);

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
		sl.putConstraint(SpringLayout.WEST, goHome, 850, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 550, SpringLayout.WEST, centerPanel);
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel7StudentGradeSim [centerPanel=" + centerPanel + ", sl=" + sl + ", givenFirstQuarterGrade="
				+ givenFirstQuarterGrade + ", givenSecondQuarterGrade=" + givenSecondQuarterGrade
				+ ", givenFinalExamGrade=" + givenFinalExamGrade + ", givenFinalGrade=" + givenFinalGrade
				+ ", givenFirstQuarterWeight=" + givenFirstQuarterWeight + ", givenSecondQuarterWeight="
				+ givenSecondQuarterWeight + ", givenFinalExamWeight=" + givenFinalExamWeight + ", failed=" + failed
				+ "]";
	}

}
