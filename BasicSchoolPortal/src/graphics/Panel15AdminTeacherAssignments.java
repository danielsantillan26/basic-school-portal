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
 * The Panel15AdminTeacherAssignments class constructs the fifteenth page of this
 * project. The page encompasses the administrator's ability to assign teachers
 * to particular classes.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel15AdminTeacherAssignments extends JPanel {

	/** Version */
	private static final long serialVersionUID = 1L;
	
	/** The page center */
	private JPanel centerPanel;
	/** The page center layout */
	private SpringLayout sl;
	
	/** A JComboBox with the list of classes */
	private JComboBox<String> selectClass;
	/** A JComboBox with the list of teachers */
	private JComboBox<String> selectTeacher;


	/**
	 * Constructs the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel15AdminTeacherAssignments() {
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

		JLabel labelAdminTeacherAssignments = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("ADMIN_TEACHER_ASSIGNMENT_HEADER.png")));
		northPanel.add(labelAdminTeacherAssignments);
		add(northPanel, BorderLayout.NORTH);
	}


	/**
	 * Constructs the center portion of the panel. In this case, prompts to
	 * select classes and teachers with a button to confirm the assignments
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

		JLabel enterTeacher = new JLabel("Select Teacher");
		enterTeacher.setFont(GraphicsConstants.montserratBold50);

		selectTeacher = new JComboBox<String>();
		selectTeacher.setFont(GraphicsConstants.montserratBold30);

		JButton enterInformation = new JButton("Confirm");
		enterInformation.setFont(GraphicsConstants.montserratBold30);
		enterInformation.addActionListener(new ActionListener() {

			/**
			 * Invoked when a teacher assignment is made.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				FileManagement.assignTeacherToClass(selectClass.getSelectedItem().toString(), selectTeacher.getSelectedItem().toString());
			}
			
		});

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
	 * Refreshes the select class and select teacher JComboBox with information
	 * from the data file.
	 */
	public void addContent() {
		selectClass.removeAllItems();
		selectTeacher.removeAllItems();
		
		ArrayList<String> classNames = FileManagement.getClassNames();
		for (String s : classNames) {
			selectClass.addItem(s);
		}
		
		ArrayList<String> teacherNames = FileManagement.getTeacherNames();
		for (String s: teacherNames) {
			selectTeacher.addItem(s);
		}
		
		repaint();
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel15AdminTeacherAssignments [centerPanel=" + centerPanel + ", sl=" + sl + ", selectClass="
				+ selectClass + ", selectTeacher=" + selectTeacher + "]";
	}
}
