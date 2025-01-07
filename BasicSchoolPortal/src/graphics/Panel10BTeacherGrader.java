package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;

/**
 * The Panel10BTeacherGrader class constructs the second part of the tenth page
 * of the project. This page was meant to serve as a place where one can select
 * assignments by class and grade all students. However, due to time constraints,
 * this feature was not implemented.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel10BTeacherGrader extends JPanel {

	/** Version */
	private static final long serialVersionUID = 1L;
	
	/** The page center */
	private JPanel centerPanel;
	/** The page center layout */
	private SpringLayout sl;
	/** A JTable where assignments can be graded */
	private JTable table;
	
	
	/**
	 * Constructs the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel10BTeacherGrader() {
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
		
		JLabel labelTeacherGrader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("TEACHER_GRADER_HEADER.png")));
		northPanel.add(labelTeacherGrader);
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	/**
	 * Constructs the center portion of the panel. In this case, prompts to 
	 * select classes and assignments to grade assignments and buttons to collect 
	 * and reset data are made.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		JLabel instructions = new JLabel("Grade students based on class and assignment.");
		instructions.setFont(GraphicsConstants.montserratBold15);
		
		JLabel enterClass = new JLabel("Select Class:");
		enterClass.setFont(GraphicsConstants.montserratBold30);
		
		JComboBox<String> selectClass = new JComboBox<String>();
		
		JLabel enterAssignment = new JLabel("Select Assignment:");
		enterAssignment.setFont(GraphicsConstants.montserratBold30);
		
		JComboBox<String> selectSystem = new JComboBox<String>();
		
		JButton updateTable = new JButton("Collect Data");
		updateTable.setFont(GraphicsConstants.montserratBold30);
		
		JButton resetTable = new JButton("Reset Data");
		resetTable.setFont(GraphicsConstants.montserratBold30);
		
		String[] columnNames = {"Student Name", "Grade (Points or Percent)"};
		Object[][] data = {{"Add Student Name", "Add Grade"},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},
				{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""},};
		table = new JTable(data, columnNames);
		table.setFillsViewportHeight(true);
		JScrollPane spTable = new JScrollPane(table);
		spTable.setPreferredSize(new Dimension(800, 450));
		
		centerPanel.add(instructions);
		centerPanel.add(enterClass);
		centerPanel.add(selectClass);
		centerPanel.add(enterAssignment);
		centerPanel.add(selectSystem);
		centerPanel.add(updateTable);
		centerPanel.add(resetTable);
		centerPanel.add(spTable);
		
		sl.putConstraint(SpringLayout.WEST, instructions, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, instructions, 510, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterClass, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, selectClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, selectClass, 100, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterAssignment, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterAssignment, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, selectSystem, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, selectSystem, 200, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, updateTable, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, updateTable, 550, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, resetTable, 20, SpringLayout.EAST, updateTable);
		sl.putConstraint(SpringLayout.NORTH, resetTable, 550, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, spTable, 400, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, spTable, 50, SpringLayout.NORTH, centerPanel);
		
		add(centerPanel, BorderLayout.CENTER);
	}
	
	
	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class.
	 * 
	 * @param goToA a button that goes to the first part of this page
	 * @param goHome a button that returns to the teacher homepage
	 */
	public void addChangePageButtons(JButton goToA, JButton goHome) {
		centerPanel.add(goToA);
		centerPanel.add(goHome);
		
		sl.putConstraint(SpringLayout.WEST, goToA, 550, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goToA, 550, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, goHome, 20, SpringLayout.EAST, goToA);
		sl.putConstraint(SpringLayout.NORTH, goHome, 550, SpringLayout.NORTH, centerPanel);
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel10BTeacherGrader [centerPanel=" + centerPanel + ", sl=" + sl + ", table=" + table + "]";
	}
	
}
