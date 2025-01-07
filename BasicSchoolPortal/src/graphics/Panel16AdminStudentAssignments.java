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

/**
 * The Panel16AdminStudentAssignments class constructs the sixteenth page of 
 * the project. This page encompasses an administrator's ability to assign
 * students to a particular class in the database.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel16AdminStudentAssignments extends JPanel {

	/** Version */
	private static final long serialVersionUID = 1L;
	
	/** The page center */
	private JPanel centerPanel;
	/** The page center layout */
	private SpringLayout sl;
	
	/** A JComboBox with the list of classes */
	private JComboBox<String> selectClass;
	/** A JComboBox with the list of students */
	private JComboBox<String> selectStudent;
	
	
	/**
	 * Constructs the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel16AdminStudentAssignments() {
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
		
		JLabel labelAdminStudentAssignments = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("ADMIN_STUDENT_ASSIGNMENT_HEADER.png")));
		northPanel.add(labelAdminStudentAssignments);
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	/**
	 * Constructs the center portion of the panel. In this case, prompts to
	 * select classes and students with a button to confirm the assignments
	 * are made.
	 */
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

			/**
			 * Invoked when a student assignment is made.
			 */
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
	
	
	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class.
	 * 
	 * @param goHome a button that returns to the admin homepage
	 */
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		sl.putConstraint(SpringLayout.WEST, goHome, 900, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 550, SpringLayout.NORTH, centerPanel);
	}
	
	
	/**
	 * Refreshes the select class and select student JComboBox with information
	 * from the data file.
	 */
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
