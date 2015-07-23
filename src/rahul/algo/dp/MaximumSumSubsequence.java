package rahul.algo.dp;
/**
 * Write a program to find the sum of maximum sum subsequence 
 * of the given array such that 
 * the integers in the subsequence are sorted in increasing order
 * @author devel
 *
 */
public class MaximumSumSubsequence {

	static void function(int[] arr){
		int[] dp = new int[arr.length];		
		
		// setting initial condition
		// sol[i] represents the last element before 
		// ith element that was part of the sol
		// so for any element that is smaller than others its previous element is
		// marked as -1 meaning it has no prev
		int[] sol = new int[arr.length];
		for (int i = 0; i < sol.length; i++) {
			sol[i] = -1;
		}
		
		dp[0] = arr[0]; // dp[i] presents the max sum including element i
		for (int i = 1; i < arr.length; i++) {
			int max=0;
			for(int j=0;j<i;j++){
				if(arr[i] > arr[j])
					if(dp[j]>max){
						sol[i]=j;
						max = dp[j];
					}
			}
			dp[i]=arr[i]+max;
		}
		// find the maximum of those sums
		int max=Integer.MIN_VALUE;
		int index=0;
		for (int i = 0; i < sol.length; i++) {
			if(dp[i]>max){
				max=dp[i];
				index=i;
			}
		}
		
		int n=sol[index]; // last element
		do{
			System.out.print(arr[n]+" ");
			n=sol[n];
		}while(n!=-1);
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 101, 2, 3, 100, 4, 5};
		function(arr);
	}

}
