package placement2;

import java.util.*;

public class NextGreaterElement {

	public static void main(String[] args) {
		int t;
		
		Scanner sc = new Scanner(System.in);
		
		t = sc.nextInt();
		
		long[] arr = new long[10000000];
		
		while(t>0) {
			int len = sc.nextInt();
			
			for(int i=0;i<len;i++)
				arr[i] = sc.nextLong();
			
			Stack <Long> st = new Stack();
			
			//System.out.print("-1 ");
			st.push(arr[len-1]);
			
			for(int i=len-2;i>=0;i--)
			{
				while(!st.isEmpty() && st.peek() <arr[i])
					st.pop();
				/*
				if(st.isEmpty())
					System.out.print("-1 ");
				else
					System.out.print(st.peek()+" ");
				*/
				st.push(arr[i]);
			}
			for(int i=0;i<len;i++)
			{
				
					while(!st.isEmpty() && st.peek()<arr[i])
					{
						st.pop();
					}
				if(st.isEmpty())
					System.out.print("-1 ");
				else
					System.out.print(st.peek()+" ");
			
			}
			System.out.println();
			t--;
		}
		
		sc.close();
	}

}
