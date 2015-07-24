package rahul.algo.searchsort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a method to sort an array of strings so that all the anagrams are next to each
 * other
 * @author rahul
 *
 */
public class StringComparator implements Comparator<String>{
	
	public static void main(String[] args) {
		String[] s = {"cat","bat","tac","tab","identity"};
		Arrays.sort(s,new StringComparator());
	}
	
	
	
	@Override
	public int compare(String o1, String o2) {
		String s1=sort(o1);
		String s2=sort(o2);
		return s1.compareTo(s2);
	}



	private String sort(String o2) {
		// TODO Auto-generated method stub
		char[] a = o2.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
	
}
