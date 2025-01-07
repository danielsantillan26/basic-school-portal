package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 * The Panel3Register class constructs the third page of the project. This page
 * encompasses the register section of the program, where new administrators can
 * enter their schools into the database.
 * 
 *  @author Daniel Santillan
 *  @version 1.0
 */
public class Panel3Register extends JPanel {

	/** Version */
	private static final long serialVersionUID = 1L;

	/** The page center */
	private JPanel centerPanel;
	/** The page center layout */
	private SpringLayout sl;

	/** A JLabel with the password if needed */
	private JLabel visiblePassword;
	/** A boolean determining whether the password is shown or not */
	private boolean isPasswordShown;

	/** A JTextField holding the proposed school name */
	private JTextField givenSchoolName;
	/** A JTextField holding the proposed admin username */
	private JTextField givenUsername;
	/** A JTextField holding the proposed admin first name */
	private JTextField givenFirstName;
	/** A JTextField holding the proposed admin last name */
	private JTextField givenLastName;
	/** A JTextField holding the proposed admin password */
	private JPasswordField givenPassword;


	/**
	 * Constructs the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel3Register() {
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

		JLabel labelRegisterHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("REGISTER_HEADER.png")));
		northPanel.add(labelRegisterHeader);

		add(northPanel, BorderLayout.NORTH);
	}


	/**
	 * Constructs the center portion of the panel. In this case, prompts asking
	 * for the proposed school name, admin username, admin first and last name,
	 * and admin password are made. Additionally, a button to show or hide the
	 * password is added.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);

		JLabel enterSchoolName = new JLabel("Enter School Name:");
		enterSchoolName.setFont(GraphicsConstants.montserratBold50);

		givenSchoolName = new JTextField();
		givenSchoolName.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenSchoolName.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenSchoolName.setFont(GraphicsConstants.montserratBold30);

		JLabel enterUsername = new JLabel("Enter Username:");
		enterUsername.setFont(GraphicsConstants.montserratBold50);

		givenUsername = new JTextField();
		givenUsername.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenUsername.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenUsername.setFont(GraphicsConstants.montserratBold30);

		JLabel enterFirstName = new JLabel("Enter First Name:");
		enterFirstName.setFont(GraphicsConstants.montserratBold50);

		givenFirstName = new JTextField();
		givenFirstName.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenFirstName.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenFirstName.setFont(GraphicsConstants.montserratBold30);

		JLabel enterLastName = new JLabel("Enter Last Name:");
		enterLastName.setFont(GraphicsConstants.montserratBold50);

		givenLastName = new JTextField();
		givenLastName.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenLastName.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenLastName.setFont(GraphicsConstants.montserratBold30);

		JLabel enterPassword = new JLabel("Enter Password:");
		enterPassword.setFont(GraphicsConstants.montserratBold50);

		givenPassword = new JPasswordField();
		givenPassword.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenPassword.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenPassword.setFont(GraphicsConstants.montserratBold30);

		visiblePassword = new JLabel();
		visiblePassword.setFont(GraphicsConstants.montserratBold15);

		JButton showHidePassword = new JButton("Show/Hide Password");
		showHidePassword.setPreferredSize(new Dimension(500, 45));
		showHidePassword.setFont(GraphicsConstants.montserratBold30);
		isPasswordShown = false;
		showHidePassword.addActionListener(new ActionListener() {

			/**
			 * Invoked when one asks to show or hide the password.
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				String textVisiblePassword = String.valueOf(givenPassword.getPassword());

				if (isPasswordShown) {
					visiblePassword.setText("");
					isPasswordShown = false;
				} else {
					visiblePassword.setText(textVisiblePassword);
					isPasswordShown = true;
				}

			}

		});

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
		centerPanel.add(visiblePassword);

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
		sl.putConstraint(SpringLayout.WEST, showHidePassword, 425, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, showHidePassword, 600, SpringLayout.NORTH,centerPanel);
		sl.putConstraint(SpringLayout.WEST, visiblePassword, 0, SpringLayout.WEST, givenPassword);
		sl.putConstraint(SpringLayout.NORTH, visiblePassword, 550, SpringLayout.NORTH, centerPanel);


		add(centerPanel, BorderLayout.CENTER);
	}


	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class. 
	 * 
	 * @param create a button to create a user
	 * @param goHome a button to return to the homepage
	 */
	public void addChangePageButtons(JButton create, JButton goHome) {
		centerPanel.add(create);
		centerPanel.add(goHome);

		sl.putConstraint(SpringLayout.WEST, create, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, create, 600, SpringLayout.NORTH, centerPanel);

		sl.putConstraint(SpringLayout.NORTH, goHome, 600, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, goHome, 950, SpringLayout.WEST, centerPanel);
	}


	/**
	 * Returns the contents of the text fields containing the school name, admin
	 * username, admin first and last name, and admin password. To be used by the 
	 * Frame class to send login information to the FileManagement class once the
	 * register button is pressed.
	 * 
	 * @return a String array of size 5 with the school name and the administrator's
	 * information
	 */
	public String[] obtainInformation() {
		String[] information = new String[5];
		information[0] = givenSchoolName.getText();
		information[1] = givenUsername.getText();
		information[2] = givenFirstName.getText();
		information[3] = givenLastName.getText();
		information[4] = String.valueOf(givenPassword.getPassword());
		return information;

	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel3Register [centerPanel=" + centerPanel + ", sl=" + sl + ", visiblePassword=" + visiblePassword
				+ ", isPasswordShown=" + isPasswordShown + ", givenSchoolName=" + givenSchoolName + ", givenUsername="
				+ givenUsername + ", givenFirstName=" + givenFirstName + ", givenLastName=" + givenLastName
				+ ", givenPassword=" + givenPassword + "]";
	}

}
