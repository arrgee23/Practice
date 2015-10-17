package codemonk;

import java.util.Scanner;

public class Graph1_4 {
	
	public static void main(String[] args) {
		int sum=0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			sum+=s.nextInt();
		}
		if(sum==2*(n-1))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
