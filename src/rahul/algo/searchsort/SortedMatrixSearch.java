package rahul.algo.searchsort;

/**
 * Given a matrix in which each row and each column is sorted, write a method to
 * find an element in it.
 * 
 * @author rahul
 *
 */
public class SortedMatrixSearch {
	boolean FindElem(int[][] mat, int elem, int M, int N) {
		
		int row = 0;
		int col = N - 1;
		
		while (row < M && col >= 0) {
			if (mat[row][col] == elem) {
				return true;
			} else if (mat[row][col] > elem) {
				col--; // all the values below element are larger
			} else {
				row++;
			}
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
