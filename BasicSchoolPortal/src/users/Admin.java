package users;

import school.School;

/**
 * The Admin class is a class that represents a school administrator. This class
 * maintains values that are essential to an administrator: name, username, password,
 * school affiliation, and ID.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Admin extends User {
	
	/**
	 * Constructs an Admin with first name, last name, username, password,
	 * school, and a randomly assigned ID. 
	 * 
	 * @param firstName user's first name
	 * @param lastName user's last name
	 * @param username user's username
	 * @param password user's password
	 * @param school user's school affiliation
	 */
	public Admin(String firstName, String lastName, String username, String password, School school) {
		super(firstName, lastName, username, password, school);
	}
	
	
	/**
	 * Constructs an Admin with first name, last name, username, password,
	 * school, and an ID. Meant to be for users collected from the database.
	 * 
	 * @param firstName user's first name
	 * @param lastName user's last name
	 * @param username user's username
	 * @param password user's password
	 * @param school user's school affiliation
	 * @param id user's id
	 */
	public Admin(String firstName, String lastName, String username, String password, School school, int id) {
		super(firstName, lastName, username, password, school, id);
	}
	
	
	/**
	 * An overridden method to determine whether the user is an admin. In
	 * this case, it is returned true.
	 * 
	 * @return whether to user is an admin or not
	 */
	@Override
	public boolean isAdmin() {
		return true;
	}

	
	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Admin []";
	}
	
}
