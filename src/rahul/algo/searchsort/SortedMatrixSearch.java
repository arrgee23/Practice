package rahul.algo.searchsort;

/**
 * Given a matrix in which each row and each column is sorted, write a method to
 * find an element in it.
 * 
 * @author rahul
 *
 */
public class SortedMatrixSearch {
	static boolean FindElem(int[][] mat, int elem) {
		
		int row = 0;
		int col = mat[0].length- 1;
		
		while (row < mat.length && col >= 0) {
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
		int[][] mat = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
		
		
		
		System.out.println(FindElem(mat,50));
	}

}
