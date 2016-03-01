package matrix;

public class MatrixSpiralPrint {
	
	static final int LEFT = 2;
	static final int RIGHT= 0;
	static final int UP = 3;
	static final int DOWN= 1;
	
	static final int[] directions={RIGHT,DOWN,LEFT,UP};
	
	public static void main(String[] args) {
		int[][] matrix = {
				 {1,2,3,4},
				 {5,6,7,8},
				 {9,10,11,12}
		};
		printSpiral(matrix);
	}

	private static void printSpiral(int[][] matrix) {
		
		int row = matrix.length-1;
		int col = matrix[0].length;
		int x=0,y=-1;
		
		int printed=0;
		int total=matrix.length*matrix[0].length;
		
		int n=0;
		while(true){
			//System.out.print("hdsgh");
			if(!(printed < total))
				break;
			
			// print right
			for(int i=0;i<col;i++){
				y++;
				System.out.print(matrix[x][y]+" ");
				printed++;
				
			}
			col--;
			System.out.println();
			
			if(!(printed < total))
				break;
			
			// print down
			for(int i=0;i<row;i++){
				x++;
				System.out.print(matrix[x][y]+" ");
				printed++;
			}
			row--;
			System.out.println();
			
			if(!(printed < total))
				break;
			
			// print left
			for(int i=0;i<col;i++){
				y--;
				System.out.print(matrix[x][y]+" ");
				printed++;			
			}
			col--;
			System.out.println();
			
			if(!(printed < total))
				break;
			
			// print up
			for(int i=0;i<row;i++){
				x--;
				System.out.print(matrix[x][y]+" ");
				printed++;			
			}
			row--;
			System.out.println();
		}
	}


}
