package codechef;

import java.util.HashMap;
import java.util.Scanner;

public class Beginner1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t>0){
			String a = s.next();
			String b = s.next();
			foo(a,b);
			
			t--;
		}

	}

	private static void foo(String a, String b) {

		//HashMap<Character,Boolean> h = new HashMap<Character,Boolean>();
		boolean[] hash = new boolean[256];
		for(char c : a.toCharArray()){
			//h.put(c, true);
			hash[c-'a']=true;
		}
		
		for(char c: b.toCharArray()){
			if(hash[c-'a']){
				System.out.println("YES");
				return;
			}
				
		}
		System.out.println("NO");
		
	}

}
