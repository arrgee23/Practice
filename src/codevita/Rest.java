package codevita;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Rest {
	
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner s = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<Integer>();
	
		Scanner s = new Scanner(new File("test.txt"));
		while(s.hasNextInt()){
			l.addFirst(s.nextInt());
		}
		int n=l.remove(0);
		l.sort(null);
		
		System.out.print(n);
	}
}
