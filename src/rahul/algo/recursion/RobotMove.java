package rahul.algo.recursion;

public class RobotMove {
	static final int N = 3;
	/**
	 * imagine a robot sitting on the upper left hand corner of an NxN grid. The robot can
	 * only move in two directions: right and down. How many possible paths are there for
	 * the robot. path = top left to bottom right path.
	 */
	// backtracking
	static void print(int[][] matrix){
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("----------------------------------------------------");
	}
	static int totalMoves(int rows,int cols){
		int[][] matrix = new int[rows][cols];
		return totalMoveUtil(matrix,0,0);
	}
	private static int totalMoveUtil(int[][] matrix,int r,int c) {
		int row = matrix.length;
		int col = matrix[0].length;
		
		if(r==row-1 && c==col-1){
			print(matrix);
			return 1;
		}
		else if(r >= row || c>= col)
			return 0;
		else{
			// mark it 
			matrix[r][c] = 1;
			return totalMoveUtil(matrix, r+1, c)+totalMoveUtil(matrix, r, c+1);
		}
	}
	public static void main(String[] args) {
		System.out.print(totalMoves(N,N));
	}

}
