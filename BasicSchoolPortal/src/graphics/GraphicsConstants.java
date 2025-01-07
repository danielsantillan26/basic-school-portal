package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

/**
 * The GraphicsConstants class stores frequently used fields among classes of
 * the graphics package in the Basic School Portal. These fields include the
 * colors required for the background of each page as well as reused parameters
 * for implemented layouts that help form the program's graphical user
 * interface.
 * 
 * @author Daniel Santillan
 * @version 1.0
 */
public class GraphicsConstants {

	/** The color used for the page header */
	public static final Color headerColor = new Color(0, 179, 255);
	/** The color used for the page center */
	public static final Color centerColor = new Color(209, 241, 255);
	/** A Montserrat Bold sized 50, often used with prompts */
	public static final Font montserratBold50 = new Font("Montserrat", Font.BOLD, 50);
	/** A Montserrat Bold sized 30, often used with text boxes */
	public static final Font montserratBold30 = new Font("Montserrat", Font.BOLD, 30);
	/** A Montserrat Bold sized 15, often used with small failed messages */
	public static final Font montserratBold15 = new Font("Montserrat", Font.BOLD, 15);
	/** A dimension often used for buttons with "Return" */
	public static final Dimension textFieldDimension = new Dimension(500, 75);
	
	
	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "GraphicsConstants []";
	}
}