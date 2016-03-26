package rahul.algo.searchsort;

import java.util.Iterator;
import java.util.LinkedList;

public class InsertionSort {
	static void sort(LinkedList<Double> arr){
		for(int i=1;i<arr.size();i++){
			
		}
	}
	public static void main(String[] args) {
		LinkedList<Double> arr = new LinkedList<Double>();
		for(int i=0;i<9;i++){
			arr.add(Math.random());
		}
		
		Iterator<Double> it = arr.iterator();
		
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.out.println();
		sort(arr);
		
		Iterator<Double> it2 = arr.iterator();
		
		while(it2.hasNext()){
			System.out.print(it2.next()+" ");
		}
	}

}
