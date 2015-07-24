package rahul.algo.searchsort;
/**
 * You are given two sorted arrays, A and B, and A has a large enough buffer at the end
 * to hold B. Write a method to merge B into A in sorted order
 * @author rahul
 */
public class MergeArrays {
	// merge from back
	// n is till what index a has number
	static void merger(int[] a,int[] b,int n){
		int i=n;
		int j=b.length-1;
		int k = a.length-1;
		
		while(i>=0 && j>=0)
			if(a[i]>b[j])
				a[k--] = a[i--];
			else
				a[k--] = b[j--];
		
		if(i<=0){
			while(j>=0)
				a[k--] = b[j--];
		}else{
			while(i>=0)
				a[k--] = a[i--];
		}
	}
	public static void main(String[] args) {
		int[] a = {5,12,37,42,0,0,0};
		int[] b = {2,23,63};
		
		merger(a,b,3);
	}
}
