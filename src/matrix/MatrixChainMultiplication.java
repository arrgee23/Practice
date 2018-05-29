package matrix;

// insertion= O(lgn)
//extractMax=O(lgN)
//
public class MatrixChainMultiplication {
	public static int[][] memory;
	
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
	
	public static void printParantesesRec(int[] mat,int[][] mem,int i,int j) {
		char[] alphabet = {0,'a','b','c','d','e','f','g','h','i','j','k','l','m',
						   'n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		if(j<=i+1) {
			//if(j==i+1)
				//System.out.print("(");
			for(int k=i;k<=j;k++) {
				System.out.print(alphabet[k]+" ");
			}
		//	if(j==i+1)
			//	System.out.print(")");
		}
		else {
			int n = mem[i][j];
			System.out.print("(");
			printParantesesRec(mat,mem,i,n);
			System.out.print(")");
			System.out.print("(");
			printParantesesRec(mat,mem,n+1,j);
			System.out.print(")");
		}
	}
	public static int matrixMulDP(int[] mat) {
		// mat represents rowno and colno of matrix
		// mat[i-1] and mat[i] are rows and cols of matrix i
		// dp[i][j] denotes the min cost of multiplying i'th upto j'th matrix
		
		int[][] dp = new int[mat.length][mat.length];
		memory = new int[mat.length][mat.length];
		
		
		for(int i=0;i<mat.length;i++) {
			dp[i][i] = 0;
			if(i!=mat.length-1)
				dp[i][i+1] = 0;
		}
		for(int l=1;l<mat.length;l++ ) { // calculate no of multiplication for all l length
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
						memory[i][j] = k;
					}
				}
				dp[i][j] = min;
				//print(dp);
			}
		}
		print(memory);
		return dp[1][mat.length-1];
	}
	
	public static void main(String[] args) {
		int arr[] = new int[]  {10, 20, 30};
        int size = arr.length;
 
        System.out.println("Minimum number of multiplications is "+
        		matrixMulDP(arr));
        printParantesesRec(arr,memory,1,arr.length-1);
	}

}
