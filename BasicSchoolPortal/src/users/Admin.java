package users;

import school.School;

public class Admin extends User {
	
	public Admin(String firstName, String lastName, String username, String password, School school) {
		super(firstName, lastName, username, password, school);
	}
	
	
	
	@Override
	public boolean isAdmin() {
		return true;
	}
	

	
}
