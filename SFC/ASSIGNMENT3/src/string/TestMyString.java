package string;

import java.util.Scanner;

/**
 * @author Priya Pandey 
 * Test class for MyString class
 *
 */
public class TestMyString {
	public static void main(String[] args) {

		MyString stringOperation = new MyString();
		Scanner scanner = new Scanner(System.in);
		int choice;
		String string1, string2;

		do {
			System.out.println("\nMENU");
			System.out.println("1. Compare two strings");
			System.out.println("2. Reverse a string");
			System.out
					.println("3. Convert lowercase to uppercase & vice versa");
			System.out.println("4. Find the largest word in a string");
			System.out.println("5. Exit");
			System.out.println("Enter your choice:");
			// validate input
			while (!scanner.hasNextInt()) {
				System.out.println("Please enter integer value");
				scanner.next();
			}
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the first string:");
				string1 = scanner.next();
				string1 += scanner.nextLine();
				System.out.println("Enter the second string:");
				string2 = scanner.next();
				string2 += scanner.nextLine();
				int result = stringOperation.compareString(string1, string2);
				if (result == 1)
					System.out.println("Equal");
				else
					System.out.println("Not Equal");
				break;

			case 2:
				System.out.println("Enter the string:");
				string1 = scanner.next();
				string1 += scanner.nextLine();
				System.out.println("The reverse is:  "
						+ stringOperation.reverseString(string1));
				break;

			case 3:
				System.out.println("Enter the string:");
				string1 = scanner.next();
				string1 += scanner.nextLine();
				System.out.println("The converted string is:  "
						+ stringOperation.convertString(string1));
				break;

			case 4:
				System.out.println("Enter the string:");
				string1 = scanner.next();
				string1 += scanner.nextLine();
				System.out.println("The largest word in the string is:  "
						+ stringOperation.largestWord(string1));
				break;

			case 5:
				break;

			default:
				System.out.println("Wrong Input! Try Again!");
			}

		} while (choice != 5);
		scanner.close();
	}
}
