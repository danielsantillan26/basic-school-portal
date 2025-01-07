package users;

import java.util.ArrayList;

import classes.Class;
import school.School;

/**
 * The Teacher class is a class that represents a teacher. This class
 * maintains values that are essential to a teacher: name, username, password,
 * school affiliation, and ID.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Teacher extends User {

	/**
	 * Constructs a Teacher with first name, last name, username, password,
	 * school, and a randomly assigned ID. 
	 * 
	 * @param firstName user's first name
	 * @param lastName user's last name
	 * @param username user's username
	 * @param password user's password
	 * @param school user's school affiliation
	 */
	public Teacher(String firstName, String lastName, String username, String password, School school) {
		super(firstName, lastName, username, password, school);
	}
	
	
	/**
	 * Constructs a Teacher with first name, last name, username, password,
	 * school, and an ID. Meant to be for users collected from the database.
	 * 
	 * @param firstName user's first name
	 * @param lastName user's last name
	 * @param username user's username
	 * @param password user's password
	 * @param school user's school affiliation
	 * @param id user's id
	 */
	public Teacher(String firstName, String lastName, String username, String password, School school, int id) {
		super(firstName, lastName, username, password, school, id);
	}
	
	
	/**
	 * Adds a teacher to the student's list of classes
	 * 
	 * @param c the class to be added
	 */
	public void addClass(Class c) {
		super.classes.add(c);
	}
	
	
	/**
	 * An overridden method to determine whether the user is a teacher. In
	 * this case, it is returned true.
	 * 
	 * @return whether the user is a teacher or not
	 */
	@Override
	public boolean isTeacher() {
		return true;
	}

	
	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Teacher []";
	}
}
