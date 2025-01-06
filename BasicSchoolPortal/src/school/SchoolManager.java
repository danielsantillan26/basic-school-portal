package school;

import java.util.ArrayList;

import users.Admin;
import users.Student;
import users.Teacher;
import users.User;

public class SchoolManager {

	private static ArrayList<School> schools;
	
	public SchoolManager() {
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
	
	
	public static ArrayList<School> getSchools() {
		return schools;
	}

}
