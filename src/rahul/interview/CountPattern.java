package rahul.interview;

public class CountPattern {
	public static void main(String[] args) {
		String s="1010101";
		System.out.println(count(s));
	}

	private static int count(String s) {
		int i=0;
		int count=0;
		while(i<s.length()){
			if(s.charAt(i)!='1')
				i++;
			else{ // encountered an 1
				i++;
				if(i<s.length() && s.charAt(i)=='0'){ // next char is zero
					while(i<s.length() && s.charAt(i)=='0'){ // consume zeros
						i++;
					}
				
					// finally check if current char is 1
					if(i<s.length() && s.charAt(i)=='1'){
						count++;
						i++;
					}
				}
			}
		}
		
		return count;
	}
}
