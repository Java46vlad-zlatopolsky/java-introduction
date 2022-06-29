package telran.numbers;

public class TictactoeGame {
	
	/**
	 * 
	 * @param matrix - any square matrix (nRows == nColumns; where nRows >= 3)
	 * @param nRow   (number of row)
	 * @param nCol   (number of column)
	 * @param symbol (being filled symbol either 'X' or '0'
	 * @return 0 - game is not over; 1 - game is over with the winner's move; 3 -
	 *         game is over with draw
	 */
	public static final char X = 'x';
	public static final char O = '0';
	public static final char E = '\0';
	
	public static int tictactoeMove(char matrix[][], int nRow, int nCol, char symbol) {
		if (symbol != X && symbol != O && symbol != E) {
			System.err.println("Unexpected error! Symbol is wrong!");
			return -1;
		}
		
		matrix [nRow][nCol] = symbol;
		
		if (isColumnFull(matrix, nCol) || isRowFull(matrix, nRow) || isLeftDiagFull(matrix) || isRightDiagFull(matrix))  {
			return 1;
		}
		
		else if (!isMatrixFull(matrix)) {
			return 0;
		}
			
		else {
			return 3;
		}
				
	}
	
	public static boolean isColumnFull (char matrix[][], int nCol) {
		boolean isFull = true;
		for (int i = 0; i < matrix.length - 1 ; i++) {
			if (matrix[i][nCol] != matrix[i + 1][nCol] ) {
				isFull = false;
				break;
				}
		}
		
		return isFull;
	}
	
	public static boolean isRowFull (char matrix[][], int nRow) {
		boolean isFull = true;
		for (int i = 0; i < matrix[nRow].length - 1; i++) {
			if (matrix[nRow][i] != matrix[nRow][i + 1] ) {
				isFull = false;
				break;
			}
		}
		return isFull;
	}
	
	public static boolean isLeftDiagFull (char matrix[][]) {
		boolean isFull = true;
		for (int i = 0; i < matrix.length - 1; i++) {
			if (matrix[i][i] != matrix[i+1][i+1]) {
				isFull = false;
				break;
			}
		}
		return isFull;
	}
	
	public static boolean isRightDiagFull (char matrix[][]) {
		boolean isFull = true;
		for (int i = 0, j = matrix[i].length - 1 ; j >= 0 && i < matrix.length - 1 ; j--, i++) {
			if (matrix [i][j] != matrix [i + 1][j - 1]) {
				isFull = false;
				break;
			}
		}
		return isFull;
	}
	
	public static boolean isMatrixFull (char matrix[][]) { // check if matrix full or there are empty places
		boolean isFull = true;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == E) {
					isFull = false;
				}
			}
		}
		
		return isFull;
	}
	
}
