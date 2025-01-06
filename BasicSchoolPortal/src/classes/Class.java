package classes;

import java.util.ArrayList;

import student.Student;
import teacher.Teacher;

public class Class {

	private String name;
	private ArrayList<Teacher> teachers;
	private ArrayList<Student> students;

	public Class(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
