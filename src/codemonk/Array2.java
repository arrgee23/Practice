package codemonk;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t !=0){
			String s=sc.next();
			char last=s.charAt(0);
			System.out.print(last);
			for(int i=1;i<s.length();i++){
				if(s.charAt(i)!=last){
					System.out.print(s.charAt(i));
					last=s.charAt(i);
				}
			}
			System.out.println();
			t--;
		}
	}

}
