package codevita;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class HotelTrip {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> l = new LinkedList<Integer>();
		//Scanner s = new Scanner(new File("test.txt"));
		while(s.hasNextInt())
			l.addFirst(s.nextInt());
		
		int n = l.remove(0);
		Stack <Integer> stack = new Stack<Integer>();
		printall(l,n,stack,0);
	}

	private static void printall(LinkedList<Integer> l, int n, Stack<Integer> s,int index) {
		if(n==0){
			// print contents of stack
		}
		
	}
}

