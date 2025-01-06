package school;

import java.util.ArrayList;

import users.*;


public class School {
	
	private String name;
	private int id;
	
	private ArrayList<Admin> admins;
	private ArrayList<Teacher> teachers;
	private ArrayList<Student> students;
	
	
	public School(String name) {
		this.name = name;
		admins = new ArrayList<Admin>();
		teachers = new ArrayList<Teacher>();
		students = new ArrayList<Student>();
		id = (int) (Math.random()*10000000);
	}
	
	
	public void addAdmin(Admin admin) {
		admins.add(admin);
	}
	
	
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	
	public int getID() {
		return id;
	}
	
	
	
}
