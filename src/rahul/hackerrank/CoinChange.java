package rahul.hackerrank;

import java.util.Scanner;

public class CoinChange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int m=s.nextInt();
		
		int[] a= new int[m];
		for(int i=0;i<m;i++)
			a[i]=s.nextInt();
		
		System.out.println(coinChange(a,n));
	}

	private static long coinChange(int[] a, int n) {
		long[][] dp = new long[a.length][n+1];
		
		for(int i=0;i<a.length;i++)
			dp[i][0]=1;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < n+1; j++) {
				long including=0;
				long excluding=0;
				
				if(j-a[i]>=0)
					including = dp[i][j-a[i]];
				if(i>0)
					excluding = dp[i-1][j];
				
				dp[i][j] = including+excluding;
			}
		}
		return dp[a.length-1][n];
	}
}
