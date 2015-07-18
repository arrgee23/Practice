package rahul.algo.dp;

public class LongestPalindromeString {
	static void longestMemo(String s){
		boolean[][] dp = new boolean[s.length()][s.length()]; 

		// dp ij means substring i to j is palindrome
		int maxlen = 0;
		int start=0,end=0;
		
		for (int i = 0; i < dp.length; i++)// single char is palindrome 
		{	dp[i][i] = true;
			
		}
		// check for two length string because generic case excludes it
		for(int i=0;i< s.length()-1;i++)
			if(s.charAt(i)==s.charAt(i+1))
				dp[i][i+1] = true;

		// more than two length
		int colStartval=2;
		
		while(colStartval<=s.length()-1){
			int i=0;
			int j=colStartval;
			while(j<=s.length()-1){
				if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){ // if the inner string is palindrome
					dp[i][j] = true;
					if(j-i+1 > maxlen){
						maxlen = j-i+1;
						start = i;
						end = j;
					}
				}		
				i++;j++;
			}
			colStartval++;
		}
		System.out.println(s.substring(start, end+1));
	}

	public static void main(String[] args) {
		String s = "ramakannakr";
		longestMemo(s);// +s.length()-1);
	}

}
