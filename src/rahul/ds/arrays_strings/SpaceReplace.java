package rahul.ds.arrays_strings;

public class SpaceReplace {
	static String spaceReplace(String s){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				sb.append("%20");
			}
			else{
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();	
	}
	
	static char[] spaceReplace(char[] s){
		int spaceCount=0;
		for (int i = 0; i < s.length; i++) {
			if(s[i]==' ')
				spaceCount++;
		}
		int newLength = s.length+3*spaceCount -spaceCount;
		char[] newString = new char[newLength];
		int j=0;
		for (int i = 0; i < s.length; i++) {
			if(s[i]==' '){
				newString[j++] = '%';
				newString[j++] = '2';
				newString[j++] = '0';
			}
			else{
				newString[j++] = s[i];
			}
		}
		System.out.println("lola");
		return newString;
	}
	public static void main(String[] args) {
		char[] c = {'m','a',' ','o',' '};
		System.out.println(spaceReplace(c));
		System.out.println(spaceReplace(String.valueOf(c)));
	}

}
