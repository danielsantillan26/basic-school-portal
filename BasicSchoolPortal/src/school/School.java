package school;

import java.util.ArrayList;

import users.*;
import classes.Class;

/**
 * The School class represents a school. This class is used for the project
 * to hold information a regular school would hold, including a list of staff
 * and students and classes.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class School {

	/** The name of the school */
	private String name;
	/** The school ID */
	private int id;

	/** A list of administrators */
	private ArrayList<Admin> admins;
	/** A list of teachers */
	private ArrayList<Teacher> teachers;
	/** A list of students */
	private ArrayList<Student> students;
	/** A list of classes */
	private ArrayList<Class> classes;


	/**
	 * Constructs a school with a name. An ID is randomly generated, and the
	 * lists are instantiated. This is meant for schools created during runtime.
	 * 
	 * @param name the name of the school
	 */
	public School(String name) {
		this.name = name;
		admins = new ArrayList<Admin>();
		teachers = new ArrayList<Teacher>();
		students = new ArrayList<Student>();
		classes = new ArrayList<Class>();
		id = (int) (Math.random()*1000000000);
	}

	
	/**
	 * Constructs a school with a name and ID. The lists are instantiated. This
	 * is meant for schools created during compile time (i.e., schools that are
	 * already present).
	 * 
	 * @param name the name of the school
	 * @param id the school ID
	 */
	public School(String name, int id) {
		this.name = name;
		this.id = id;
		admins = new ArrayList<Admin>();
		teachers = new ArrayList<Teacher>();
		students = new ArrayList<Student>();
		classes = new ArrayList<Class>();
	}


	/**
	 * Adds an admin to the list of admins.
	 * 
	 * @param admin the admin to be added
	 * @return the added admin
	 */
	public Admin addAdmin(Admin admin) {
		admins.add(admin);
		return admin;
	}


	/**
	 * Adds a teacher to the list of teachers.
	 * 
	 * @param teacher the teacher to be added
	 * @return the added teacher
	 */
	public Teacher addTeacher(Teacher teacher) {
		teachers.add(teacher);
		return teacher;
	}


	/**
	 * Adds a student to the list of students
	 * 
	 * @param student the student to be added
	 * @return the added student
	 */
	public Student addStudent(Student student) {
		students.add(student);
		return student;
	}
	
	
	/**
	 * Adds a class to the list of classes
	 * 
	 * @param course the class to be added
	 * @return the added class
	 */
	public Class addClass(Class course) {
		classes.add(course);
		return course;
	}


	/**
	 * Returns the school's name.
	 * 
	 * @return the school's name
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * Returns the school's ID.
	 * 
	 * @return the school's ID
	 */
	public int getID() {
		return id;
	}

	
	/**
	 * Returns the list of admins. 
	 * 
	 * @return the list of admins
	 */
	public ArrayList<Admin> getAdmins() {
		return admins;
	}

	
	/**
	 * Returns the list of teachers.
	 * 
	 * @return the list of teachers
	 */
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}

	
	/**
	 * Returns the list of students.
	 * 
	 * @return the list of students
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}

	
	/**
	 * Returns the list of classes.
	 * 
	 * @return the list of classes
	 */
	public ArrayList<Class> getClasses() {
		return classes;
	}
	
	
	/**
	 * Returns a student with an identical ID to the ID passed in as a
	 * parameter. Returns a null student if no student has the same ID as the ID
	 * passed in.
	 * 
	 * @param id the ID to check for
	 * @return the student with that ID
	 */
	public Student searchStudentByID(int id) {
		for (Student s : students) {
			if (s.getID() == id) {
				return s;
			}
		}
		return null;
	}
	
	
	/**
	 * Returns a teacher with an identical ID to the ID passed in as a parameter.
	 * Returns a null teacher if no teacher has the same ID as the ID passed in.
	 * 
	 * @param id the ID to check for
	 * @return the teacher with that ID
	 */
	public Teacher searchTeacherByID(int id) {
		for (Teacher t : teachers) {
			if (t.getID() == id) {
				return t;
			}
		}
		return null;
	}
	

	/**
	 * Returns a class with an identical name to the name passed in as a
	 * parameter. Returns a null class if no class has the same name as the
	 * name passed in.
	 * 
	 * @param name the name to check for
	 * @return the class with that name
	 */
	public Class searchClassByName(String name) {
		for (Class c : classes) {
			if (c.getName().equals(name)) {
				return c;
			}
		}
		return null;
	}

	
	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "School [name=" + name + ", id=" + id + ", admins=" + admins + ", teachers=" + teachers + ", students="
				+ students + ", classes=" + classes + "]";
	}
}
