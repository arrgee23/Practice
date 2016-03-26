package rahul.ds.arrays_strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("input"));
		
		String s = sc.next();
		
		System.out.println(count(s));

	}

	private static int count(String s) {
		int count = 0;
		int i=0;
		
		while(i<s.length()){
			if(s.charAt(i)=='1'){
				int j=i+1;
				
				// consume all 0s
				while(j<s.length() && s.charAt(j)=='0' )
					j++;
				if(j<s.length() && s.charAt(j)=='1') // final 1
					count++;
				
				i=j;
			}
				
			else
				i++;
		}
		
		
		return count;
	}

}
