package calculations;

/**
 * The GradeCalculations class is used to determine the semester exam grade
 * required to achieve a particular grade at the end of the semester or determine
 * the semester grade overall. These are based on a first quarter grade, a second
 * quarter grade, a final exam grade, and weights for each of them. This class is
 * connected to a JPanel class that stores the graphics for a particular section
 * of the project.
 * 
 * @author Daniel Santillan
 * @version 1.0;
 */
public class GradeCalculations {

	/**
	 * An empty constructor.
	 */
	public GradeCalculations() {
		
	}
	
	
	/**
	 * Returns the required semester exam grade to achieve the desired final
	 * grade entered by the user. The value is rounded for the program's
	 * convenience.
	 * 
	 * @param firstQuarterGrade		the user's first quarter grade
	 * @param secondQuarterGrade	the user's second quarter grade
	 * @param finalGrade			the user's desired final grade
	 * @param firstQuarterWeight	the user's first quarter weight
	 * @param secondQuarterWeight	the user's second quarter weight
	 * @param finalExamWeight		the user's final exam weight
	 * @return						the required semester exam grade
	 */
	public static double calculateRequiredSemesterExamGrade(double firstQuarterGrade, 
			double secondQuarterGrade, double finalGrade, double firstQuarterWeight, 
			double secondQuarterWeight, double finalExamWeight) {
		double result = (finalGrade - (firstQuarterGrade * (firstQuarterWeight/100)) -
				(secondQuarterGrade * (secondQuarterWeight/100)))/(finalExamWeight/100);
		return Math.floor(result * 100) / 100;
	}


	/**
	 * Returns the final grade that will be received at the end of the semester
	 * according to the first quarter grade, second quarter grade, final exam
	 * grade, and respective weights for each given by the user. The value is
	 * rounded for the program's convenience.
	 * 
	 * @param firstQuarterGrade		the user's first quarter grade
	 * @param secondQuarterGrade	the user's second quarter grade
	 * @param finalExamGrade		the user's final exam grade
	 * @param firstQuarterWeight	the user's first quarter weight
	 * @param secondQuarterWeight	the user's second quarter weight
	 * @param finalExamWeight		the user's final exam weight
	 * @return						the projected final grade
	 */
	public static double calculateFinalGrade(double firstQuarterGrade, double
			secondQuarterGrade, double finalExamGrade, double firstQuarterWeight,
			double secondQuarterWeight, double finalExamWeight) {
		double result = (firstQuarterGrade * (firstQuarterWeight/100)) + 
				(secondQuarterGrade * (secondQuarterWeight/100)) + 
				(finalExamGrade * (finalExamWeight/100));
		return Math.floor(result * 100) / 100;

	}


	/**
	 * This is the toString method for this class.
	 */
	@Override
	public String toString() {
		return "GradeCalculations []";
	}

}
