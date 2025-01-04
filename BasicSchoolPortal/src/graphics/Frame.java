package graphics;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Daniel Santillan
 */
public class Frame extends JFrame {

	/** Version */
	private static final long serialVersionUID = 1L;
	/** Container for the card layout */
	private Container container;
	/** Card layout that holds all the JPanels together and allows for the
	 * 	interchanging of pages
	 */
	private CardLayout cl;


	/**
	 * 
	 */
	public Frame() {
		setTitle("Basic School Portal");
		Dimension x = Toolkit.getDefaultToolkit().getScreenSize();
		int length = x.width;
		int width = x.height;
		setSize(length, width);
		setExtendedState(JFrame. MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(true);	
		setFocusable(true);

		cl = new CardLayout();
		container = getContentPane();
		container.setLayout(cl);
		prepareCardLayout();
	}



	private void prepareCardLayout() {
		Panel1Introduction panelIntro = new Panel1Introduction();
		Panel2Login panelLogin = new Panel2Login();
		Panel3Register panelRegister = new Panel3Register();
		Panel4CreateUsers panelCreateUsers = new Panel4CreateUsers();
		Panel5StudentHomepage panelStudentHomepage = new Panel5StudentHomepage();
		Panel6StudentGrades panelStudentGrades = new Panel6StudentGrades();
		Panel7StudentGradeSim panelStudentGradeSim = new Panel7StudentGradeSim();
		Panel8StudentRosters panelStudentRosters = new Panel8StudentRosters();
		Panel9TeacherHomepage panelTeacherHomepage = new Panel9TeacherHomepage();
		Panel10TeacherGrader panelTeacherGrader = new Panel10TeacherGrader();
		Panel11TeacherMessageEdits panelTeacherMessageEdits = new Panel11TeacherMessageEdits();
		Panel12TeacherRosters panelTeacherRosters = new Panel12TeacherRosters();
		Panel13AdminHomepage panelAdminHomepage = new Panel13AdminHomepage();
		Panel14AdminClassCreation panelAdminClassCreation = new Panel14AdminClassCreation();
		Panel15AdminTeacherAssignments panelAdminTeacherAssignments = new Panel15AdminTeacherAssignments();
		Panel16AdminStudentAssignments panelAdminStudentAssignments = new Panel16AdminStudentAssignments();

		JButton buttonPanelIntroRegister = new JButton(new ImageIcon(getClass().getClassLoader().getResource("REGISTER.png")));
		buttonPanelIntroRegister.setBorder(null);
		buttonPanelIntroRegister.setOpaque(false);
		buttonPanelIntroRegister.setContentAreaFilled(false);
		buttonPanelIntroRegister.setBorderPainted(false);

		JButton buttonPanelIntroLogin = new JButton(new ImageIcon(getClass().getClassLoader().getResource("LOGIN.png")));
		buttonPanelIntroLogin.setBorder(null);
		buttonPanelIntroLogin.setOpaque(false);
		buttonPanelIntroLogin.setContentAreaFilled(false);
		buttonPanelIntroLogin.setBorderPainted(false);

		Dimension dimensionButtonReturn = new Dimension(220, 45);

		JButton buttonPanelLoginLogin = new JButton("Login");
		buttonPanelLoginLogin.setPreferredSize(new Dimension(200, 45));
		buttonPanelLoginLogin.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelLoginReturn = new JButton("Return");
		buttonPanelLoginReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelLoginReturn.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelRegisterCreate = new JButton("Create Account");
		buttonPanelRegisterCreate.setPreferredSize(new Dimension(300, 45));
		buttonPanelRegisterCreate.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelRegisterReturn = new JButton("Return");
		buttonPanelRegisterReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelRegisterReturn.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelCreateUsersAdd = new JButton("Add User");
		buttonPanelCreateUsersAdd.setPreferredSize(dimensionButtonReturn);
		buttonPanelCreateUsersAdd.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelCreateUsersReturn = new JButton("Admin Homepage");
		buttonPanelCreateUsersReturn.setPreferredSize(new Dimension(320, 45));
		buttonPanelCreateUsersReturn.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelStudentHomepageViewGrades = new JButton("View Grades");
		buttonPanelStudentHomepageViewGrades.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelStudentHomepageGradingSim = new JButton("Grading Simulator");
		buttonPanelStudentHomepageGradingSim.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelStudentHomepageViewClass = new JButton("View Rosters");
		buttonPanelStudentHomepageViewClass.setFont(GraphicsConstants.montserratBold30);
		
		JButton buttonPanelStudentGradesReturn = new JButton("Return");
		buttonPanelStudentGradesReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelStudentGradesReturn.setFont(GraphicsConstants.montserratBold30);

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == buttonPanelIntroRegister) {
					cl.next(container);
					cl.next(container);
				} else if (e.getSource() == buttonPanelIntroLogin) {
					cl.next(container);
				} else if (e.getSource() == buttonPanelLoginReturn || 
						e.getSource() == buttonPanelRegisterReturn) {
					cl.first(container);
				} else if (e.getSource() == buttonPanelRegisterCreate) {
					cl.next(container);
				} else if (e.getSource() == buttonPanelLoginLogin) {
					int test = 0;
					if (test == 0) {
						cl.next(container);
						cl.next(container);
						cl.next(container);
					} else if (test == 1) {

					} else if (test == 2) {

					}
				} else if (e.getSource() == buttonPanelStudentHomepageViewGrades) {
					cl.next(container);
				} else if (e.getSource() == buttonPanelStudentHomepageGradingSim) {
					cl.next(container);
					cl.next(container);
				} else if (e.getSource() == buttonPanelStudentHomepageViewClass) {
					cl.next(container);
					cl.next(container);
					cl.next(container);
				} else if (e.getSource() == buttonPanelStudentGradesReturn) {
					cl.previous(container);
				}
			}
		};

		buttonPanelIntroRegister.addActionListener(al);
		buttonPanelIntroLogin.addActionListener(al);
		buttonPanelLoginLogin.addActionListener(al);
		buttonPanelLoginReturn.addActionListener(al);
		buttonPanelRegisterCreate.addActionListener(al);
		buttonPanelRegisterReturn.addActionListener(al);
		buttonPanelCreateUsersAdd.addActionListener(al);
		buttonPanelCreateUsersReturn.addActionListener(al);
		buttonPanelStudentHomepageViewGrades.addActionListener(al);
		buttonPanelStudentHomepageGradingSim.addActionListener(al);
		buttonPanelStudentHomepageViewClass.addActionListener(al);
		buttonPanelStudentGradesReturn.addActionListener(al);


		panelIntro.addChangePageButtons(buttonPanelIntroRegister, buttonPanelIntroLogin);
		panelLogin.addChangePageButtons(buttonPanelLoginLogin, buttonPanelLoginReturn);
		panelRegister.addChangePageButtons(buttonPanelRegisterCreate, buttonPanelRegisterReturn);
		panelCreateUsers.addChangePageButtons(buttonPanelCreateUsersAdd, buttonPanelCreateUsersReturn);
		panelStudentHomepage.addChangePageButtons(buttonPanelStudentHomepageViewGrades, buttonPanelStudentHomepageGradingSim, buttonPanelStudentHomepageViewClass);
		panelStudentGrades.addChangePageButtons(buttonPanelStudentGradesReturn);
		
		
		container.add(panelIntro);
		container.add(panelLogin);
		container.add(panelRegister);
		container.add(panelCreateUsers);
		container.add(panelStudentHomepage);
		container.add(panelStudentGrades);
		container.add(panelStudentGradeSim);
		container.add(panelStudentRosters);
		container.add(panelTeacherHomepage);
		container.add(panelTeacherGrader);
		container.add(panelTeacherMessageEdits);
		container.add(panelTeacherRosters);
		container.add(panelAdminHomepage);
		container.add(panelAdminClassCreation);
		container.add(panelAdminTeacherAssignments);
		container.add(panelAdminStudentAssignments);

	}

}
