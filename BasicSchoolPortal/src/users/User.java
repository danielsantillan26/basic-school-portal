package users;

import java.util.ArrayList;

import classes.Class;
import school.School;

/**
 * The User class is a class that represents a user. This class
 * maintains values that are essential to a user: name, username, password,
 * school affiliation, ID, and a list of classes.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class User {
	
	/** The user's first name */
	private String firstName;
	/** The user's last name */
	private String lastName;
	/** The user's username */
	private String username;
	/** The user's password */
	private String password;
	/** The user's school affiliation */
	private School school;
	/** The user's id */
	private int id;
	/** The user's list of classes - protected to be edited by subclasses */
	protected ArrayList<Class> classes;
	
	
	/**
	 * Constructs a User with first name, last name, username, password,
	 * school, and a randomly assigned ID. 
	 * 
	 * @param firstName user's first name
	 * @param lastName user's last name
	 * @param username user's username
	 * @param password user's password
	 * @param school user's school affiliation
	 */
	public User(String firstName, String lastName, String username, String password, School school) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.school = school;
		id = (int)(Math.random()*1000000);
		classes = new ArrayList<Class>();
	}
	
	
	/**
	 * Constructs a User with first name, last name, username, password,
	 * school, and an ID. Meant to be for users collected from the database.
	 * 
	 * @param firstName user's first name
	 * @param lastName user's last name
	 * @param username user's username
	 * @param password user's password
	 * @param school user's school affiliation
	 * @param id user's id
	 */
	public User(String firstName, String lastName, String username, String password, School school, int  id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.school = school;
		this.id = id;
		classes = new ArrayList<Class>();
	}
	
	
	/**
	 * A method to determine whether the user is a student or not. This
	 * method is overridden to return true in the Student class.
	 * 
	 * @return whether the user is a student or not
	 */
	public boolean isStudent() {
		return false;
	}
	
	
	/**
	 * A method to determine whether the user is a teacher or not. This method
	 * is overridden to return true in the Teacher class.
	 * 
	 * @return whether the user is a teacher or not
	 */
	public boolean isTeacher() {
		return false;
	}
	
	
	/**
	 * A method to determine whether the user is an admin or not. This method
	 * is overridden to return true in the Admin class.
	 * 
	 * @return whether the user is an admin or not
	 */
	public boolean isAdmin() {
		return false;
	}
	

	/**
	 * Returns the user's first name.
	 * 
	 * @return user's first name
	 */
	public String getFirstName() {
		return firstName;
	}

	
	/**
	 * Sets the user's first name.
	 * 
	 * @param firstName the desired first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	/**
	 * Returns the user's last name.
	 * 
	 * @return user's last name
	 */
	public String getLastName() {
		return lastName;
	}

	
	/**
	 * Sets the user's last name.
	 * 
	 * @param lastName the desired last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	/**
	 * Returns the user's username.
	 * 
	 * @return the user's username
	 */
	public String getUsername() {
		return username;
	}

	
	/**
	 * Sets the user's username.
	 * 
	 * @param username the desired username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	
	/**
	 * Returns the user's password.
	 * 
	 * @return the user's password
	 */
	public String getPassword() {
		return password;
	}

	
	/**
	 * Sets the user's password.
	 * 
	 * @param password the desired password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	/**
	 * Returns the user's school.
	 * 
	 * @return the user's school affiliation
	 */
	public School getSchool() {
		return school;
	}
	
	
	/**
	 * Sets the user's school.
	 * 
	 * @param school the desired school affiliation
	 */
	public void setSchool(School school) {
		this.school = school;
	}
	
	
	/**
	 * Returns the user's ID.
	 * 
	 * @return the user's ID
	 */
	public int getID() {
		return id;
	}
	
	
	/**
	 * Adds a class to the user's list of classes
	 * 
	 * @param c the class to be added
	 */
	public void addClass(Class c) {
		classes.add(c);
	}
	
	
	/**
	 * Returns the list of classes.
	 * 
	 * @return the list of classes
	 */
	public ArrayList<Class> getClasses() {
		return classes;
	}

	
	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", school=" + school + ", id=" + id + ", classes=" + classes + "]";
	}	

}
