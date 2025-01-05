package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class Panel13AdminHomepage extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	private SpringLayout sl;
	
	public Panel13AdminHomepage() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelAdminHome = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("ADMIN_HOME_HEADER.png")));
		northPanel.add(labelAdminHome);
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		add(centerPanel, BorderLayout.CENTER);
	}
	
	
	public void addChangePageButtons(JButton userCreation, JButton classCreation, JButton teacherAssignments, JButton studentAssignments) {
		centerPanel.add(userCreation);
		centerPanel.add(classCreation);
		centerPanel.add(teacherAssignments);
		centerPanel.add(studentAssignments);
		
		sl.putConstraint(SpringLayout.WEST, userCreation, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, userCreation, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, classCreation, 550, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, classCreation, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, teacherAssignments, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, teacherAssignments, 300, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, studentAssignments, 550, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, studentAssignments, 300, SpringLayout.NORTH, centerPanel);
		
	}
	
}
