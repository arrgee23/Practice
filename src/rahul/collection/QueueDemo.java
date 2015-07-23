package rahul.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> l = new LinkedList<String>();
		
		for(int i=0;i<10;i++)
			l.add("foo");
		
		System.out.print(l);
		for(int i=0;i<l.size();i++)
			System.out.print(l.poll());
		
		Iterator <String> it = l.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
