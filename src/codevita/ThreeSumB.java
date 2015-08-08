package codevita;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumB {
	public static boolean threeSum(int[] A,int sum) {
		
		// sort array
		Arrays.sort(A);
		int l,r;
		
		/* Now fix the first element one by one and find the
	       other two elements */
	    for (int i = 0; i < A.length- 2; i++)
	    {
	 
	        // To find the other two elements, start two index variables
	        // from two corners of the array and move them toward each
	        // other
	        l = i + 1; // index of the first element in the remaining elements
	        r = A.length-1; // index of the last element
	        while (l < r)
	        {
	            if( A[i] + A[l] + A[r] == sum)
	            {
	                //printf("Triplet is %d, %d, %d", A[i], A[l], A[r]);
	                return true;
	            }
	            else if (A[i] + A[l] + A[r] < sum)
	                l++;
	            else // A[i] + A[l] + A[r] > sum
	                r--;
	        }
	    }
	 
		return false;
	}
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner s = new Scanner(System.in);
		Scanner s = new Scanner(new File("test.txt"));
		int n = s.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int c=s.nextInt();
		if(threeSum(a,c)==true)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
