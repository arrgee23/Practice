package rahul.collection; 

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		
		for(int i=0;i<10;i++)
			l.add("foo");
		// linked list normal traversal
		
	
		System.out.print(l);
		for(int i=0;i<l.size();i++)
			System.out.print(l.get(i));
		
		Iterator <String> it = l.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
