package teach;

public class Matrix {
	static final int ROW = 3;
	static final int COL = 3;
	static int[][] matrix;
	static boolean[] isColProcessed;
	static int sum;
	
	static{
		matrix = new int[ROW][COL];
		sum = 0;
		for(int i=0;i<ROW;i++)
			for(int j=0;j<COL;j++)
				matrix[i][j] = i+j;
		isColProcessed = new boolean[COL];
	}
	static synchronized int addColToArray(int col,int[] arr,int index){
		if(!isColProcessed[col]){
			for(int i=0;i<ROW;i++){
				arr[index] =  matrix[i][col];
				index++;
			}
				
			isColProcessed[col] = true; // mark the col processsed
			int lom = index;
			return lom;
		}
		return index;
	}
	// adds the ith col to sum
	static synchronized void addColToSum(int col){
		// if the column is not processed process it in sync
		if(!isColProcessed[col]){
			for(int i=0;i<ROW;i++)
				sum += matrix[i][col];
			isColProcessed[col] = true; // mark the col processsed
		}
	}
}
