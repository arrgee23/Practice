package matrix;

public class SquareSubMatrix {
	public static void main(String[] args) {
		int[][] matrix = 
				{{0, 1, 1, 0, 1}, 
                {1, 1, 0, 1, 0}, 
                {0, 0, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};
		
		int rows=matrix.length;
		int cols=matrix[0].length;
		
		int n = Math.min(rows, cols);
		int windowSize;
		for(windowSize=n;windowSize>=1;windowSize--){
			
			if(foo(matrix,windowSize))
				break;
		}
		System.out.println(windowSize);
	}

	private static boolean foo(int[][] matrix, int windowSize) {
		for(int i=0;i<matrix.length+1-windowSize;i++){
			for (int j = 0; j < matrix[0].length+1-windowSize; j++) {
				
				boolean all1 = true;
				
				for(int k=0;k<windowSize;k++){
					for (int k2 = 0; k2 < windowSize; k2++) {
						if(matrix[i+k][j+k2] != 1){
							all1=false;
							break;
						}
						if(!all1)
							break;
					}
				}
				if(all1)
					return true;
				
			}
		}
		
		return false;
	}
}
