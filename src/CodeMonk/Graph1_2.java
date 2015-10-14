package CodeMonk;

import java.util.HashMap;
import java.util.Scanner;

public class Graph1_2 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		
		while(t>0){
			HashMap<Integer,Boolean> h= new HashMap<Integer, Boolean>();
			int n=s.nextInt();
			for (int i = 0; i < n; i++) {
				h.put(s.nextInt(),true);
				h.put(s.nextInt(),true);
			}
			System.out.println(h.size());
			t--;
		}
	}
}
