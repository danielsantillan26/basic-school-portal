package calculations;

public class GradeCalculations {

	public static double calculateRequiredSemesterExamGrade(double firstQuarterGrade, 
			double secondQuarterGrade, double finalGrade, double firstQuarterWeight, 
			double secondQuarterWeight, double finalExamWeight) {
		double result = (finalGrade - (firstQuarterGrade * (firstQuarterWeight/100)) -
				(secondQuarterGrade * (secondQuarterWeight/100)))/(finalExamWeight/100);
		return Math.floor(result * 100) / 100;
	}


	public static double calculateFinalGrade(double firstQuarterGrade, double
			secondQuarterGrade, double finalExamGrade, double firstQuarterWeight,
			double secondQuarterWeight, double finalExamWeight) {
		double result = (firstQuarterGrade * (firstQuarterWeight/100)) + 
				(secondQuarterGrade * (secondQuarterWeight/100)) + 
				(finalExamGrade * (finalExamWeight/100));
		return Math.floor(result * 100) / 100;
		
	}

}
