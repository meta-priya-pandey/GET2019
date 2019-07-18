/**
 * @author Priya Pandey
 *
 */
public class ArrOperation {

	/**
	 * finding the largest mirror section in the array.
	 * @param an array of positive integers.
	 * @return maximum mirror length.
	 */
	public int maxMirror(int arrInt[]) {
		if (arrInt.length == 0) {
			throw new AssertionError("Array is empty");
		}
		
		int maxMirLength = 0;

		for (int i = 0; i <= arrInt.length - 1; i++) {
			int count = 0;
			for (int j = i + 1; j < arrInt.length; j++) {
				if (arrInt[i] == arrInt[j]) {
					for (int start = i, end = j; start <= end; start++, end--) {
						if (arrInt[start] == arrInt[end] && start != end) {
							count++;
						} else if (arrInt[start] == arrInt[end] && start == end) {
							count *= 2;
							count++;
						} else if (count > maxMirLength) {
							maxMirLength = count;
							j++;

							count = 0;
						}
					}
				}
				if (count > maxMirLength) {
					maxMirLength = count;
					count = 0;
				}
			}
		}
		return maxMirLength;
	}

	/**
	 * finding the clump in the array.
	 * @param an array of positive integers.
	 * @return number of clumps.
	 */
	public int countClumps(int arrInt[]) {
		if (arrInt.length == 0) {
			throw new AssertionError("Array is empty");
		}
		
		int clump = 0;
		boolean isSameMatchAlready = false;
		for (int i = 0; i < arrInt.length - 1; i++) {
			if (arrInt[i] == arrInt[i + 1] && !isSameMatchAlready) {
				clump++;
				isSameMatchAlready = true;
			} else if (arrInt[i] != arrInt[i + 1]) {
				isSameMatchAlready = false;
			}

		}
		return clump;
	}

	/**
	 * solving the problem in such a way that Y comes just after the X in array by moving Y only.
	 * @param an array of positive integers.
	 * @param cannot move the position of x in the array where x holds some value.
	 * @param can move the position of y in the array where y holds some value.
	 * @return an array by solving condition of fixXY.
	 */
	public int[] fixXY(int arrInt[], int x, int y) throws Exception {
		if (arrInt.length == 0) {
			throw new AssertionError("Empty Array");
		}
		
		int j = 0;
		int xCount = 0, yCount = 0, k = 0, length = arrInt.length;

		for (int i = 0; i < arrInt.length; i++) {
			if (arrInt[i] == x) {
				xCount++;
				if (arrInt[i] == arrInt[i + 1] && (i + 1) < length) {
					throw new AssertionError("two adjacents X values are there");
				}

			} else if (arrInt[i] == y) {
				yCount++;
			}
		}
		if (xCount == yCount && arrInt[length - 1] != x) {
			for (int i = 0; i < arrInt.length - 1; i++) {
				if (arrInt[i] == x && arrInt[i + 1] != y) {
					while (arrInt[j] != y || (j != 0 && arrInt[j - 1] == x)) {
						j++;
					}
					arrInt[j] = arrInt[i + 1];
					arrInt[i + 1] = y;
				}
			}
		} else {
			if (xCount != yCount) {
				throw new AssertionError(
						"unequal numbers of X and Y in input array");
			} else
				throw new AssertionError("X occurs at the last index of array");
		}
		return arrInt;
	}

	/**
	 * find the index where the array splits so that the sum of the numbers of
	 * one side is equal to the sum of the numbers of other side.
	 * @param an array of the positive integers.
	 * @return the split index of an array.
	 */
	public int splitArray(int arrInt[]) {
		if (arrInt.length == 0) {
			throw new AssertionError("Array is empty");
		}
		
		int i, j;
		int leftsum, rightsum;
		for (i = 0; i < arrInt.length; ++i) {
			leftsum = 0;
			for (j = 0; j <= i; j++) {
				leftsum += arrInt[j];
			}
			rightsum = 0;
			for (j = i + 1; j < arrInt.length; j++) {
				rightsum += arrInt[j];
			}
			if (leftsum == rightsum) {
				if (arrInt.length == 2) {
					return j - 1;
				} else if (arrInt.length > 2) {
					return i + 1;
				}
			}
		}
		/*
		 * return -1 if no equilibrium index is found
		 */
		return -1;
	}
}