package marksheet;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Priya Pandey
 * Test the Marksheet class
 *
 */
public class TestMarksheet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Marksheet marksheet = new Marksheet();
		double grades[];
		int noOfStudents,choice;
		DecimalFormat decimalFormat = new DecimalFormat("###.##");
		
		System.out.println("Please enter the number of students:");
		//validate input
        while(!scanner.hasNextInt()) {
            System.out.println("Please enter integer value");
            scanner.next();
        }
		noOfStudents = scanner.nextInt();
		System.out.println("Please enter the grades of each students (0.00 <= grade <= 100.00)");
		grades = new double[noOfStudents];
		
		for(int i=0; i<noOfStudents; i++) {
		    //validate input
            while(!scanner.hasNextDouble())
            {
                System.out.println("Please enter decimal value");
                scanner.next();
            }
            grades[i] = scanner.nextDouble();
		}
			
		do
		{
			
			System.out.println("\nMENU");
			System.out.println("1. Calculate average of grades");
			System.out.println("2. Calculate maximum grade");
			System.out.println("3. Calculate minimum grade");
			System.out.println("4. Calculate percentage of students passed");
			System.out.println("5. Exit");
			System.out.println("Enter your choice:");
			//validate input
            while(!scanner.hasNextInt()) {
                System.out.println("Please enter integer value");
                scanner.next();
            }
			choice = scanner.nextInt();
			
			switch(choice) {
				case 1: double average = marksheet.average(noOfStudents, grades);
						System.out.println("Average: " + decimalFormat.format(average));
						break;
						
				case 2: double maximum = marksheet.maxGrade(noOfStudents, grades);
						System.out.println("Maximum grade: " + maximum);
						break;
						
				case 3: double minimum = marksheet.minGrade(noOfStudents, grades);
						System.out.println("Minimum grade: " + minimum);
						break;
						
				case 4: double passPercentage = marksheet.studentsPassedPercent(noOfStudents, grades);
						System.out.println("Percentage of students passed: " + decimalFormat.format(passPercentage));
						break;
						
				case 5: break;
				
				default: System.out.println("Wrong Input! Try Again!");
			}
		} while(choice != 5);
		scanner.close();
	}
}