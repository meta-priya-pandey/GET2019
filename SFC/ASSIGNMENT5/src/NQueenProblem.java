/**
 * @author Priya Pandey
 * Implementation of N Queens Problem using Recursion
 */
public class NQueenProblem {

	/**
	 * Placing the n Queens on n x n square board such that two queens cannot attack each other.
	 * @param board contains a matrix with dimension n x n on which queens are placed
	 * @param startRow contains the row in which current queen is placed
	 * @param dimensionOfMatrix contains dimension of board
	 * @return returns true if it is possible to place n queens on n x n square board else false
	 */
	public boolean nQueen(int[][] board, int startRow, int dimensionOfMatrix) {
		// Check if all rows are placed with queens.
		if (startRow == dimensionOfMatrix) {
			return true;
		}
		// Checking n queens are placed in the board.
		else {
			for (int col = 0; col < dimensionOfMatrix; col++) {
				// Calling nQueenSafe method.
				if (isQueenSafe(board, startRow, col)) {
					board[startRow][col] = 1;
					if (nQueen(board, ++startRow, dimensionOfMatrix)) {
						return true;
					} else {
						board[--startRow][col] = 0;
					}
				}
			}
			return false;
		}
	}

	/**
	 * Checking whether it is safe to place queen on current square of board.
	 * @param board contains a matrix with dimension n x n on which queens are placed.
	 * @param startRow contains the row of square on which current queen is placed.
	 * @param column contains column of square on which current queen is placed.
	 * @return returns true if it is safe to place queen on the square otherwise false
	 */
	public boolean isQueenSafe(int[][] board, int startRow, int col) {
		int i, j;
		// Check for row and column
		for (i = 0; i < board.length; i++) {
			if (board[startRow][i] == 1) {
				return false;
			}
			if (board[i][col] == 1) {
				return false;
			}
		}
		// Check for upper left diagonal
		for (i = startRow, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		// Check for upper right diagonal
		for (i = startRow, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		return true;
	}
}
