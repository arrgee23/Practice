package rahul.collection;

import java.util.*;

class Pair{
	public Pair(int i, int j) {
		x=i;y=j;// TODO Auto-generated constructor stub
	}
	int x;
	int y;
}
public class PriorityQ {
	public static void main(String[] args) {
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>(10,new PairComparator());
		pq.add(new Pair(2,3));
		pq.add(new Pair(23,22));
		
		System.out.print(pq.poll().x);
		System.out.print(pq.poll().x);
	}
}

class PairComparator implements Comparator<Pair>{
	public int compare(Pair a,Pair b){
		return a.x-b.x;
	}
	
}