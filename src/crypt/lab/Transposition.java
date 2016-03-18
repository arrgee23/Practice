package crypt.lab;
import java.util.Scanner;


public class Transposition {
	static void print(char[][] mat){
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the key: ");
		String key = s.nextLine();
		key = key.toLowerCase();
		
		
		System.out.print("Enter the plaintext: ");
		String plainText = s.nextLine();
		plainText = plainText.replace(" ", "");
		plainText = plainText.toLowerCase();
		
		char[] c = key.toCharArray();
		
		int[] keyInDigit = new int[c.length];
		
		for (int i = 0; i < keyInDigit.length; i++) {
			keyInDigit[i] = c[i]-'a'+1;
		}
		
		char[][] mat = new char[plainText.length()/c.length + 1][c.length];
		int count = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(plainText.length()>count){
					mat[i][j]=plainText.charAt(count);
					count++;
				}
			}
		}
		print(mat);
		// find the minimum with highest index
		
		for(int i=0;i<keyInDigit.length;i++){
			int min = Integer.MAX_VALUE;
			int minindex = -1;
			
			for(int j=0;j<keyInDigit.length;j++){
				if(keyInDigit[j]<min){
					minindex = j;
					min = keyInDigit[j];
				}
				
			}
			foo(minindex,mat);
			// reset the minindex value so that the next min doesnt find it
			keyInDigit[minindex] = 200;
		}
	}

	private static void foo(int minindex, char[][] mat) {
		for(int i=0;i<mat.length;i++){
			System.out.print(mat[i][minindex]);
		}
		
	}
}