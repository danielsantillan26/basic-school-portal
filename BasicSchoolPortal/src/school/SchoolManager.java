package school;

import java.util.ArrayList;

import users.Admin;
import users.Student;
import users.Teacher;
import users.User;

public class SchoolManager {

	private static ArrayList<School> schools;

	public static void setup() {
		schools = new ArrayList<School>();
	}


	public static int addSchool(School s) {
		schools.add(s);
		return s.getID();
	}


	public static School searchByID(int id) {
		for (School s : schools) {
			if (s.getID() == id) {
				return s;
			}
		}

		return null;
	}


	public static User login(String username, String password) {
		User proposedUser = searchUser(username);
		
		if (proposedUser == null) {
			return null;
		} else {
			if (proposedUser.getPassword().equals(password)) {
				return proposedUser;
			} else {
				return null;
			}
		}
		
	}


	private static User searchUser(String username) {
		for (School s : schools) {
			for (Admin a : s.getAdmins()) {
				if (a.getUsername() == username) {
					return a;
				}
			}

			for (Teacher t : s.getTeachers()) {
				if (t.getUsername() == username) {
					return t;
				}
			}

			for (Student st : s.getStudents()) {
				if (st.getUsername() == username) {
					return st;
				}
			}
		}

		return null;
	}

}
