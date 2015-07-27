package rahul.algo.searchsort;

public class AllSorts {
	// large no of swaps 
	// after every iteration largest element is 
	// bubbled to the end
	public static void bubbleSort(int[] a){
		
		for (int i = 0; i < a.length; i++) {
			// bubble ith element forward
			boolean atLeastOneSwap = false;
			
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]){ // not in proper position
					// swap them
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					atLeastOneSwap = true;
				}
			}
			// if no swap has happened then the array is sorted
			if(atLeastOneSwap==false)
				break;
		}
	}

	// select the minimum element at each iteration and exchange it with the 
	// proper indexed element
	public static void selectionSort(int[] a){
		
		for(int i = 0; i < a.length-1; i++){
			int min = a[i];
			int minIndex = i;
			
			// find the min
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<min){
					min = a[j];
					minIndex = j;
				}
			}
			
			// finally swap the minimum no with ith number
			int temp = a[i];
			a[i]=a[minIndex];
			a[minIndex] = temp;
		}
	}
	
	public static void mergeSort(int[] a,int l,int r){
		if(l<r){
			int mid = (l+r)/2;
			// sort left half
			mergeSort(a, l, mid);
			// sort right half
			mergeSort(a,mid+1,r);
			
			merge(a,l,mid,r); // merge this two halves
		}
	}
	
	private static void merge(int[] a, int l, int mid, int r) {
		// make two temp arrays o store elements of a[l...mid] and a[mid+1...r]
		int ll=mid-l+1;
		int rr = r-mid;
		int[] left = new int[ll];
		int[] right = new int[rr];
		
		// copy the elements
		for (int i = 0; i < right.length; i++) {
			right[i]=a[mid+1+i];
		}
		for (int i = 0; i < left.length; i++) {
			left[i]=a[l+i];
		}
		
		// merge them back to original array
		int li=0;int ri=0;
		for (int i = l; i <= r; i++) {
			if(li<left.length && ri<right.length){
				if(left[li]<right[ri]){
					a[i] = left[li++];
				}
				else
					a[i]=right[ri++];
			}
			else{ // any one of the indexes has exceeded
				
				if(li>=left.length){ // copy elements frm right array
					a[i]=right[ri++];
				}
				else
					a[i] = left[li++];
			}
		}
	}

	public static void quickSort(int[] a,int l,int r){
		if(l<r){
			int pivot = pivotize(a,l,r);
			quickSort(a,l,pivot-1);
			quickSort(a,pivot+1,r);
		}
	}
	private static int pivotize(int[] a, int l, int r) {
		// randomly choose a[r] to be pivot element
		int ele = a[r]; // elements left of 'ele' will be smaller than or equal to it
		
		// iterate through the whole array(last element excluded as it is the pivot element) 
		// whenever u get an element<= ele swap it with a[smallerorequalIndex+1] and increment 
		// the smallerOrEqualIndex
		int smallerOrEqualIndex = l-1; // till this element values will be smaller or equal to
		for (int i = l; i < r; i++) {
			if(a[i]<=ele){
				// swap it
				smallerOrEqualIndex++;
				int temp = a[i];
				a[i] = a[smallerOrEqualIndex];
				a[smallerOrEqualIndex] = temp;
			}
				
		}
		//finally insert pivot at its correct position
		smallerOrEqualIndex++;
		a[r] = a[smallerOrEqualIndex];
		a[smallerOrEqualIndex] = ele;
		
		return smallerOrEqualIndex;
	}

	public static void main(String[] args) {
		int arr[] = {12,1,6,98,-4,98};
		
		//quickSort(arr, 0, arr.length-1);
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		
	}

}
