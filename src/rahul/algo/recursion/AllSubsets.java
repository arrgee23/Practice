package rahul.algo.recursion;

import java.util.ArrayList;
import java.util.Iterator;

public class AllSubsets {
	static ArrayList<Integer> a;
	static{
		a=new ArrayList<Integer>();
	}
	static void printAllSubset(int[] arr,int i,ArrayList<Integer> a){
		if(i>=arr.length){ // print after including all numbers
			print(a);
		}
		else{
			// inclusion exclusion
			a.add(arr[i]);
			printAllSubset(arr, i+1,a);
			a.remove(a.size()-1);
			printAllSubset(arr, i+1,a);
		}
	}
	
	// bits approach
	static void printAllSubset2(int[] arr){
		int n = arr.length;
		int total = 1<<n; //2^n one subset for each bit pattern
		// ith bit 1 means ith number is in the subset 0 menas not
		
		for (int i = 0; i < total; i++) {
			// print values for the bitpattern of i
			int num = i;
			int j=0;
			while(num!=0){
				//check if the LSB is 1 and right shift
				if((num & 1) == 1){
					System.out.print(arr[j]);
				}//else System.out.print("0");
				
				j++;
				num >>=1;
			}
			System.out.println("");
		}
	}
	private static void print(ArrayList<Integer> a2) {
		Iterator<Integer> it = a.iterator();
		
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println("");
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		printAllSubset2(arr);
	}

}
