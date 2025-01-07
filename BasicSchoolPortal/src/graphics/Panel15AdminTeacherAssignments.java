package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import files.FileMaker;

public class Panel15AdminTeacherAssignments extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	private SpringLayout sl;
	private JComboBox<String> selectClass;
	private JComboBox<String> selectTeacher;


	public Panel15AdminTeacherAssignments() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}


	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));

		JLabel labelAdminTeacherAssignments = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("ADMIN_TEACHER_ASSIGNMENT_HEADER.png")));
		northPanel.add(labelAdminTeacherAssignments);
		add(northPanel, BorderLayout.NORTH);
	}


	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);

		JLabel enterClass = new JLabel("Select Class");
		enterClass.setFont(GraphicsConstants.montserratBold50);

		selectClass = new JComboBox<String>();
		selectClass.setFont(GraphicsConstants.montserratBold30);

		JLabel enterTeacher = new JLabel("Select Teacher");
		enterTeacher.setFont(GraphicsConstants.montserratBold50);

		selectTeacher = new JComboBox<String>();
		selectTeacher.setFont(GraphicsConstants.montserratBold30);

		JButton enterInformation = new JButton("Confirm");
		enterInformation.setFont(GraphicsConstants.montserratBold30);

		centerPanel.add(enterClass);
		centerPanel.add(selectClass);
		centerPanel.add(enterTeacher);
		centerPanel.add(selectTeacher);
		centerPanel.add(enterInformation);

		sl.putConstraint(SpringLayout.WEST, enterClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterClass, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, selectClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, selectClass, 175, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterTeacher, 575, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterTeacher, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, selectTeacher, 575, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, selectTeacher, 175, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterInformation, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterInformation, 300, SpringLayout.NORTH, centerPanel);

		add(centerPanel, BorderLayout.CENTER);
	}


	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		sl.putConstraint(SpringLayout.WEST, goHome, 900, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 550, SpringLayout.NORTH, centerPanel);
	}
	
	public void addContent() {
		ArrayList<String> classNames = FileMaker.getClassNames();
		for (String s : classNames) {
			selectClass.addItem(s);
		}
		
		ArrayList<String> teacherNames = FileMaker.getTeacherNames();
		for (String s: teacherNames) {
			selectTeacher.addItem(s);
		}
		
		repaint();
	}

}
