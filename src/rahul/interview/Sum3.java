package rahul.interview;

import java.util.*;

public class Sum3 {

	public static void main(String[] args) {
		int[] arr = {1,7,89,33,35,22,8,23,-3,124,3,4,5,10};
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= arr[i];
		}
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>=2;i--){
			int r=i-1;
			int l=0;
			while(l<=r){
				if(arr[l]+arr[r]==arr[i]){
					System.out.println(Math.sqrt(arr[l])+" "+Math.sqrt(arr[r]));
					l++;r--;
				}else if(arr[l]+arr[r]<arr[i])
					l++;
				else
					r--;
			}
		}
	}

}
