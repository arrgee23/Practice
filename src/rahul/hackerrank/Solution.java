package rahul.hackerrank;

import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /*Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] coins = new int[m];
        for(int i=0;i<m;i++)
            coins[i] = s.nextInt();
        */
    	int n=10,m=4;
    	int[] coins = {2,5,3,6};
    	
    	
    	java.util.Arrays.sort(coins);
    	
    	
        int[][] dp = new int[m][n+1];
        
        // from biggest to smallest
        for(int i=0;i<m;i++){
        	for(int j=1;j<n+1;j++){
        		if(i-1>=0)
        			dp[i][j] = dp[i-1][j];
        		
        		if(coins[i] == j)
        			dp[i][j]++;
        		else if(j-coins[i]>=0)
        			dp[i][j] += dp[i][j-coins[i]];
        			
        	}
        }
        /*for(int i=0;i<m;i++){
        	System.out.print(coins[i]+"---> ");
        	for(int j=0;j<n+1;j++)
        		System.out.print(dp[i][j]+" ("+j+") ");
        	System.out.println();
        }*/
        System.out.println(dp[m-1][n]);
    }
}