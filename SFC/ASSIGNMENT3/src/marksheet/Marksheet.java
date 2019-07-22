package marksheet;

/**
 * @author Priya Pandey
 * Marksheet class calculates the average, maximum grade, minimum grade and percentage.
 *
 */
public class Marksheet {

	/**
	 * Calculates the average of the grades of n no. of students
	 * @param noOfStudents, assumes noOfStudents>0
	 * @param grades an array of the grades of each student, assumes grade>=0.00 and grade<=100.00
	 * @return average of grades
	 */
	public double average(int noOfStudents, double[] grades) throws ArithmeticException {
		double sum = 0;
			
		for(int i = 0; i < noOfStudents; i++)
			sum += grades[i];
			
		return sum / noOfStudents;
	}
		
	/**
	 * Calculates the maximum of all grades
	 * @param noOfStudents, assumes noOfStudents>0
	 * @param grades an array of the grades of each student, assumes grade>=0.00 and grade<=100.00
	 * @return maximum grade
	 */
	public double maxGrade(int noOfStudents, double[] grades) throws ArithmeticException {
		double max = grades[0];
			
		for(int i = 1; i < noOfStudents; i++) {
			if(grades[i] > max)
				max = grades[i];
		}
			return max;
		}
		
	/**
	 * Calculates the minimum of all grades
	 * @param noOfStudents, assumes noOfStudents>0
	 * @param grades an array of the grades of each student, assumes grade>=0.00 and grade<=100.00
	 * @return minimum grade
	 */
	public double minGrade(int noOfStudents, double[] grades) throws ArithmeticException {
		double min = grades[0];
			
		for(int i = 1; i < noOfStudents; i++) {
			if(grades[i] < min)
				min = grades[i];
			}
		return min;
		}
		
	/**
	 * Calculates the percentage of students passed, student is passed if grade >= 40
	 * @param noOfStudents, assumes noOfStudents>0
	 * @param grades an array of the grades of each student, assumes grade>=0.00 and grade<=100.00
	 * @return percentage of students passed
	 */
	public double studentsPassedPercent(int noOfStudents, double[] grades) throws ArithmeticException {
		double pass = 0;
			
		for(int i = 0; i < noOfStudents; i++) {
			if(grades[i] >= 40)
				pass++;
		}
			
		return ((pass / noOfStudents) * 100);
	}
}