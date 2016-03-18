package matrix;

import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
	int val;
	int index;
	
	Pair(int a,int b){
		val=a;
		index=b;
	}
	
	@Override
	public int compareTo(Pair o) {
		
		return this.val-o.val;
	}
	
}

/*
 * Print all elements in sorted order from row and column wise sorted matrix
 */
public class MatrixSorted {
	
	
	public static void main(String[] args) {
		int mat[][]  =  { {10, 20, 30, 40},
                			{15, 25, 35, 45},
                			{27, 29, 37, 48},
                			{32, 33, 39, 50},
              };
		//int mat[][] = {{1,2,3},{5,6,9}};
		
		PriorityQueue<Pair> q= new PriorityQueue<Pair>();
		
		// keeping the indexes of of current elements added from each row
		// indexes[0] stores the index of the element frm mat
		int[] indexes = new int[mat.length];
		
		//populate the priority queue initially
		for (int i = 0; i < mat.length; i++) {
			q.add(new Pair(mat[i][0], i)); // input row too
		}
		
		while(!q.isEmpty()){
			Pair n = q.poll(); // get the topmost element
			System.out.print(n.val+" "); // print val
			
			// get the next element from the same row
			int rowOfExtractedElement = n.index;
			indexes[rowOfExtractedElement]++; // increment the element ptr
			
			if(indexes[rowOfExtractedElement]<mat[0].length)
				q.add(new Pair(mat[rowOfExtractedElement][indexes[rowOfExtractedElement]], rowOfExtractedElement));
			
			else{ // select any other element to add
				for(int i=0;i<mat.length;i++)
					if(indexes[i]<mat[0].length){
						indexes[i]++;
						if(indexes[i]<mat[0].length)
							q.add(new Pair(mat[i][indexes[i]],i));
						
					}
			}
		}
	}
}
