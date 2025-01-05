package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Panel14AdminClassCreation extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel centerPanel;
	private SpringLayout sl;
	
	
	public Panel14AdminClassCreation() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelAdminClassCreation = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("ADMIN_CLASS_CREATION_HEADER.png")));
		northPanel.add(labelAdminClassCreation);
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		JLabel enterClassName = new JLabel("Enter New Class Name");
		enterClassName.setFont(GraphicsConstants.montserratBold50);
		
		JTextField givenClassName = new JTextField();
		givenClassName.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenClassName.setFont(GraphicsConstants.montserratBold30);
		
		JButton enterInformation = new JButton("Confirm");
		enterInformation.setFont(GraphicsConstants.montserratBold30);
		
		centerPanel.add(enterClassName);
		centerPanel.add(givenClassName);
		centerPanel.add(enterInformation);
		
		sl.putConstraint(SpringLayout.WEST, enterClassName, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterClassName, 75, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenClassName, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, givenClassName, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterInformation, 75, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterInformation, 550, SpringLayout.NORTH, centerPanel);
		
		add(centerPanel, BorderLayout.CENTER);
	}
	
	
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		
		sl.putConstraint(SpringLayout.WEST, goHome, 300, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 550, SpringLayout.NORTH, centerPanel);
	}
	
}
