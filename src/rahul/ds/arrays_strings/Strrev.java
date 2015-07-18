package rahul.ds.arrays_strings;

public class Strrev {
	static String strrev(String s){
		StringBuffer sb = new StringBuffer();
		
		for (int i = s.length()-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.print(strrev("**"));
	}

}
