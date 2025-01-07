package users;

import java.util.ArrayList;
import classes.Class;
import school.School;

public class Student extends User {

	private ArrayList<Class> classes;
	
	
	public Student(String firstName, String lastName, String username, String password, School school) {
		super(firstName, lastName, username, password, school);
	}
	
	public Student(String firstName, String lastName, String username, String password, School school, int id) {
		super(firstName, lastName, username, password, school, id);
	}
	
	
	public void addClass(Class c) {
		classes.add(c);
	}
	
	
	
	@Override
	public boolean isStudent() {
		return true;
	}
	
	
	
}
