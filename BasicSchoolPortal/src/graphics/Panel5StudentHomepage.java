package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class Panel5StudentHomepage extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel centerPanel;
	private SpringLayout sl;
	
	public Panel5StudentHomepage() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelStudentHomeHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("STUDENT_HOME_HEADER.png")));
		northPanel.add(labelStudentHomeHeader);
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
	
	
	public void addChangePageButtons(JButton viewGrades, JButton gradingSim, JButton viewClassmates) {
		centerPanel.add(viewGrades);
		centerPanel.add(gradingSim);
		centerPanel.add(viewClassmates);
		
		sl.putConstraint(SpringLayout.WEST, viewGrades, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, viewGrades, 550, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, gradingSim, 425, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, gradingSim, 550, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, viewClassmates, 825, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, viewClassmates, 550, SpringLayout.NORTH, centerPanel);
	}

}
