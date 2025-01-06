package users;

import java.util.ArrayList;

import classes.Class;
import school.School;

public class Teacher extends User {

	private ArrayList<Class> classes;
	
	public Teacher(String firstName, String lastName, String username, String password, School school) {
		super(firstName, lastName, username, password, school);
	}
	
	public Teacher(String firstName, String lastName, String username, String password, School school, int id) {
		super(firstName, lastName, username, password, school, id);
	}
	
	
	
	@Override
	public boolean isTeacher() {
		return true;
	}
	
	
}
