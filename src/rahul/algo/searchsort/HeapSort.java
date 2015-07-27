package rahul.algo.searchsort;

public class HeapSort {
	
	static int left(int i){
		return i*2;
	}
	static int right(int i){
		return i*2+1;
	}
	static int parent(int i){
		return i/2;
	}
	public static void main(String[] args) {
		int[] a = {0,64,5,90,78,12,-5,39};
		maxHeapify(a);
		heapSort(a);
	}

	private static void heapSort(int[] a) {
		// at each iteration extract the max item from the heap
		
	}
	private static void maxHeapify(int[] a) {
		for (int i = (a.length-1)/2; i >=1; i--) {
			siftDown(a,i);
		}
	}

	private static void siftDown(int[] a,int i) {
		// replaces ith node with the max between its children and itself
		// condition of heap is parent>= child
		int l = left(i);
		int r = right(i);
		
		int largestIndex=i;
		if(l<a.length && a[l]>a[largestIndex])
			largestIndex = l;
		
		if(r<a.length && a[r]>a[largestIndex])
			largestIndex = r;
		
		// swap
		if(largestIndex != i){
			int temp = a[i];
			a[i] = a[largestIndex];
			a[largestIndex] = temp;
			siftDown(a, largestIndex);
		}
	}

}
