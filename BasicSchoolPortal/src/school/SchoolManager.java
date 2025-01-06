package school;

import java.util.ArrayList;

public class SchoolManager {

	private static ArrayList<School> schools;
	
	public static void setup() {
		schools = new ArrayList<School>();
	}
	
	
	public static int addSchool(School s) {
		schools.add(s);
		return s.getID();
	}
	
	
	public static School searchByID(int id) {
		for (School s : schools) {
			if (s.getID() == id) {
				return s;
			}
		}
		
		return null;
	}
	
}
