package users;

import school.School;

public class Admin extends User {
	
	public Admin(String firstName, String lastName, String username, String password, School school) {
		super(firstName, lastName, username, password, school);
	}
	
	public Admin(String firstName, String lastName, String username, String password, School school, int id) {
		super(firstName, lastName, username, password, school, id);
	}
	
	
	
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
