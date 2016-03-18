package rahul.ds.arrays_strings;
import java.util.*;
import java.util.Map.Entry;


public class MinimumSubstringEnclosingString {

	public static void main(String[] args) {
		String s = "bzdsdaddwcfaobwww";
		String sub = "abc";
		
		HashMap<Character,Integer> h = new HashMap<Character,Integer>();
		
		for(char c : sub.toCharArray()){
			if(!h.containsKey(c))
				h.put(c, 1);
			else{
				int n = h.get(c);
				n++;
				h.put(c, n);
			}
		}
		
		// check for all matches
		int length = sub.length();
		int beginIndex = 0;
		boolean flag = false;
		
		for(length=sub.length();length<=s.length();length++){ // search for each substring upto full length of the string
			for (int i = 0; i+length <= s.length(); i++) {
				String checkIn = s.substring(i,i+length);
				//System.out.println(checkIn);
				
				if(containsAll(checkIn,h)){
					flag = true;
					beginIndex = i;
					break;
				}
			}
			if(flag)
				break;
		}
		if(flag)
			System.out.println(s.substring(beginIndex,beginIndex+length));
	}

	private static boolean containsAll(String checkIn,
			HashMap<Character, Integer> h) {
		HashMap<Character, Integer> h2 = (HashMap<Character, Integer>) h.clone();
		
		for(char c : checkIn.toCharArray()){
			if(h2.containsKey(c)){
				int n=h2.get(c);
				n--;
				h2.put(c, n);
			}
				
			
		}
		for(Entry<Character, Integer> e : h2.entrySet()){
			if(e.getValue() > 0)
				return false;
		}
		return true;
	}

}
