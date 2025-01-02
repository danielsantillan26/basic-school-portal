package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Panel2Login extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel centerPanel;
	private SpringLayout sl;
	private JLabel visiblePassword;
	
	
	public Panel2Login() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelLoginHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("LOGIN_HEADER.png")));
		northPanel.add(labelLoginHeader);
		
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		JLabel enterUsername = new JLabel("Enter username:");
		enterUsername.setFont(GraphicsConstants.montserratBold50);
		
		JTextField givenUsername = new JTextField();
		givenUsername.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenUsername.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenUsername.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterPassword = new JLabel("Enter Password:");
		enterPassword.setFont(GraphicsConstants.montserratBold50);
		
		JPasswordField givenPassword = new JPasswordField();
		givenPassword.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenPassword.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenPassword.setFont(GraphicsConstants.montserratBold30);
		
		visiblePassword = new JLabel();
		visiblePassword.setFont(GraphicsConstants.montserratBold30);
		
		JButton enterInformation = new JButton("Login");
		enterInformation.setPreferredSize(new Dimension(200, 45));
		enterInformation.setFont(GraphicsConstants.montserratBold30);
		
		JButton showHidePassword = new JButton("Show/Hide Password");
		showHidePassword.setPreferredSize(new Dimension(500, 45));
		showHidePassword.setFont(GraphicsConstants.montserratBold30);
		
		JLabel failed = new JLabel();
		failed.setFont(GraphicsConstants.montserratBold30);
		failed.setForeground(Color.RED);
		
		centerPanel.add(enterUsername);
		centerPanel.add(givenUsername);
		centerPanel.add(enterPassword);
		centerPanel.add(givenPassword);
		centerPanel.add(visiblePassword);
		centerPanel.add(enterInformation);
		centerPanel.add(showHidePassword);
		centerPanel.add(failed);
		
		sl.putConstraint(SpringLayout.WEST, enterUsername, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterUsername, 100, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenUsername, 100, SpringLayout.EAST, enterUsername);
		sl.putConstraint(SpringLayout.NORTH, givenUsername, 100, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterPassword, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterPassword, 300, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenPassword, 100, SpringLayout.EAST, enterPassword);
		sl.putConstraint(SpringLayout.NORTH, givenPassword, 300, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, visiblePassword, 100, SpringLayout.EAST, enterPassword);
		sl.putConstraint(SpringLayout.NORTH, visiblePassword, 225, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterInformation, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterInformation, 500, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, showHidePassword, 400, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, showHidePassword, 500, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, failed, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, failed, 420, SpringLayout.NORTH, centerPanel);
		
		add(centerPanel, BorderLayout.CENTER);
		
		
	}
	
	
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		sl.putConstraint(SpringLayout.NORTH, goHome, 500, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, goHome, 950, SpringLayout.WEST, centerPanel);
	}
	
}
