package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import files.FileManagement;

/**
 * The Panel4CreateUsers page constructs the fourth page of the project. This
 * page encompasses the user creation portion of the program, meant to be used
 * by administrators when creating teacher and student accounts.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Panel4CreateUsers extends JPanel {

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

	/** A JComboBox holding the type of accounts to be made */
	private JComboBox<String> givenAccountType;
	/** A JTextField holding the given username */
	private JTextField givenUsername;
	/** A JTextField holding the given first name */
	private JTextField givenFirstName;
	/** A JTextField holding the given last name */
	private JTextField givenLastName;
	/** A JTextField holding the given password */
	private JPasswordField givenPassword;


	/**
	 * Constructs the JPanel, adding the buttons and title
	 * graphics.
	 */
	public Panel4CreateUsers() {
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

		JLabel labelRegisterHeader = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("CREATE_USER_HEADER.png")));
		northPanel.add(labelRegisterHeader);

		add(northPanel, BorderLayout.NORTH);
	}


	/**
	 * Constructs the center portion of the panel. In this case, prompts to enter
	 * the type of user, the user's username, first name, last name, and password
	 * are made, along with a show/hide password function if necessary.
	 */
	private void createCenterPanel() {
		sl = new SpringLayout();
		centerPanel = new JPanel(sl);
		centerPanel.setBackground(GraphicsConstants.centerColor);

		JLabel enterAccountType = new JLabel("Enter Account Type:");
		enterAccountType.setFont(GraphicsConstants.montserratBold50);

		givenAccountType = new JComboBox<String>();
		givenAccountType.addItem("Student");
		givenAccountType.addItem("Teacher");
		givenAccountType.addItem("Administrator");
		givenAccountType.setFont(GraphicsConstants.montserratBold30);

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

		visiblePassword = new JLabel("");
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

		JButton create = new JButton("Add User");
		create.setFont(GraphicsConstants.montserratBold30);
		create.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String[] information = new String[4];
				information[0] = givenUsername.getText();
				information[1] = givenFirstName.getText();
				information[2] = givenLastName.getText();
				information[3] = String.valueOf(givenPassword.getPassword());

				if (givenAccountType.getSelectedItem().equals("Student")) {
					FileManagement.addStudent(information);
				} else if (givenAccountType.getSelectedItem().equals("Teacher")) {
					FileManagement.addTeacher(information);
				} else if (givenAccountType.getSelectedItem().equals("Administrator")) {
					FileManagement.addAdmin(information);
				}

				givenUsername.setText("");
				givenFirstName.setText("");
				givenLastName.setText("");
				givenPassword.setText("");

			}

		});

		centerPanel.add(enterAccountType);
		centerPanel.add(givenAccountType);
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
		centerPanel.add(create);

		sl.putConstraint(SpringLayout.WEST, enterAccountType, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, enterAccountType, 50, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, givenAccountType, 70, SpringLayout.EAST, enterAccountType);
		sl.putConstraint(SpringLayout.NORTH, givenAccountType, 50, SpringLayout.NORTH, centerPanel);
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
		sl.putConstraint(SpringLayout.WEST, showHidePassword, 325, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, showHidePassword, 600, SpringLayout.NORTH,centerPanel);
		sl.putConstraint(SpringLayout.WEST, visiblePassword, 0, SpringLayout.WEST, givenPassword);
		sl.putConstraint(SpringLayout.NORTH, visiblePassword, 550, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, create, 100, SpringLayout.WEST, centerPanel);
		sl.putConstraint(SpringLayout.NORTH, create, 600, SpringLayout.NORTH, centerPanel);


		add(centerPanel, BorderLayout.CENTER);
	}


	/**
	 * Adds buttons that change pages to the JPanel. These buttons were originally
	 * created in the Frame class.
	 *
	 * @param goHome a button that returns to the admin homepage
	 */
	public void addChangePageButtons(JButton goHome) {
		centerPanel.add(goHome);

		sl.putConstraint(SpringLayout.NORTH, goHome, 600, SpringLayout.NORTH, centerPanel);
		sl.putConstraint(SpringLayout.WEST, goHome, 835, SpringLayout.WEST, centerPanel);
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Panel4CreateUsers [centerPanel=" + centerPanel + ", sl=" + sl + ", isPasswordShown=" + isPasswordShown
				+ ", visiblePassword=" + visiblePassword + ", givenAccountType=" + givenAccountType + ", givenUsername="
				+ givenUsername + ", givenFirstName=" + givenFirstName + ", givenLastName=" + givenLastName
				+ ", givenPassword=" + givenPassword + "]";
	}

}
