package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
 * The Panel2Login class constructs the second page of the project. This page
 * encompasses the login portion of the program, allowing users to log in to
 * existing accounts.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel2Login extends JPanel {

	/** Version */
	private static final long serialVersionUID = 1L;

	/** The page center */
	private JPanel centerPanel;
	/** The page center layout */
	private SpringLayout sl;

	/** A boolean determining whether the password is shown or not */
	private boolean isPasswordShown;
	/** A JLabel with the password if needed */
	private JLabel visiblePassword;
	/** A JTextField holding the given username */
	private JTextField givenUsername;
	/** A JPasswordField holding the password */
	private JPasswordField givenPassword;
	/** A JLabel holding a message if the login fails */
	private JLabel failed;


	/**
	 * Constructs the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel2Login() {
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

		JLabel labelLoginHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("LOGIN_HEADER.png")));
		northPanel.add(labelLoginHeader);

		add(northPanel, BorderLayout.NORTH);
	}

	/**
	 * Constructs the center portion of the panel. In this case, a prompt asking
	 * for a username and password, along with text boxes for users to answer
	 * the prompts, are added. Other buttons are added as well.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);

		JLabel enterUsername = new JLabel("Enter username:");
		enterUsername.setFont(GraphicsConstants.montserratBold50);

		givenUsername = new JTextField();
		givenUsername.setMinimumSize(GraphicsConstants.textFieldDimension);
		givenUsername.setPreferredSize(GraphicsConstants.textFieldDimension);
		givenUsername.setFont(GraphicsConstants.montserratBold30);

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

		failed = new JLabel();
		failed.setFont(GraphicsConstants.montserratBold30);
		failed.setForeground(Color.RED);

		centerPanel.add(enterUsername);
		centerPanel.add(givenUsername);
		centerPanel.add(enterPassword);
		centerPanel.add(givenPassword);
		centerPanel.add(visiblePassword);
		centerPanel.add(showHidePassword);
		centerPanel.add(failed);

		sl.putConstraint(SpringLayout.WEST, enterUsername, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterUsername, 100, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenUsername, 150, SpringLayout.EAST, enterUsername);
		sl.putConstraint(SpringLayout.NORTH, givenUsername, 100, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, enterPassword, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterPassword, 300, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenPassword, 150, SpringLayout.EAST, enterPassword);
		sl.putConstraint(SpringLayout.NORTH, givenPassword, 300, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, visiblePassword, 0, SpringLayout.WEST, givenPassword);
		sl.putConstraint(SpringLayout.NORTH, visiblePassword, 400, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, showHidePassword, 400, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, showHidePassword, 500, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, failed, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, failed, 420, SpringLayout.NORTH, centerPanel);

		add(centerPanel, BorderLayout.CENTER);


	}


	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class.
	 * 
	 * @param login	a button to log in
	 * @param goHome a button to go back to the home page
	 */
	public void addChangePageButtons(JButton login, JButton goHome) {
		centerPanel.add(login);
		centerPanel.add(goHome);

		sl.putConstraint(SpringLayout.WEST, login, 150, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, login, 500, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, goHome, 500, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, goHome, 950, SpringLayout.WEST, centerPanel);
	}


	/**
	 * Returns the contents of the text fields containing the username and
	 * password. To be used by the Frame class to send login information to the
	 * FileManagement class once the login button is pressed.
	 * 
	 * @return a String array of size 2 with the username and password
	 */
	public String[] obtainInformation() {
		String[] information = new String[2];
		information[0] = givenUsername.getText();
		information[1] = String.valueOf(givenPassword.getPassword());
		return information;
	}


	/**
	 * Sets a failed message if the login fails.
	 */
	public void failed() {
		failed.setText("Username or password incorrect.");
	}


	/**
	 * Resets the failed message if the login works.
	 */
	public void resetFailed() {
		failed.setText("");
	}


	/**
	 * This is the toString method for this class.
	 */                                         
	@Override
	public String toString() {
		return "Panel2Login [centerPanel=" + centerPanel + ", sl=" + sl + ", isPasswordShown=" + isPasswordShown
				+ ", visiblePassword=" + visiblePassword + ", givenUsername=" + givenUsername + ", givenPassword="
				+ givenPassword + ", failed=" + failed + "]";
	}
}
