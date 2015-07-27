package rahul.interview;
import java.util.*;

public class Josephus {
		static final int N=10;
		static final int K=2;
	
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		for(int i=0;i<N;i++){
			l.add(i);
		}
		
		int i = josephus(l);
	}

	private static int josephus(LinkedList<Integer> l) {
		ListIterator<Integer> it = l.listIterator();
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i)+" ");
		}System.out.println("");
		while(l.size()!=1){
			it = deleteNext(l,it);
			for (int i = 0; i < l.size(); i++) {
				System.out.print(l.get(i)+" ");
			}System.out.println("");
		}
		
		return l.getFirst();
	}
	// delete node k nodes apart returns the node after kth node
	private static ListIterator<Integer> deleteNext(LinkedList<Integer> l,
			ListIterator<Integer> it) {
		int count = K;
		ListIterator<Integer> cursor=it;
		Integer currNode=null;
		while(count != 0){
			if(cursor.hasNext()){
				currNode=cursor.next();
			}
			else{
				cursor = l.listIterator();
				currNode=cursor.next();
			}
			count--;
		}
		cursor.remove();
		
		return cursor;
	}
}
