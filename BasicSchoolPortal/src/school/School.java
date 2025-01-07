package school;

import java.util.ArrayList;

import users.*;
import classes.Class;


public class School {

	private String name;
	private int id;

	private ArrayList<Admin> admins;
	private ArrayList<Teacher> teachers;
	private ArrayList<Student> students;
	private ArrayList<Class> classes;


	public School(String name) {
		this.name = name;
		admins = new ArrayList<Admin>();
		teachers = new ArrayList<Teacher>();
		students = new ArrayList<Student>();
		classes = new ArrayList<Class>();
		id = (int) (Math.random()*1000000000);
	}

	public School(String name, int id) {
		this.name = name;
		this.id = id;
		admins = new ArrayList<Admin>();
		teachers = new ArrayList<Teacher>();
		students = new ArrayList<Student>();
		classes = new ArrayList<Class>();
	}


	public Admin addAdmin(Admin admin) {
		admins.add(admin);
		return admin;
	}


	public Teacher addTeacher(Teacher teacher) {
		teachers.add(teacher);
		return teacher;
	}


	public Student addStudent(Student student) {
		students.add(student);
		return student;
	}
	
	public Class addClass(Class course) {
		classes.add(course);
		return course;
	}


	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}



	public ArrayList<Admin> getAdmins() {
		return admins;
	}

	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public ArrayList<Class> getClasses() {
		return classes;
	}


}
