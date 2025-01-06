package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import school.School;
import school.SchoolManager;
import users.Admin;

public class FileMaker {

	private static final String filename = "data.txt";
	private static File file;

	private static final char DELIMITER_SCHOOL = '校';
	private static final char DELIMITER_ADMIN = '头';
	private static final char DELIMITER_TEACHER = '生';
	private static final char DELIMITER_STUDENT = '师';
	private static final char DELIMITER_CLASS = '课';

	public static void setup() {
		file = new File(filename);

		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void addSchool(String[] information) {
		try {
			FileWriter writer = new FileWriter(file, true);

			writer.write(DELIMITER_SCHOOL + "\n");
			writer.write(information[0] + "\n");
			
			int idInt = SchoolManager.addSchool(new School(information[0]));
			String id = Integer.toString(idInt);
			writer.write(id + "\n");
			
			writer.write("\n" + DELIMITER_ADMIN + "\n");
			writer.write(information[2] + "\n");
			writer.write(information[3] + "\n");
			writer.write(information[1] + "\n");
			writer.write(information[4] + "\n");
			
			SchoolManager.searchByID(idInt).addAdmin(new Admin(information[2], information[3], information[1], information[4], SchoolManager.searchByID(idInt)));
			
			


			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void addAdmin(String[] information, String school) {

	}

}
