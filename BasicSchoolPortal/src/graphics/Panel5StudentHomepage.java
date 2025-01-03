package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel5StudentHomepage extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel centerPanel;
	
	
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
		centerPanel = new JPanel();
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		add(centerPanel, BorderLayout.CENTER);
	}

}
