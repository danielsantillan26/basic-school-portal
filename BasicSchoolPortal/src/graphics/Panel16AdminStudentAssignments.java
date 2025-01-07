package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import files.FileManagement;

public class Panel16AdminStudentAssignments extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	private SpringLayout sl;
	private JComboBox<String> selectClass;
	private JComboBox<String> selectStudent;
	
	
	public Panel16AdminStudentAssignments() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelAdminStudentAssignments = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("ADMIN_STUDENT_ASSIGNMENT_HEADER.png")));
		northPanel.add(labelAdminStudentAssignments);
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
		
		JLabel enterStudent = new JLabel("Select Student");
		enterStudent.setFont(GraphicsConstants.montserratBold50);
		
		selectStudent = new JComboBox<String>();
		selectStudent.setFont(GraphicsConstants.montserratBold30);
		
		JButton enterInformation = new JButton("Confirm");
		enterInformation.setFont(GraphicsConstants.montserratBold30);
		enterInformation.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FileManagement.assignStudentToClass(selectClass.getSelectedItem().toString(), selectStudent.getSelectedItem().toString());
			}
			
		});
		
		centerPanel.add(enterClass);
		centerPanel.add(selectClass);
		centerPanel.add(enterStudent);
		centerPanel.add(selectStudent);
		centerPanel.add(enterInformation);
		
		sl.putConstraint(SpringLayout.WEST, enterClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterClass, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, selectClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, selectClass, 175, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterStudent, 575, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterStudent, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, selectStudent, 575, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, selectStudent, 175, SpringLayout.NORTH, centerPanel);
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
		selectClass.removeAllItems();
		selectStudent.removeAllItems();
		
		
		ArrayList<String> classNames = FileManagement.getClassNames();
		for (String s : classNames) {
			selectClass.addItem(s);
		}
		
		ArrayList<String> studentNames = FileManagement.getStudentNames();
		for (String s: studentNames) {
			selectStudent.addItem(s);
		}
		
		repaint();
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel16AdminStudentAssignments [centerPanel=" + centerPanel + ", sl=" + sl + ", selectClass="
				+ selectClass + ", selectStudent=" + selectStudent + "]";
	}
	
}
