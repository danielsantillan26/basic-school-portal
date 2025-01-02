package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel4CreateUsers extends JPanel {

	private static final long serialVersionUID = 1L;
	
	
	public Panel4CreateUsers() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelRegisterHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("CREATE_USERS_HEADER.png")));
		northPanel.add(labelRegisterHeader);
		
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	private void createCenterPanel() {
		
	}
	
}
