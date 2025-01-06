package users;

import java.util.ArrayList;
import classes.Class;
import school.School;

public class Student extends User {

	private ArrayList<Class> classes;
	
	
	public Student(String firstName, String lastName, String username, String password, School school) {
		super(firstName, lastName, username, password, school);
	}
	
	
	
	@Override
	public boolean isStudent() {
		return true;
	}
	
	
	
}
