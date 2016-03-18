package matrix;
/*
 * Input:  m = 6, n = 7

	Output: Following matrix
	
X X X X X X X
X 0 0 0 0 0 X
X 0 X X X 0 X
X 0 X X X 0 X
X 0 0 0 0 0 X
X X X X X X X 

*/

public class AlternatingXO {
	static final char[] symbol = {'X','O'};
	
	public static void main(String[] args) {
		int row=30,col=17;
		char[][] mat = new char[row][col];
		
		 int firstRow=0,firstCol=0,lastRow=row-1,lastCol=col-1;
		 
		 fillRecr(mat,firstRow,firstCol,lastRow,lastCol,0);
		 
		 PrintMatrix.print(mat);
	}

	private static void fillRecr(char[][] mat, int firstRow, int firstCol,
			int lastRow, int lastCol, int i) {
		if(lastRow<firstRow || lastCol<firstCol)
			return;
		else{
			char c=symbol[i%2];
			
			// first and last row
			for(int j=firstCol;j<=lastCol;j++){
				mat[firstRow][j]=c;
				mat[lastRow][j]=c;
			}
			// first and last col
			for (int j = firstRow+1; j < lastRow; j++) {
				mat[j][firstCol]=c;
				mat[j][lastCol]=c;
			}
			
			// recur
			fillRecr(mat, firstRow+1, firstCol+1, lastRow-1, lastCol-1, i+1);
		}
		
	}

}
