package matrix;
/*
 * Given a boolean 2D array, where each row is sorted. 
 * Find the row with the maximum number of 1s.
 */
public class MaxOne {
	static int findFirst1(int[] a,int l,int r){
		if(l>r)
			return -1;
		else{
			int mid=(l+r)/2;
			if(a[mid]==1){
				// search for 1s to the left
				int n=findFirst1(a, l, mid-1);
				return n==-1 ? mid : n; // if no such element found mid is the last
			}else{
				//search in the right side
				return findFirst1(a, mid+1, r);
			}
		}
	}
	public static void main(String[] args) {

	}

}
