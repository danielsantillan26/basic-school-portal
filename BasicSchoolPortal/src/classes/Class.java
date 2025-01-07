package classes;

import java.util.ArrayList;

import users.Student;
import users.Teacher;

public class Class {

	private String name;
	private ArrayList<Teacher> teachers;
	private ArrayList<Student> students;
	private ArrayList<String> assignments;
	private ArrayList<ArrayList<Double>> grades;

	public Class(String name) {
		this.name = name;
		teachers = new ArrayList<Teacher>();
		students = new ArrayList<Student>();
	}
	
	public Class(String name, ArrayList<Teacher> teachers, ArrayList<Student> students) {
		this.name = name;
		this.teachers = teachers;
		this.students = students;
	}
	
	
	public void addTeacher(Teacher t) {
		teachers.add(t);
	}
	
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
