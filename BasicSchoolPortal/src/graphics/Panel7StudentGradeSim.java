package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Panel7StudentGradeSim extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel centerPanel;
	private SpringLayout sl;
	
	public Panel7StudentGradeSim() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelStudentHomeHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("STUDENT_GRADE_SIM_HEADER.png")));
		northPanel.add(labelStudentHomeHeader);
		add(northPanel, BorderLayout.NORTH);
	}
	
	
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
		
		JTextField givenFirstQuarterGrade = new JTextField();
		givenFirstQuarterGrade.setPreferredSize(textFieldGradeSize);
		givenFirstQuarterGrade.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterSecondQuarterGrade = new JLabel("Second Quarter Grade");
		enterSecondQuarterGrade.setFont(GraphicsConstants.montserratBold15);
		
		JTextField givenSecondQuarterGrade = new JTextField();
		givenSecondQuarterGrade.setPreferredSize(textFieldGradeSize);
		givenSecondQuarterGrade.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterFinalExamGrade = new JLabel("Semester Exam Grade");
		enterFinalExamGrade.setFont(GraphicsConstants.montserratBold15);
		
		JTextField givenFinalExamGrade = new JTextField();
		givenFinalExamGrade.setPreferredSize(textFieldGradeSize);
		givenFinalExamGrade.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterFinalGrade = new JLabel("Final Grade");
		enterFinalGrade.setFont(GraphicsConstants.montserratBold15);
		
		JTextField givenFinalGrade = new JTextField();
		givenFinalGrade.setPreferredSize(textFieldGradeSize);
		givenFinalGrade.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterFirstQuarterWeight = new JLabel("First Quarter Weight");
		enterFirstQuarterWeight.setFont(GraphicsConstants.montserratBold15);
		
		JTextField givenFirstQuarterWeight = new JTextField();
		givenFirstQuarterWeight.setPreferredSize(textFieldWeightSize);
		givenFirstQuarterWeight.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterSecondQuarterWeight = new JLabel("Second Quarter Weight");
		enterSecondQuarterWeight.setFont(GraphicsConstants.montserratBold15);
		
		JTextField givenSecondQuarterWeight = new JTextField();
		givenSecondQuarterWeight.setPreferredSize(textFieldWeightSize);
		givenSecondQuarterWeight.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterFinalExamWeight = new JLabel("Semester Exam Weight");
		enterFinalExamWeight.setFont(GraphicsConstants.montserratBold15);
		
		JTextField givenFinalExamWeight = new JTextField();
		givenFinalExamWeight.setPreferredSize(textFieldWeightSize);
		givenFinalExamWeight.setFont(GraphicsConstants.montserratBold30);
		
		JButton calculate = new JButton("Calculate");
		calculate.setFont(GraphicsConstants.montserratBold30);
		
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
		
		add(centerPanel, BorderLayout.CENTER);
	}
	
	
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		sl.putConstraint(SpringLayout.WEST, goHome, 850, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 550, SpringLayout.WEST, centerPanel);
	}
	
}
