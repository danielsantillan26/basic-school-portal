package run;

import files.FileMaker;
import graphics.Frame;
import school.SchoolManager;

/**
 * The Run class allows the Basic School Portal to run. The class creates the
 * frame that lets users access and use the Basic School Portal.
 * 
 * @author Daniel Santillan
 */
public class Run {

	/**
	 * The main method instantiates a frame that holds all the contents of the
	 * Basic School Portal. It sets the frame as visible (so users can see it)
	 * and prints the toString method for this class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setVisible(true);
		
		FileMaker.setup();
		
		System.out.println(new Run());
	}

	
	/**
	 * This is the toString method for this class. It prints a message stating
	 * that the class is working.
	 */
	@Override
	public String toString() {
		return "Run\nClass is working!";
	}
	
}
