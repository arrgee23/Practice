package other;

import java.util.Scanner;


public class Test {
	public static String readLine(){
		Scanner s = new Scanner(System.in);
		String st = s.nextLine();
		s.close();
		return st;
	}
	public static void main(String[] args) {
		
		readLine();
	}
}


