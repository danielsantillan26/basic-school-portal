package classes;

import java.util.ArrayList;

import users.Student;
import users.Teacher;
import users.User;

public class Class {

	private String name;
	private ArrayList<User> teachers;
	private ArrayList<User> students;
	private ArrayList<String> assignments;
	private ArrayList<ArrayList<Double>> grades;

	public Class(String name) {
		this.name = name;
		teachers = new ArrayList<User>();
		students = new ArrayList<User>();
	}
	
	public Class(String name, ArrayList<User> teachers, ArrayList<User> students) {
		this.name = name;
		this.teachers = teachers;
		this.students = students;
	}
	
	
	public void addTeacher(User t) {
		teachers.add(t);
	}
	
	
	public void addStudent(User s) {
		students.add(s);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	
}
