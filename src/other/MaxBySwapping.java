package other;
import java.util.*;

class Pair{
	public int n;public int index;
	Pair(int a,int b){
		n=a;index=b;
	}
}

public class MaxBySwapping {

	public static void main(String[] args) {
		int[] arr ={5,1,3,7,3,4,6,2};
		int k=2;
		int swaps=0;
		
		for(int i=0;i<arr.length-1 && swaps<k;i++){
			int n=arr[i];
			
			int max=Integer.MIN_VALUE;
			int maxIndex=-1;
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>max){
					max=arr[j];
					maxIndex=j;
				}
			}
			if(max>n){
				arr[maxIndex]=arr[i];
				arr[i]=max;
				swaps++;
			}
		}
		
		/*
		// approach with priority queue
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>(arr.length,new PairComparator());
		for (int i = 0; i < arr.length; i++) {
			pq.add(new Pair(arr[i], i));
		}
		
		for(int i=0;i<arr.length-1 && swaps<k;i++){
			Pair a = pq.peek();
			if(a.n>arr[i] && a.index>arr[i]){
				// swap in array
				arr[a.index]=arr[i];
				arr[i]=a.n;
				
				// swap in pq
				pq.poll()
			}
		}*/
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			//Pair a = pq.poll();
			
			//System.out.println(a.n+" "+a.index);
		}

	}

}

class PairComparator implements Comparator<Pair>{
	public int compare(Pair a,Pair b){
		if(a.n-b.n != 0)
			return b.n-a.n;
		else
			return b.index-a.index;
	}
}