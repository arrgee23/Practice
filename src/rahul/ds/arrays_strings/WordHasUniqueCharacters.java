package rahul.ds.arrays_strings;

import java.util.HashMap;



public class WordHasUniqueCharacters {
	static boolean hasUniqueCharacters(String s){
		HashMap<Character,Boolean> h = new HashMap<Character,Boolean>();
		for(int j=0;j<s.length();j++){
			if(h.containsKey(s.charAt(j)))
				return false;
			else 
				h.put(s.charAt(j), true);
		}
		return true;
	}
	static boolean hasUniqueCharactersSlow(String s){
		for(int i=0;i<s.length();i++){
			char curr = s.charAt(i);
			
			for(int j=i+1;j<s.length();j++){
				if(curr == s.charAt(j))
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String k = "Aba";
		System.out.println(hasUniqueCharacters(k));
		System.out.println(hasUniqueCharactersSlow(k));
	}

}
