package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import classes.Class;
import school.School;
import school.SchoolManager;
import users.Admin;
import users.Student;
import users.Teacher;
import users.User;

public class FileMaker {

	private static final String filename = "data.txt";
	private static File file;

	private static final char DELIMITER_SCHOOL = '校';
	private static final char DELIMITER_ADMIN = '头';
	private static final char DELIMITER_TEACHER = '生';
	private static final char DELIMITER_STUDENT = '师';
	private static final char DELIMITER_CLASS = '课';
	private static final char DELIMITER_END = '端';
	private static final char DELIMITER_CLASS_CLASS = '大';
	private static final char DELIMITER_CLASS_TEACHER = '张';
	private static final char DELIMITER_CLASS_STUDENT = '伟';
	private static final char DELIMITER_CLASS_END = '习';

	public static int currentSchoolID;
	private static SchoolManager sm;
	private static User loggedInUser;

	public static void setup() {
		file = new File(filename);
		sm = new SchoolManager();

		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		setupGroups();
	}


	public static void addSchool(String[] information) {
		try {
			FileWriter writer = new FileWriter(file, true);

			writer.write(DELIMITER_SCHOOL + "\n");
			writer.write(information[0] + "\n");

			int idInt = SchoolManager.addSchool(new School(information[0]));
			currentSchoolID = idInt;
			String id = Integer.toString(idInt);
			writer.write(id + "\n");

			writer.write("\n" + DELIMITER_ADMIN + "\n");
			writer.write("\n" + information[2] + "\n");
			writer.write(information[3] + "\n");
			writer.write(information[1] + "\n");
			writer.write(information[4] + "\n");

			Admin a = SchoolManager.searchByID(idInt).addAdmin(new Admin(information[2], information[3], information[1], information[4], SchoolManager.searchByID(idInt)));
			writer.write(a.getID() + "\n");

			writer.write("\n" + DELIMITER_TEACHER + "\n");
			writer.write("\n" + DELIMITER_STUDENT + "\n");
			writer.write("\n" + DELIMITER_CLASS + "\n");
			writer.write("\n" + DELIMITER_END + "\n");


			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void addAdmin(String[] information) {
		try {
			ArrayList<String> contents = readFile();

			int schoolIndex = -1;
			for (int i = 0; i < contents.size(); i++) {
				if (contents.get(i).equals(Integer.toString(currentSchoolID))) {
					schoolIndex = i;
				}
			}

			int writeAtIndex = -1;
			for (int j = schoolIndex; j < contents.size(); j++) {
				if (contents.get(j).equals(Character.toString(DELIMITER_TEACHER))) {
					writeAtIndex = j - 1;
					break;
				}
			}


			FileWriter writer = new FileWriter(file, false);
			BufferedWriter bWriter = new BufferedWriter(writer);

			for (int i = 0; i < writeAtIndex; i++) {
				bWriter.write(contents.get(i) + "\n");
			}

			bWriter.write("\n");
			bWriter.write(information[1] + "\n");
			bWriter.write(information[2] + "\n");
			bWriter.write(information[0] + "\n");
			bWriter.write(information[3] + "\n");

			Admin a = SchoolManager.searchByID(currentSchoolID).addAdmin(new Admin(information[1], information[2], information[0], information[3], SchoolManager.searchByID(currentSchoolID)));
			bWriter.write(a.getID() + "\n");

			for(int i = writeAtIndex; i < contents.size(); i++) {
				bWriter.write(contents.get(i) + "\n");
			}


			bWriter.close();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void addTeacher(String[] information) {
		try {
			ArrayList<String> contents = readFile();

			int schoolIndex = -1;
			for (int i = 0; i < contents.size(); i++) {
				if (contents.get(i).equals(Integer.toString(currentSchoolID))) {
					schoolIndex = i;
				}
			}

			int writeAtIndex = -1;
			for (int j = schoolIndex; j < contents.size(); j++) {
				if (contents.get(j).equals(Character.toString(DELIMITER_STUDENT))) {
					writeAtIndex = j - 1;
					break;
				}
			}


			FileWriter writer = new FileWriter(file, false);
			BufferedWriter bWriter = new BufferedWriter(writer);

			for (int i = 0; i < writeAtIndex; i++) {
				bWriter.write(contents.get(i) + "\n");
			}

			bWriter.write("\n");
			bWriter.write(information[1] + "\n");
			bWriter.write(information[2] + "\n");
			bWriter.write(information[0] + "\n");
			bWriter.write(information[3] + "\n");

			Teacher t = SchoolManager.searchByID(currentSchoolID).addTeacher(new Teacher(information[1], information[2], information[0], information[3], SchoolManager.searchByID(currentSchoolID)));
			bWriter.write(t.getID() + "\n");

			for(int i = writeAtIndex; i < contents.size(); i++) {
				bWriter.write(contents.get(i) + "\n");
			}


			bWriter.close();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public static void addStudent(String[] information) {
		try {
			ArrayList<String> contents = readFile();

			int schoolIndex = -1;
			for (int i = 0; i < contents.size(); i++) {
				if (contents.get(i).equals(Integer.toString(currentSchoolID))) {
					schoolIndex = i;
				}
			}

			int writeAtIndex = -1;
			for (int j = schoolIndex; j < contents.size(); j++) {
				if (contents.get(j).equals(Character.toString(DELIMITER_CLASS))) {
					writeAtIndex = j - 1;
					break;
				}
			}


			FileWriter writer = new FileWriter(file, false);
			BufferedWriter bWriter = new BufferedWriter(writer);

			for (int i = 0; i < writeAtIndex; i++) {
				bWriter.write(contents.get(i) + "\n");
			}

			bWriter.write("\n");
			bWriter.write(information[1] + "\n");
			bWriter.write(information[2] + "\n");
			bWriter.write(information[0] + "\n");
			bWriter.write(information[3] + "\n");

			Student s = SchoolManager.searchByID(currentSchoolID).addStudent(new Student(information[1], information[2], information[0], information[3], SchoolManager.searchByID(currentSchoolID)));
			bWriter.write(s.getID() + "\n");

			for(int i = writeAtIndex; i < contents.size(); i++) {
				bWriter.write(contents.get(i) + "\n");
			}

			bWriter.close();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static void addClass(String className) {
		try {
			ArrayList<String> contents = readFile();

			int schoolIndex = -1;
			for (int i = 0; i < contents.size(); i++) {
				if (contents.get(i).equals(Integer.toString(currentSchoolID))) {
					schoolIndex = i;
				}
			}

			int writeAtIndex = -1;
			for (int j = schoolIndex; j < contents.size(); j++) {
				if (contents.get(j).equals(Character.toString(DELIMITER_END))) {
					writeAtIndex = j - 1;
					break;
				}
			}

			FileWriter writer = new FileWriter(file, false);
			BufferedWriter bWriter = new BufferedWriter(writer);

			for (int i = 0; i < writeAtIndex; i++) {
				bWriter.write(contents.get(i) + "\n");
			}

			Class c = SchoolManager.searchByID(currentSchoolID).addClass(new Class(className));
			bWriter.write("\n" + DELIMITER_CLASS_CLASS + "\n");
			bWriter.write(c.getName() + "\n");
			bWriter.write("\n" + DELIMITER_CLASS_STUDENT + "\n");
			bWriter.write("\n" + DELIMITER_CLASS_TEACHER + "\n");
			bWriter.write("\n" + DELIMITER_CLASS_END + "\n");

			for(int i = writeAtIndex; i < contents.size(); i++) {
				bWriter.write(contents.get(i) + "\n");
			}

			bWriter.close();


		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static User login(String username, String password) {
		User proposedUser = searchUserByUsername(username);

		if (proposedUser == null) {
			return null;
		} else {
			if (proposedUser.getPassword().equals(password)) {
				currentSchoolID = proposedUser.getSchool().getID();
				loggedInUser = proposedUser;
				return proposedUser;
			} else {
				return null;
			}
		}

	}


	public static ArrayList<String> getStudentNames() {
		ArrayList<String> studentNames = new ArrayList<String>();

		ArrayList<Student> students = SchoolManager.searchByID(currentSchoolID).getStudents();
		for (Student s : students) {
			studentNames.add(s.getFirstName() + " " + s.getLastName());
		}

		return studentNames;
	}


	public static ArrayList<String> getTeacherNames() {
		ArrayList<String> teacherNames = new ArrayList<String>();

		ArrayList<Teacher> teachers = SchoolManager.searchByID(currentSchoolID).getTeachers();
		for (Teacher t : teachers) {
			teacherNames.add(t.getFirstName() + " " + t.getLastName());
		}

		return teacherNames;

	}


	public static ArrayList<String> getClassNames() {
		ArrayList<String> classNames = new ArrayList<String>();

		ArrayList<Class> classes = SchoolManager.searchByID(currentSchoolID).getClasses();
		for (Class c : classes) {
			classNames.add(c.getName());
		}

		return classNames;
	}
	
	
	public static ArrayList<String> getUserClasses() {
		ArrayList<String> classNames = new ArrayList<String>();
		
		ArrayList<Class> classes = loggedInUser.getClasses();
		for (Class c : classes) {
			classNames.add(c.getName());
		}
		
		return classNames;
	}
	


	public static void assignTeacherToClass(String className, String teacherName) {
		try {
			ArrayList<String> contents = readFile();

			int schoolIndex = -1;
			for (int i = 0; i < contents.size(); i++) {
				if (contents.get(i).equals(Integer.toString(currentSchoolID))) {
					schoolIndex = i;
					break;
				}
			}

			int classIndex = -1;
			for (int j = schoolIndex; j < contents.size(); j++) {
				if (contents.get(j).equals(className)) {
					classIndex = j - 1;
					break;
				}
			}
			

			int writeAtIndex = -1;
			for (int k = classIndex; k < contents.size(); k++) {
				if (contents.get(k).equals(Character.toString(DELIMITER_CLASS_TEACHER))) {
					writeAtIndex = k + 1;
					break;
				}
			}

			FileWriter writer = new FileWriter(file, false);
			BufferedWriter bWriter = new BufferedWriter(writer);

			for (int i = 0; i < writeAtIndex; i++) {
				bWriter.write(contents.get(i) + "\n");
			}
			
			User teacher = searchUserByName(teacherName);
			String id = Integer.toString(teacher.getID());
			SchoolManager.searchByID(currentSchoolID).searchClassByName(className).addTeacher(searchUserByName(teacherName));
			
			bWriter.write(id + "\n");
			

			for(int i = writeAtIndex; i < contents.size(); i++) {
				bWriter.write(contents.get(i) + "\n");
			}

			bWriter.close();


		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public static void assignStudentToClass(String className, String studentName) {
		try {
			ArrayList<String> contents = readFile();

			int schoolIndex = -1;
			for (int i = 0; i < contents.size(); i++) {
				if (contents.get(i).equals(Integer.toString(currentSchoolID))) {
					schoolIndex = i;
				}
			}

			int classIndex = -1;
			for (int j = schoolIndex; j < contents.size(); j++) {
				if (contents.get(j).equals(className)) {
					classIndex = j - 1;
					break;
				}
			}

			int writeAtIndex = -1;
			for (int k = classIndex; k < contents.size(); k++) {
				if (contents.get(k).equals(Character.toString(DELIMITER_CLASS_STUDENT))) {
					writeAtIndex = k + 1;
					break;
				}
			}

			FileWriter writer = new FileWriter(file, false);
			BufferedWriter bWriter = new BufferedWriter(writer);

			for (int i = 0; i < writeAtIndex; i++) {
				bWriter.write(contents.get(i) + "\n");
			}

			User student = searchUserByName(studentName);
			String id = Integer.toString(student.getID());
			SchoolManager.searchByID(currentSchoolID).searchClassByName(className).addTeacher(searchUserByName(studentName));
			
			bWriter.write(id + "\n");
			

			for(int i = writeAtIndex; i < contents.size(); i++) {
				bWriter.write(contents.get(i) + "\n");
			}

			bWriter.close();


		} catch (Exception e) {
			e.printStackTrace();
		}

	}




	public static User searchUserByUsername(String username) {

		for (School s : SchoolManager.getSchools()) {
			for (Admin a : s.getAdmins()) {
				if (a.getUsername().equals(username)) {
					return a;
				}
			}

			for (Teacher t : s.getTeachers()) {
				if (t.getUsername().equals(username)) {
					return t;
				}
			}

			for (Student st : s.getStudents()) {
				if (st.getUsername().equals(username)) {
					return st;
				}
			}
		}

		return null;
	}


	public static User searchUserByName(String name) {
		for (School s : SchoolManager.getSchools()) {
			for (Admin a : s.getAdmins()) {
				if ((a.getFirstName() + " " + a.getLastName()).equals(name)) {
					return a;
				}
			}

			for (Teacher t : s.getTeachers()) {
				if ((t.getFirstName() + " " + t.getLastName()).equals(name)) {
					return t;
				}
				for (Student st : s.getStudents()) {
					if ((st.getFirstName() + " " + st.getLastName()).equals(name)) {
						return st;
					}
				}
			}
		}

		return null;
	}




	public static Class searchClass(String className) {
		for (Class c : SchoolManager.searchByID(currentSchoolID).getClasses()) {
			if (c.getName().equals(className)) {
				return c;
			}
		}
		return null;
	}


	private static ArrayList<String> readFile() {
		ArrayList<String> contents = new ArrayList<String>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				contents.add(line);
			}
			reader.close();
		} catch (Exception e) {

		}

		return contents;
	}



	private static void setupGroups() {
		ArrayList<String> contents = readFile();

		if (contents == null) {
			return;
		}

		for (int i = 0; i < contents.size(); i++) {
			if (contents.get(i).equals(Character.toString(DELIMITER_SCHOOL))) {
				SchoolManager.addSchool(new School(contents.get(i + 1), Integer.parseInt(contents.get(i + 2))));
				currentSchoolID = Integer.parseInt(contents.get(i + 2));
			}

			if (contents.get(i).equals(Character.toString(DELIMITER_ADMIN))) {
				int lines = -1;
				for (int j = i; j < contents.indexOf(Character.toString(DELIMITER_TEACHER)); j++) {
					lines++;
				}

				i++;
				int numAdmins = lines/6;

				for (int k = 1; k <= numAdmins; k++) {
					String firstName = contents.get(i + 6*(k-1) + 1);
					String lastName = contents.get(i + 6*(k-1) + 2);
					String username = contents.get(i + 6*(k-1) + 3);
					String password = contents.get(i + 6*(k-1) + 4);

					int id = Integer.parseInt(contents.get(i + 6*(k-1) + 5));

					SchoolManager.searchByID(currentSchoolID).addAdmin(new Admin(firstName, lastName, username, password, SchoolManager.searchByID(currentSchoolID), id));
				}
			}

			if (contents.get(i).equals(Character.toString(DELIMITER_TEACHER))) {
				int lines = -1;
				for (int j = i; j < contents.indexOf(Character.toString(DELIMITER_STUDENT)); j++) {
					lines++;
				}

				i++;
				int numTeachers = lines/6;

				for (int k = 1; k <= numTeachers; k++) {
					String firstName = contents.get(i + 6*(k-1) + 1);
					String lastName = contents.get(i + 6*(k-1) + 2);
					String username = contents.get(i + 6*(k-1) + 3);
					String password = contents.get(i + 6*(k-1) + 4);
					int id = Integer.parseInt(contents.get(i + 6*(k-1) + 5));
					SchoolManager.searchByID(currentSchoolID).addTeacher(new Teacher(firstName, lastName, username, password, SchoolManager.searchByID(currentSchoolID), id));
				}
			}

			if (contents.get(i).equals(Character.toString(DELIMITER_STUDENT))) {
				int lines = -1;
				for (int j = i; j < contents.indexOf(Character.toString(DELIMITER_CLASS)); j++) {
					lines++;
				}

				i++;
				int numStudents = lines/6;

				for (int k = 1; k <= numStudents; k++) {
					String firstName = contents.get(i + 6*(k-1) + 1);
					String lastName = contents.get(i + 6*(k-1) + 2);
					String username = contents.get(i + 6*(k-1) + 3);
					String password = contents.get(i + 6*(k-1) + 4);
					int id = Integer.parseInt(contents.get(i + 6*(k-1) + 5));
					SchoolManager.searchByID(currentSchoolID).addStudent(new Student(firstName, lastName, username, password, SchoolManager.searchByID(currentSchoolID), id));
				}
			}

			if (contents.get(i).equals(Character.toString(DELIMITER_CLASS))) {
				int lines = -1;
				ArrayList<String> classStuff = new ArrayList<String>();

				for (int j = i; j < contents.indexOf(Character.toString(DELIMITER_END)); j++) {
					lines++;
					classStuff.add(contents.get(j));
				}


				for (int l = 0; l < classStuff.size(); l++) {
					String className = "";


					if (classStuff.get(l).equals(Character.toString(DELIMITER_CLASS_CLASS))) {
						SchoolManager.searchByID(currentSchoolID).addClass(new Class(classStuff.get(l + 1)));
						className = classStuff.get(l + 1);
					}

					if (classStuff.get(l).equals(DELIMITER_CLASS_STUDENT)) {
						for (int o = l; (o < classStuff.indexOf(Character.toString(DELIMITER_CLASS_TEACHER))); o++) {
							if (classStuff.get(o) != null && classStuff.get(o).strip() != "") {
								SchoolManager.searchByID(currentSchoolID).searchClassByName(className).addStudent(SchoolManager.searchByID(currentSchoolID).searchStudentByID(Integer.parseInt(classStuff.get(o))));
								SchoolManager.searchByID(currentSchoolID).searchStudentByID(Integer.parseInt(classStuff.get(o))).addClass(SchoolManager.searchByID(currentSchoolID).searchClassByName(className));
							}
						}
					}

					if (classStuff.get(l).equals(DELIMITER_CLASS_TEACHER)) {
						for (int o = l; (o < classStuff.indexOf(Character.toString(DELIMITER_CLASS_END))); o++) {
							if (classStuff.get(o) != null && classStuff.get(o).strip() != "") {
								SchoolManager.searchByID(currentSchoolID).searchClassByName(className).addTeacher(SchoolManager.searchByID(currentSchoolID).searchTeacherByID(Integer.parseInt(classStuff.get(o))));
								SchoolManager.searchByID(currentSchoolID).searchTeacherByID(Integer.parseInt(classStuff.get(o))).addClass(SchoolManager.searchByID(currentSchoolID).searchClassByName(className));
							}
						}
					}


					for (int n = 0; n < l; n++) {
						classStuff.set(n, null);
					}
				}



			}	

			for (int x = 0; x < i; x++) {
				contents.set(x, null);
			}

		}

	}

}
