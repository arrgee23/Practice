package codemonk;

import java.util.Scanner;
public class Array3 {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t !=0){
			
			int n=sc.nextInt();
			long x=sc.nextLong();
			long[] arr= new long[n];
			
			// cumulative array
			arr[0]=sc.nextLong();
			for (int i = 1; i < arr.length; i++) 
				arr[i]=sc.nextLong()+arr[i-1];
			
			if(conditionCheck(arr,x))
				System.out.println("YES");
			else
				System.out.println("NO");
			
			t--;
		}
	}

	private static boolean conditionCheck(long[] arr, long x) {
		
		int l=0;int r=0;
		while(l<arr.length && r<arr.length && l<=r){
			
			if(getSum(arr,l,r)==x)
				return true;
			if(getSum(arr,l,r)>x){
				l++;
			}
			else{
				r++;
			}
		}
		return false;
	}

	private static long getSum(long[] arr, int l, int r) {
		if(l>0)
			return arr[r]-arr[l-1];
		return arr[r];
	}

}
