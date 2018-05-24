package other;

public class MaxHeap {
	int[] arr=null;
	int size = 0; //no of elements
	
	MaxHeap(){
		arr = new int[100];
	}
	
	void swap(int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	int getLeft(int n) {
		if(2*n>size) {
			return -1;
		}else
			return 2*n;
	}
	
	int getRight(int n) {
		if(2*n+1>size) {
			return -1;
		}else
			return 2*n+1;
	}
	
	int getParent(int n) {
		if(n/2!=0)
		return n/2;
		return -1;
	}
	void siftUp(int n) {
		int saveVal = arr[n];
		int saveIndex = n;
		
		while(getParent(saveIndex)!=-1 && arr[getParent(saveIndex)]<saveVal) {
			swap(saveIndex,getParent(saveIndex));
			saveIndex = getParent(saveIndex);
			
		}
	}
	
	void siftDown(int i) {
		int saveVal = arr[i];
		int saveIndex = i;
		
		int max = saveVal;
		int maxIndex = i;
		
		int left = getLeft(i);
		if(left != -1) {
			if(arr[left]>max) {
				max = arr[left];
				maxIndex = left;
			}
		}
		
		int right = getRight(i);
		if(right != -1) {
			if(arr[right]>max) {
				max = arr[right];
				maxIndex = right;
			}
		}
		
		// needs siftDown
		if(max!=saveVal) {
			swap(maxIndex,saveIndex);
			siftDown(maxIndex);
			
		}
		
	}
	void print(){
		for(int i=1;i<=size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	void insert(int n) {
		arr[++size] = n;
		if(size==0) {
			
		}else {
			
			siftUp(size);
		}
	}
	
	int extractMax() {
		int save = arr[1];
		if(size!=1) {
			
			arr[1]= arr[size];
			siftDown(1);
			size--;
		}else {
			size = 0;
		}
		return save;
	}
	
	public static void main(String[] args) {
		MaxHeap h = new MaxHeap();
		
		
		h.insert(78);
		h.insert(26);
		h.insert(54);
		h.insert(91);
		h.insert(8);
		
		h.extractMax();
		h.print();
		h.extractMax();
		h.print();
		h.extractMax();
		h.print();
		h.extractMax();
		h.print();
		h.extractMax();
		h.print();
	}

}//91 78 54 26 8 
