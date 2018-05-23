package matrix;

public class MatrixChainMultiplication {
	public static void print(int[][] mat) {
		for(int i=1;i<mat.length;i++) {
			for(int j=1;j<mat.length;j++)
			{
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
	}
	public static int matrixMulDP(int[] mat) {
		// mat represents rowno and colno of matrix
		// mat[i-1] and mat[i] are rows and cols of matrix i
		
		// dp[i][j] denotes the min cost of multiplying i'th upto j'th matrix
		int[][] dp = new int[mat.length][mat.length];
		int[][] demo = new int[mat.length][mat.length];
		
		
		for(int i=0;i<mat.length;i++)
			dp[i][i] = 0;
		
		for(int l=1;l<mat.length;l++ ) {
			int i,j;
			// traversing along column
			for(i=1,j=i+l; j<mat.length;j++,i++) {
				
				
				int min = Integer.MAX_VALUE;
				int cost = 0;
				// min cost of multiplying matrix i upto j = cost(i,j)
				// cost of i to k matrices and cost of k+1 to j matrices and the cost of multiplying them
				//cost(i,j) = min(cost(i,k)+cost(k+1,j)+rowo(i)*rowno(k+1)*colno(j)
				// where k ranges from i to j-1
				for(int k=i;k<j;k++) {
					
					cost = dp[i][k]+dp[k+1][j]+mat[i-1]*mat[k]*mat[j];
					if(cost<min) {
						min = cost;
					}
				}
				dp[i][j] = min;
				//print(dp);
			}
		}
		return dp[1][mat.length-1];
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {1, 2, 3, 4};
        int size = arr.length;
 
        System.out.println("Minimum number of multiplications is "+
        		matrixMulDP(arr));
	}

}
