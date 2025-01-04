package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class Panel9TeacherHomepage extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel centerPanel;
	private SpringLayout sl;
	
	public Panel9TeacherHomepage() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelStudentGrades = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("TEACHER_HOME_HEADER.png")));
		northPanel.add(labelStudentGrades);
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		JLabel classList = new JLabel("Your classes");
		classList.setFont(GraphicsConstants.montserratBold50);
		
		
		centerPanel.add(classList);
		
		sl.putConstraint(SpringLayout.WEST, classList, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, classList, 50, SpringLayout.NORTH, centerPanel);
		
		add(centerPanel, BorderLayout.CENTER);
	}
	
	
	public void addChangePageButtons(JButton grader, JButton messageEdits, JButton rosters) {
		
	}
	
}
