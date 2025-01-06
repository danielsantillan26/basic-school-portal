package users;

import school.School;

public class User {
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private School school;
	private int id;
	
	public User(String firstName, String lastName, String username, String password, School school) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.school = school;
		id = (int)(Math.random()*1000000);
	}
	
	public User(String firstName, String lastName, String username, String password, School school, int  id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.school = school;
		this.id = id;
	}
	
	
	public boolean isStudent() {
		return false;
	}
	
	public boolean isTeacher() {
		return false;
	}
	
	public boolean isAdmin() {
		return false;
	}
	

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public School getSchool() {
		return school;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	
	public int getID() {
		return id;
	}
	

}
