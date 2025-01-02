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
 * @version 1.0
 * @author Daniel Santillan
 */
public class GraphicsConstants {
	
	public static final Color headerColor = new Color(0, 179, 255);
	public static final Color centerColor = new Color(209, 241, 255);
	public static final Font montserratBold50 = new Font("Montserrat", Font.BOLD, 50);
	public static final Font montserratBold30 = new Font("Montserrat", Font.BOLD, 30);
	public static final Dimension textFieldDimension = new Dimension(500, 75);

}
