package rahul.ds.arrays_strings;

public class CharEncoding {

	public static void main(String[] args) {
		String s = "aabbccddcf";
		String enc = "";
		
		char c='#';
		
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=c) // new character encountered
			{
				
				if(c!='#'){ //not firsttime then write the char at the end
					enc += Integer.toString(count);
				}
				c=s.charAt(i);
				enc+=c;
				count = 1;	
			}else{
				count++;
			}
			
		}
		enc += Integer.toString(count);
		System.out.println(enc);
	}

}
