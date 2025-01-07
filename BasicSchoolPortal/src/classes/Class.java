package classes;

import java.util.ArrayList;

import users.Student;
import users.Teacher;
import users.User;

/**
 * The Class class is a class that represents a course from a school. This class
 * maintains values that are essential to a course: students, teachers, assignments,
 * and grades. The current project (V 1.0) only has functionality for the
 * teachers and students, not the assignments and grades.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class Class {

	/** The name of the class */
	private String name;
	/** The list of teachers of the class */
	private ArrayList<User> teachers;
	/** The list of students of the class */
	private ArrayList<User> students;
	/** The list of assignments of the class */
	private ArrayList<String> assignments;
	/** The list of grades of the class */
	private ArrayList<ArrayList<Double>> grades;


	/**
	 * Constructs a new Class by assigning the class name. To be used when a
	 * class is formed during the running of the program.
	 * 
	 * @param name the class name
	 */
	public Class(String name) {
		this.name = name;
		teachers = new ArrayList<User>();
		students = new ArrayList<User>();
	}


	/**
	 * Adds a teacher to the class.
	 * 
	 * @param t	teacher
	 */
	public void addTeacher(User t) {
		teachers.add(t);
	}


	/**
	 * Adds a student to the class.
	 * 
	 * @param s	student
	 */
	public void addStudent(User s) {
		students.add(s);
	}


	/**
	 * Returns the class name.
	 * 
	 * @return the class name
	 */
	public String getName() {
		return name;
	}


	/**
	 * Sets the class name.
	 * 
	 * @param name the desired class name
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "Class [name=" + name + ", teachers=" + teachers + ", students=" + students + ", assignments="
				+ assignments + ", grades=" + grades + "]";
	}

}
