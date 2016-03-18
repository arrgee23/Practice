package rahul.ds.arrays_strings;

public class StringRemove {
	public static void main(String[] args) {
		String src="funfunallfufunn";
		String toRemove = "fun";
		
		//System.out.print(src.replace(toRemove,""));
		
		while(true){
			int i = findMatch(src,toRemove);
			if(i==-1)
				break;
			else{
				String temp = "";
				
				for(int j=0;j<i;j++) // append the first part
					temp += src.charAt(j);
			
				for (int j = i+toRemove.length(); j < src.length(); j++) {
					temp += src.charAt(j);
				}
				
				src = temp;
			}
		}
		
		System.out.print(src);
	}

	private static int findMatch(String src, String toRemove) {
		for(int i=0;i<src.length();i++){
			int matchCount = 0;
			for(int j=i;j-i<toRemove.length() && j<src.length();j++){
				if(src.charAt(j)==toRemove.charAt(j-i))
					matchCount++;
				else
					break;
			}
			if(matchCount==toRemove.length())
				return i;
		}
		return -1;
	}
}
