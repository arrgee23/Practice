package rahul.algo.dp;
/*
 * Count all possible paths from top left to bottom right of a mXn matrix
 */
public class NoofPaths {
	static void printMat(int[][] mat) {
		
		for(int i=1;i<mat.length;i++) {
			for(int j=1;j<mat[0].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int countPaths(int m,int n) {
		int mat[][] = new int[m+1][n+1];
		
		mat[1][1] = 1;
		for(int i=1;i<m+1;i++) {
			mat[i][1] = 1;
		}
		
		for(int i=1;i<n+1;i++) {
			mat[1][i] = 1;
		}
		
		for(int i=2;i<m+1;i++) {
			for(int j=2;j<n+1;j++) {
				mat[i][j] = mat[i-1][j]+mat[i][j-1];
			}
		}
		printMat(mat);
		return mat[m][n];
	}
	public static void main(String[] args) {
		System.out.println(countPaths(3,7));
	}

}
