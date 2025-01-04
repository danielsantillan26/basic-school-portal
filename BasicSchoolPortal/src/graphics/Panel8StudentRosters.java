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

public class Panel8StudentRosters extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel centerPanel;
	private SpringLayout sl;
	private JTable rosterTable;
	
	public Panel8StudentRosters() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelStudentRosterHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("STUDENT_ROSTER_HEADER.png")));
		northPanel.add(labelStudentRosterHeader);
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
		
		JButton obtainRoster = new JButton("See Grade");
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
	
	
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		
		sl.putConstraint(SpringLayout.WEST, goHome, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 400, SpringLayout.NORTH, centerPanel);
	}
	
}
