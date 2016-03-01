package matrix;
/*
 * Given a boolean matrix mat[M][N] of size M X N, 
 * modify it such that if a matrix cell mat[i][j] is 1 (or true) 
 * then make all the cells of ith row and jth column as 1. 
 */

/*
 * store the first row and col details in two booleans
 * make the first row and col to store details
 * 
 */
public class BooleanMatrix {

	public static void main(String[] args) {
		int mat[][] = { {0,0,0},
		        {0,0,1}
		    };
		print(mat);
		function(mat);
		print(mat);
	}

	private static void print(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static void function(int[][] mat) {
		boolean firstRow = false,firstCol = false; // will contain true if any is 1
		
		for(int i=0;i<mat[0].length;i++)
			if(mat[0][i]==1){
				firstRow=true;
				break;
			}
		
		for(int i=0;i<mat.length;i++)
			if(mat[i][0]==1){
				firstCol=true;
				break;
			}
		
		// scan the whole matrix
		for(int i=1;i<mat.length;i++){
			for(int j=1;j<mat[0].length;j++){
				if(mat[i][j]==1){
					mat[0][j] = 1; // mark the col in first row
					mat[i][0] = 1; // mark the row in first col
				}
					
			}
		}
		
		// make all the rows 1
		for(int i=1;i<mat.length;i++){
			if(mat[i][0]==1){
				for(int j=1;j<mat[0].length;j++){
					mat[i][j]=1;
				}
			}
		}
		
		// cols
		for(int j=1;j<mat[0].length;j++){
			for(int i=1;i<mat.length;i++){
				if(mat[0][j]==1)
					mat[i][j]=1;
			}
		}
		
		// set first row and col
		if(firstRow)
			for(int i=0;i<mat[0].length;i++)
				mat[0][i]=1;
		
		if(firstCol)
			for(int i=0;i<mat.length;i++)
				mat[i][0]=1;
	}

}
