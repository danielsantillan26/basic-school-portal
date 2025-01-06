package users;

import java.util.ArrayList;

import classes.Class;
import school.School;

public class Teacher extends User {

	private ArrayList<Class> classes;
	
	public Teacher(String firstName, String lastName, String username, String password, School school) {
		super(firstName, lastName, username, password, school);
	}
	
	
	
	@Override
	public boolean isTeacher() {
		return true;
	}
	
	
}
