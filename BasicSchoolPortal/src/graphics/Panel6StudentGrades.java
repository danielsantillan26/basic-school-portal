package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class Panel6StudentGrades extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel centerPanel;
	private SpringLayout sl;
	
	
	public Panel6StudentGrades() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelStudentGrades = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("STUDENT_GRADES_HEADER.png")));
		northPanel.add(labelStudentGrades);
		add(northPanel, BorderLayout.NORTH);
	}
	
	
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
	
	
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		
		sl.putConstraint(SpringLayout.WEST, goHome, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 550, SpringLayout.NORTH, centerPanel);
	}

}
