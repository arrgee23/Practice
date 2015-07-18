package rahul.algo.dp;

public class LongestPalindromeSequence {
	static int longestRecr(String s,int l,int r){
		if(l>r)
			return 0;
		char ll = s.charAt(l);
		char rr = s.charAt(r);
		
		if(l==r){
			if(ll==rr)
				return 1;
			return 0;
		}
			
		if(ll==rr)
			 return 2+longestRecr(s,l+1,r-1);
		else
			return Integer.max(longestRecr(s,l,r-1), longestRecr(s,l+1,r));
	}

	static int longestMemo(String s,int l,int r){
		int[][] dp = new int[r-l+1][r-l+1]; // dp[i][j] represtents the length of longest palindrome substr both inclusive of i and j
		
		for (int i = 0; i < dp.length; i++)// single char is palindrome 
			dp[i][i] = 1;
		
		int colStartval=1;
		
		while(colStartval<=r){
			int i=0;
			int j=colStartval;
			while(j<=r){
				if(s.charAt(i)==s.charAt(j)){
					dp[i][j] = dp[i+1][j-1]+2;
				}else{ // they dont match so check for maximum of l...r-1 or l+1...r
					dp[i][j] = Integer.max(dp[i][j-1],dp[i+1][j]);
				}
				
				i++;j++;
			}
			colStartval++;
		}
		return dp[0][r];
	}
	public static void main(String[] args) {
		String s="lmal";
		//System.out.println(longestMemo(s,0,s.length()-1));//+s.length()-1);
		System.out.println(longestRecr(s,0,s.length()-1));//+s.length()-1);
	}

}
