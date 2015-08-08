package codevita;

import java.io.File;
import java.util.Scanner;

public class Bottles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a= {1,5,7,10};
	
		//Scanner s = new Scanner(new File("test.txt"));
		int n = s.nextInt();
		for (long i = 0; i < n; i++) {
			int F=s.nextInt();			
			System.out.println(coinChange(a,F));
		}
	}

	private static long coinChange(int[] a, int n) {
		long[][] dp = new long[a.length][n+1];
		
		for (int i = 1; i < n+1; i++)
			dp[0][i]=i;
		
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < n+1; j++) {
				long including=Integer.MAX_VALUE;
				long excluding=Integer.MAX_VALUE;
				
				if(j-a[i]>=0)
					including = dp[i][j-a[i]]+1;
				if(i>0)
					excluding = dp[i-1][j];
				
				dp[i][j] = Math.min(including,excluding);
			}
		}
		/*for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < n+1; j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println("");
			
		}*/
		return dp[a.length-1][n];	
	}
}
