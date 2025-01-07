package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;

import files.FileManagement;

/**
 * The Panel12TeacherRosters class constructs the twelfth page of the project.
 * This page encompasses a teacher's ability to view their class rosters. 
 */
public class Panel12TeacherRosters extends JPanel {

	/** Version */
	private static final long serialVersionUID = 1L;
	
	/** The page center */
	private JPanel centerPanel;
	/** The page center layout */
	private SpringLayout sl;
	/** A table to hold the roster */
	private JTable rosterTable;
	
	
	/**
	 * Constructs the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel12TeacherRosters() {
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
		
		JLabel labelTeacherRosterHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("TEACHER_ROSTER_HEADER.png")));
		northPanel.add(labelTeacherRosterHeader);
		add(northPanel, BorderLayout.NORTH);
		
	}
	
	
	/**
	 * Constructs the center portion of the panel. In this case, labels asking
	 * to enter the class (in a JComboBox) are made along with the table that
	 * was meant to hold the rosters.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		JLabel enterClass = new JLabel("Select Class");
		enterClass.setFont(GraphicsConstants.montserratBold50);
		
		JComboBox<String> givenClass = new JComboBox<String>();
		givenClass.setFont(GraphicsConstants.montserratBold30);
		
		JButton obtainRoster = new JButton("See Roster");
		obtainRoster.setFont(GraphicsConstants.montserratBold30);
		
		String[] columnNames = {"Student Name"};
		Object[][] data = {{""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
				{""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
				{""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
				{""}, {""}, {""}, {""}, {""}, {""}, {""}};
		
		rosterTable = new JTable(data, columnNames);
		rosterTable.setFillsViewportHeight(true);
		JScrollPane spTable = new JScrollPane(rosterTable);
		spTable.setPreferredSize(new Dimension(700, 500));
		
		centerPanel.add(enterClass);
		centerPanel.add(givenClass);
		centerPanel.add(obtainRoster);
		centerPanel.add(spTable);
		
		sl.putConstraint(SpringLayout.WEST, enterClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterClass, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenClass, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenClass, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, obtainRoster, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, obtainRoster, 250, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, spTable, 500, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, spTable, 75, SpringLayout.NORTH, centerPanel);
		
		add(centerPanel, BorderLayout.CENTER);
		
	}
	
	
	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class.
	 * 
	 * @param goHome a button to return to the teacher homepage
	 */
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		
		sl.putConstraint(SpringLayout.WEST, goHome, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 400, SpringLayout.NORTH, centerPanel);
	}

	
	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel12TeacherRosters [centerPanel=" + centerPanel + ", sl=" + sl + ", rosterTable=" + rosterTable
				+ "]";
	}
}
