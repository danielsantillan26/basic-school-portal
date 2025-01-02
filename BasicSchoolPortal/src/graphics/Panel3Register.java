package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Panel3Register extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel centerPanel;
	private SpringLayout sl;
	private JLabel visiblePassword;
	
	
	public Panel3Register() {
		setLayout(new BorderLayout());
		createNorthPanel();
		createCenterPanel();
	}
	
	
	private void createNorthPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setBackground(GraphicsConstants.headerColor);
		northPanel.setPreferredSize(new Dimension(getWidth(), 75));
		
		JLabel labelRegisterHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("REGISTER_HEADER.png")));
		northPanel.add(labelRegisterHeader);
		
		add(northPanel, BorderLayout.NORTH);
	}
	
	
	
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);
		
		JLabel enterSchoolName = new JLabel("Enter School Name:");
		enterSchoolName.setFont(GraphicsConstants.montserratBold50);
		
		JTextField givenSchoolName = new JTextField();
		givenSchoolName.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenSchoolName.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenSchoolName.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterUsername = new JLabel("Enter Username:");
		enterUsername.setFont(GraphicsConstants.montserratBold50);
		
		JTextField givenUsername = new JTextField();
		givenUsername.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenUsername.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenUsername.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterFirstName = new JLabel("Enter First Name:");
		enterFirstName.setFont(GraphicsConstants.montserratBold50);
		
		JTextField givenFirstName = new JTextField();
		givenFirstName.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenFirstName.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenFirstName.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterLastName = new JLabel("Enter Last Name:");
		enterLastName.setFont(GraphicsConstants.montserratBold50);
		
		JTextField givenLastName = new JTextField();
		givenLastName.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenLastName.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenLastName.setFont(GraphicsConstants.montserratBold30);
		
		JLabel enterPassword = new JLabel("Enter Password:");
		enterPassword.setFont(GraphicsConstants.montserratBold50);
		
		JPasswordField givenPassword = new JPasswordField();
		givenPassword.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenPassword.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenPassword.setFont(GraphicsConstants.montserratBold30);
		
		JButton enterInformation = new JButton("Create Account");
		enterInformation.setPreferredSize(new Dimension(300, 45));
		enterInformation.setFont(GraphicsConstants.montserratBold30);
		
		JButton showHidePassword = new JButton("Show/Hide Password");
		showHidePassword.setPreferredSize(new Dimension(500, 45));
		showHidePassword.setFont(GraphicsConstants.montserratBold30);
		
		JLabel failed = new JLabel();
		failed.setFont(GraphicsConstants.montserratBold30);
		failed.setForeground(Color.RED);
		
		centerPanel.add(enterSchoolName);
		centerPanel.add(givenSchoolName);
		centerPanel.add(enterUsername);
		centerPanel.add(givenUsername);
		centerPanel.add(enterFirstName);
		centerPanel.add(givenFirstName);
		centerPanel.add(enterLastName);
		centerPanel.add(givenLastName);
		centerPanel.add(enterPassword);
		centerPanel.add(givenPassword);
		centerPanel.add(failed);
		centerPanel.add(showHidePassword);
		centerPanel.add(enterInformation);
		
		sl.putConstraint(SpringLayout.WEST, enterSchoolName, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterSchoolName, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenSchoolName, 70, SpringLayout.EAST, enterSchoolName);
		sl.putConstraint(SpringLayout.NORTH, givenSchoolName, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterUsername, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterUsername, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenUsername, 150, SpringLayout.EAST, enterUsername);
		sl.putConstraint(SpringLayout.NORTH, givenUsername, 150, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterFirstName, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterFirstName, 250, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenFirstName, 140, SpringLayout.EAST, enterFirstName);
		sl.putConstraint(SpringLayout.NORTH, givenFirstName, 250, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterLastName, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterLastName, 350, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenLastName, 150, SpringLayout.EAST, enterLastName);
		sl.putConstraint(SpringLayout.NORTH, givenLastName, 350, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterPassword, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterPassword, 450, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenPassword, 150, SpringLayout.EAST, enterPassword);
		sl.putConstraint(SpringLayout.NORTH, givenPassword, 450, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, failed, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, failed, 500, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterInformation, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterInformation, 600, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, showHidePassword, 25, SpringLayout.EAST, enterInformation);
		sl.putConstraint(SpringLayout.NORTH, showHidePassword, 600, SpringLayout.NORTH,centerPanel);
		
		
		add(centerPanel, BorderLayout.CENTER);
	}
	
	
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);
		sl.putConstraint(SpringLayout.NORTH, goHome, 600, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, goHome, 950, SpringLayout.WEST, centerPanel);
	}
	
}
