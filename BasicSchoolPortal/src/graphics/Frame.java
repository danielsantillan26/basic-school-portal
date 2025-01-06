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
		Panel10BTeacherGrader panelTeacherGraderB = new Panel10BTeacherGrader();
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

		JButton buttonPanelStudentGradeSimReturn = new JButton("Return");
		buttonPanelStudentGradeSimReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelStudentGradeSimReturn.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelStudentRostersReturn = new JButton("Return");
		buttonPanelStudentRostersReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelStudentRostersReturn.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelTeacherHomepageGrader = new JButton("Grader");
		buttonPanelTeacherHomepageGrader.setPreferredSize(dimensionButtonReturn);
		buttonPanelTeacherHomepageGrader.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelTeacherHomepageEdits = new JButton("Edit Messages");
		buttonPanelTeacherHomepageEdits.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelTeacherHomepageViewClass = new JButton("View Rosters");
		buttonPanelTeacherHomepageViewClass.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelTeacherGraderReturn = new JButton("Return");
		buttonPanelTeacherGraderReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelTeacherGraderReturn.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelTeacherGraderGoToB = new JButton("Grade Assignments");
		buttonPanelTeacherGraderGoToB.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelTeacherGraderGoToA = new JButton("Add Assignments");
		buttonPanelTeacherGraderGoToA.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelTeacherGraderReturnB = new JButton("Return");
		buttonPanelTeacherGraderReturnB.setPreferredSize(dimensionButtonReturn);
		buttonPanelTeacherGraderReturnB.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelTeacherMessageEditsReturn = new JButton("Return");
		buttonPanelTeacherMessageEditsReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelTeacherMessageEditsReturn.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelTeacherRosterReturn = new JButton("Return");
		buttonPanelTeacherRosterReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelTeacherRosterReturn.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelAdminHomepageCreateUsers = new JButton("User Creation");
		buttonPanelAdminHomepageCreateUsers.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelAdminHomepageClassCreation = new JButton("Class Creation");
		buttonPanelAdminHomepageClassCreation.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelAdminHomepageTeacherAssignments = new JButton("Assign Teachers");
		buttonPanelAdminHomepageTeacherAssignments.setFont(GraphicsConstants.montserratBold30);

		JButton buttonPanelAdminHomepageStudentAssignments = new JButton("Assign Students");
		buttonPanelAdminHomepageStudentAssignments.setPreferredSize(new Dimension(400, 45));
		buttonPanelAdminHomepageStudentAssignments.setFont(GraphicsConstants.montserratBold30);
		
		JButton buttonPanelAdminClassCreationReturn = new JButton("Return");
		buttonPanelAdminHomepageStudentAssignments.setPreferredSize(dimensionButtonReturn);
		buttonPanelAdminClassCreationReturn.setFont(GraphicsConstants.montserratBold30);
		
		JButton buttonPanelAdminTeacherAssignmentsReturn = new JButton("Return");
		buttonPanelAdminTeacherAssignmentsReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelAdminTeacherAssignmentsReturn.setFont(GraphicsConstants.montserratBold30);
		
		JButton buttonPanelAdminStudentAssignmentsReturn = new JButton("Return");
		buttonPanelAdminStudentAssignmentsReturn.setPreferredSize(dimensionButtonReturn);
		buttonPanelAdminStudentAssignmentsReturn.setFont(GraphicsConstants.montserratBold30);


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
						int i = 0;
						while (i < 7) {
							cl.next(container);
							i++;
						}

					} else if (test == 2) {
						int i = 0;
						while (i < 12) {
							cl.next(container);
							i++;
						}
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
				} else if (e.getSource() == buttonPanelStudentGradeSimReturn) {
					cl.previous(container);
					cl.previous(container);
				} else if (e.getSource() == buttonPanelStudentRostersReturn) {
					cl.previous(container);
					cl.previous(container);
					cl.previous(container);
				} else if (e.getSource() == buttonPanelTeacherHomepageGrader) {
					cl.next(container);
				} else if (e.getSource() == buttonPanelTeacherHomepageEdits) {
					cl.next(container);
					cl.next(container);
					cl.next(container);
				} else if (e.getSource() == buttonPanelTeacherHomepageViewClass) {
					cl.next(container);
					cl.next(container);
					cl.next(container);
					cl.next(container);
				} else if (e.getSource() == buttonPanelTeacherGraderReturn) {
					cl.previous(container);
				} else if (e.getSource() == buttonPanelTeacherGraderGoToB) {
					cl.next(container);
				} else if (e.getSource() == buttonPanelTeacherGraderGoToA) {
					cl.previous(container);
				} else if (e.getSource() == buttonPanelTeacherGraderReturnB) {
					cl.previous(container);
					cl.previous(container);
				} else if (e.getSource() == buttonPanelTeacherMessageEditsReturn) {
					cl.previous(container);
					cl.previous(container);
					cl.previous(container);
				} else if (e.getSource() == buttonPanelTeacherRosterReturn) {
					cl.previous(container);
					cl.previous(container);
					cl.previous(container);
					cl.previous(container);
				} else if (e.getSource() == buttonPanelCreateUsersReturn) {
					for (int i = 0; i < 10; i++) {
						cl.next(container);
					}
				} else if (e.getSource() == buttonPanelAdminHomepageCreateUsers) {
					for (int i = 0; i < 11; i++) {
						cl.previous(container);
					}
				} else if (e.getSource() == buttonPanelAdminHomepageClassCreation) {
					cl.next(container);
				} else if (e.getSource() == buttonPanelAdminHomepageTeacherAssignments) {
					cl.next(container);
					cl.next(container);
				} else if (e.getSource() == buttonPanelAdminHomepageStudentAssignments) {
					cl.next(container);
					cl.next(container);
					cl.next(container);
				} else if (e.getSource() == buttonPanelAdminClassCreationReturn) {
					cl.previous(container);
				} else if (e.getSource() == buttonPanelAdminTeacherAssignmentsReturn) {
					cl.previous(container);
					cl.previous(container);
				} else if (e.getSource() == buttonPanelAdminStudentAssignmentsReturn) {
					cl.previous(container);
					cl.previous(container);
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
		buttonPanelStudentGradeSimReturn.addActionListener(al);
		buttonPanelStudentRostersReturn.addActionListener(al);
		buttonPanelTeacherHomepageGrader.addActionListener(al);
		buttonPanelTeacherHomepageEdits.addActionListener(al);
		buttonPanelTeacherHomepageViewClass.addActionListener(al);
		buttonPanelTeacherGraderReturn.addActionListener(al);
		buttonPanelTeacherGraderGoToB.addActionListener(al);
		buttonPanelTeacherGraderGoToA.addActionListener(al);
		buttonPanelTeacherGraderReturnB.addActionListener(al);
		buttonPanelTeacherMessageEditsReturn.addActionListener(al);
		buttonPanelTeacherRosterReturn.addActionListener(al);
		buttonPanelAdminHomepageCreateUsers.addActionListener(al);
		buttonPanelAdminHomepageClassCreation.addActionListener(al);
		buttonPanelAdminHomepageTeacherAssignments.addActionListener(al);
		buttonPanelAdminHomepageStudentAssignments.addActionListener(al);
		buttonPanelAdminClassCreationReturn.addActionListener(al);
		buttonPanelAdminTeacherAssignmentsReturn.addActionListener(al);
		buttonPanelAdminStudentAssignmentsReturn.addActionListener(al);


		panelIntro.addChangePageButtons(buttonPanelIntroRegister, buttonPanelIntroLogin);
		panelLogin.addChangePageButtons(buttonPanelLoginLogin, buttonPanelLoginReturn);
		panelRegister.addChangePageButtons(buttonPanelRegisterCreate, buttonPanelRegisterReturn);
		panelCreateUsers.addChangePageButtons(buttonPanelCreateUsersAdd, buttonPanelCreateUsersReturn);
		panelStudentHomepage.addChangePageButtons(buttonPanelStudentHomepageViewGrades, buttonPanelStudentHomepageGradingSim, buttonPanelStudentHomepageViewClass);
		panelStudentGrades.addChangePageButtons(buttonPanelStudentGradesReturn);
		panelStudentGradeSim.addChangePageButtons(buttonPanelStudentGradeSimReturn);
		panelStudentRosters.addChangePageButtons(buttonPanelStudentRostersReturn);
		panelTeacherHomepage.addChangePageButtons(buttonPanelTeacherHomepageGrader, buttonPanelTeacherHomepageEdits, buttonPanelTeacherHomepageViewClass);
		panelTeacherGrader.addChangePageButtons(buttonPanelTeacherGraderGoToB, buttonPanelTeacherGraderReturn);
		panelTeacherGraderB.addChangePageButtons(buttonPanelTeacherGraderGoToA, buttonPanelTeacherGraderReturnB);
		panelTeacherMessageEdits.addChangePageButtons(buttonPanelTeacherMessageEditsReturn);
		panelTeacherRosters.addChangePageButtons(buttonPanelTeacherRosterReturn);
		panelAdminHomepage.addChangePageButtons(buttonPanelAdminHomepageCreateUsers, buttonPanelAdminHomepageClassCreation, buttonPanelAdminHomepageTeacherAssignments, buttonPanelAdminHomepageStudentAssignments);
		panelAdminClassCreation.addChangePageButtons(buttonPanelAdminClassCreationReturn);
		panelAdminTeacherAssignments.addChangePageButtons(buttonPanelAdminTeacherAssignmentsReturn);
		panelAdminStudentAssignments.addChangePageButtons(buttonPanelAdminStudentAssignmentsReturn);
		

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
		container.add(panelTeacherGraderB);
		container.add(panelTeacherMessageEdits);
		container.add(panelTeacherRosters);
		container.add(panelAdminHomepage);
		container.add(panelAdminClassCreation);
		container.add(panelAdminTeacherAssignments);
		container.add(panelAdminStudentAssignments);

	}

}
