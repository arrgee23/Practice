package codemonk;

import java.util.Scanner;

public class Array1 {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t !=0){
			StringBuffer s=new StringBuffer(sc.next());
			System.out.println(s.reverse());
			t--;
		}
	}

}
