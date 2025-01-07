package school;

import java.util.ArrayList;

import users.Admin;
import users.Student;
import users.Teacher;
import users.User;

/**
 * The SchoolManager class maintains the list of schools (and therefore the list
 * of students, teachers, etc.) that are part of the database.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class SchoolManager {

	/** Version */
	private static ArrayList<School> schools;
	
	
	/**
	 * Constructs the schools list. Unused in lieu of setup().
	 */
	public SchoolManager() {
		schools = new ArrayList<School>();
	}
	
	
	/**
	 * Instantiates the list of schools. 
	 */
	public static void setup() {
		schools = new ArrayList<School>();
	}


	/**
	 * Adds a school to the list of schools.
	 * 
	 * @param s the school to be added
	 * @return the ID of the school
	 */
	public static int addSchool(School s) {
		schools.add(s);
		return s.getID();
	}


	/**
	 * Searches for a school by ID. A null school is returned if no school
	 * is found with the ID passed in.
	 * 
	 * @param id the ID to search for
	 * @return the school with an identical ID to the parameter ID
	 */
	public static School searchByID(int id) {
		for (School s : schools) {
			if (s.getID() == id) {
				return s;
			}
		}
		return null;
	}
	
	
	/**
	 * Returns the list of schools.
	 * 
	 * @return the list of schools.
	 */
	public static ArrayList<School> getSchools() {
		return schools;
	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "SchoolManager []";
	}
}
