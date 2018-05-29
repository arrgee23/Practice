package other;

public class BHeap {
	int[] arr = null;
	int size = 0; // how many numbers are there currently
	int capacity = 0; // max storage
	
	BHeap(int n){
		arr = new int[n];
		capacity = n;
	}
	
	int getLeft(int i) {
		if(2*i<size)
			return 2*i;
		else 
			return -1;
	}
	
	int getRight(int i) {
		if(2*i+1<size)
			return 2*i+1;
		else 
			return -1;
	}
	
	int getParent(int i) {
		return i/2;
	}
	
	void shiftUp(int i) {
		int save = i;
		while(getParent(i)!= -1 && arr[getParent(i)]<arr[save])
			i = getParent(i);
		swap(i,save);
	}
	
	private void swap(int i, int save) {
		int temp = arr[i];
		arr[i] = arr[save];
		arr[save] = temp;
		
	}

	void insert(int n) {
		
	}
	
	void delete(int n) {
		
	}
	
	int showMin() {
		return arr[1];
	}
	
	void makeHeapFromArray() {
		
	}
	
	public static void main(String[] args) {
		

	}

}
