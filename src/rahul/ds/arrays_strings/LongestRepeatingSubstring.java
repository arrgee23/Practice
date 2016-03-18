package rahul.ds.arrays_strings;

public class LongestRepeatingSubstring {
	static int maximalRepeatingSubstr(String str){
		int subStrLength=0;
		for(subStrLength=str.length()/2;subStrLength>=1;subStrLength--){
			for(int i=0;i+subStrLength<=str.length()/2;i++){
				String subStr = str.substring(i,i+subStrLength);
				String rest = str.substring(i+subStrLength);
				
				//System.out.println(subStr+" "+rest);
				if(rest.contains(subStr))
					return subStrLength;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String str = "ATCGATCGA";
		
		System.out.print(maximalRepeatingSubstr(str));
		
	}

}
