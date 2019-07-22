package intset;

import java.util.Scanner;

public class IntSet {
	private final int[] set;

	/**
	 * Constructor of the class
	 * @param inputSet
	 */
	public IntSet(int[] inputSet) {
		if (inputSet == null)
			throw new AssertionError("Invalid input");

		if (inputSet.length == 0)
			this.set = new int[] {};
		else {
			sort(inputSet);
			int[] finalInputSet = removeUnwanted(inputSet);
			int i;

			for (i = 0; i < finalInputSet.length && finalInputSet[i] != 0; i++);

			this.set = new int[i];
			for (int j = 0; j < i; j++)
				set[j] = finalInputSet[j];
		}
	}

	public int[] getSet() {

		int[] newSet = new int[size()];

		for (int i = 0; i < size(); i++)
			newSet[i] = set[i];

		return newSet;
	}

	/**
	 * Check whether x is a member of the set
	 * @param x
	 * @return boolean value
	 */
	public boolean isMember(int x) {
		int i = 0;
		boolean member = false;

		if (x >= 1 && x <= 1000) {
			while (i < set.length) {
				if (set[i] == x) {
					member = true;
					break;
				}
				i++;
			}
		}
		return member;
	}

	/**
	 * Calculates the size of the set
	 * @return size
	 */
	public int size() {
		return set.length;
	}

	/**
	 * Check whether s is a subset of the set
	 * @param s
	 * @return boolean value
	 */
	public boolean isSubSet(IntSet s) {
		boolean isSubSet = false;
		int[] sArray = s.getSet();
		int j = 0;

		if (s.size() == 0)
			isSubSet = true;

		if (this.size() >= s.size()) {
			for (int i = 0; i < this.size(); i++) {
				if (j < s.size())
					isSubSet = false;
				else
					break;

				if (set[i] == sArray[j]) {
					isSubSet = true;
					j++;
				}
			}
		}
		return isSubSet;
	}

	/**
	 * Creates the complement set, assuming that 1..1000 is the universal set
	 * @return complement set
	 */
	public IntSet getComplement() {
		int[] complement = new int[1000 - this.size()];
		int term = 0;

		for (int i = 1; i <= 1000; i++) {
			if (!this.isMember(i))
				complement[term++] = i;
		}
		return new IntSet(complement);
	}

	/**
	 * Computes the union of sets s1 and s2
	 * @param s1
	 * @param s2
	 * @return union set
	 */
	public static IntSet union(IntSet s1, IntSet s2) {
		int term = 0;
		int[] s1Array = s1.getSet();
		int[] s2Array = s2.getSet();
		int[] union = new int[s1Array.length + s2Array.length];

		for (int i = 0; i < s1.size(); i++)
			union[term++] = s1Array[i];

		for (int j = 0; j < s2.size(); j++)
			union[term++] = s2Array[j];

		return new IntSet(union);
	}

	/**
	 * Helper method to remove duplicate values from the set
	 * @param array
	 * @return array after removing duplicate values
	 */
	private int[] removeUnwanted(int[] array) {
		int[] newArray = new int[array.length];
		int term = 0;
		int i = 0;

		while (array[i] <= 0)
			i++;

		for (; i < array.length && array[i] <= 1000; i++) {
			newArray[term] = array[i];

			while ((i + 1) != array.length && newArray[term] == array[i + 1])
				i++;

			term++;
		}
		return newArray;
	}

	/**
	 * Helper method to sort the values in the set
	 * @param set
	 */
	private void sort(int[] set) {
		int size = set.length;

		while (set[size - 1] == 0)
			size--;

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (set[j] > set[j + 1]) {
					int temp = set[j];
					set[j] = set[j + 1];
					set[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("\nMENU");
			System.out.println("1. Check for a member in a set");
			System.out.println("2. Find the size of a set");
			System.out.println("3. Check subset");
			System.out.println("4. Get complement set");
			System.out.println("5. Find union of two sets");
			System.out.println("6. Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the no. of elements:");
				// validate input
				while (!sc.hasNextInt()) {
					System.out.println("Please enter integer value");
					sc.next();
				}
				int n = sc.nextInt();
				System.out.println("Enter the set");
				int[] array = new int[n];

				for (int i = 0; i < n; i++) {
					// validate input
					while (!sc.hasNextInt()) {
						System.out.println("Please enter integer value");
						sc.next();
					}
					array[i] = sc.nextInt();
				}

				IntSet set = new IntSet(array);
				System.out.println("Enter the element to be searched:");
				// validate input
				while (!sc.hasNextInt()) {
					System.out.println("Please enter integer value");
					sc.next();
				}
				int x = sc.nextInt();

				if (set.isMember(x))
					System.out.println(x + "is a member of the set");
				else
					System.out.println(x + "is not a member of the set");
				break;

			case 2:
				System.out.println("Enter the no. of elements:");
				// validate input
				while (!sc.hasNextInt()) {
					System.out.println("Please enter integer value");
					sc.next();
				}
				n = sc.nextInt();
				System.out.println("Enter the set");
				int[] array1 = new int[n];

				for (int i = 0; i < n; i++) {
					// validate input
					while (!sc.hasNextInt()) {
						System.out.println("Please enter integer value");
						sc.next();
					}
					array1[i] = sc.nextInt();
				}

				IntSet set1 = new IntSet(array1);
				System.out.println("The size of the set is = " + set1.size());
				break;

			case 3:
				System.out.println("Enter the no. of elements:");
				// validate input
				while (!sc.hasNextInt()) {
					System.out.println("Please enter integer value");
					sc.next();
				}
				n = sc.nextInt();
				System.out.println("Enter the set");
				int[] array2 = new int[n];

				for (int i = 0; i < n; i++) {
					// validate input
					while (!sc.hasNextInt()) {
						System.out.println("Please enter integer value");
						sc.next();
					}
					array2[i] = sc.nextInt();
				}

				IntSet set2 = new IntSet(array2);

				System.out.println("Enter the no. of elements for the subset:");
				// validate input
				while (!sc.hasNextInt()) {
					System.out.println("Please enter integer value");
					sc.next();
				}
				n = sc.nextInt();
				System.out.println("Enter the subset");
				int[] subset = new int[n];

				for (int i = 0; i < n; i++) {
					// validate input
					while (!sc.hasNextInt()) {
						System.out.println("Please enter integer value");
						sc.next();
					}
					subset[i] = sc.nextInt();
				}

				IntSet subSet = new IntSet(subset);

				if (set2.isSubSet(subSet))
					System.out.println("Yes, it is a subset");
				else
					System.out.println("No, it is not a subset");
				break;

			case 4:
				System.out.println("Enter the no. of elements:");
				// validate input
				while (!sc.hasNextInt()) {
					System.out.println("Please enter integer value");
					sc.next();
				}
				n = sc.nextInt();
				System.out.println("Enter the set");
				int[] array3 = new int[n];

				for (int i = 0; i < n; i++) {
					// validate input
					while (!sc.hasNextInt()) {
						System.out.println("Please enter integer value");
						sc.next();
					}
					array3[i] = sc.nextInt();
				}

				IntSet set3 = new IntSet(array3);

				System.out.println("The complement of the set is:");
				int[] complement = set3.getComplement().getSet();
				for (int i = 0; i < complement.length; i++)
					System.out.println(complement[i]);
				break;

			case 5:
				System.out.println("Enter the no. of elements of set1:");
				// validate input
				while (!sc.hasNextInt()) {
					System.out.println("Please enter integer value");
					sc.next();
				}
				n = sc.nextInt();
				System.out.println("Enter the set");
				int[] first = new int[n];

				for (int i = 0; i < n; i++) {
					// validate input
					while (!sc.hasNextInt()) {
						System.out.println("Please enter integer value");
						sc.next();
					}
					first[i] = sc.nextInt();
				}

				IntSet firstSet = new IntSet(first);

				System.out.println("Enter the no. of elements of set2:");
				// validate input
				while (!sc.hasNextInt()) {
					System.out.println("Please enter integer value");
					sc.next();
				}
				n = sc.nextInt();
				System.out.println("Enter the set");
				int[] second = new int[n];

				for (int i = 0; i < n; i++) {
					// validate input
					while (!sc.hasNextInt()) {
						System.out.println("Please enter integer value");
						sc.next();
					}
					second[i] = sc.nextInt();
				}

				IntSet secondSet = new IntSet(second);

				System.out.println("The union of the sets is:");
				int[] union = IntSet.union(firstSet, secondSet).getSet();
				for (int i = 0; i < union.length; i++)
					System.out.println(union[i]);
				break;

			case 6:
				break;

			default:
				System.out
						.println("Wrong choice!! Please select correct option");
			}
		} while (choice != 6);
	}
}