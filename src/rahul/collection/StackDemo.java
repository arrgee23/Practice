package rahul.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(3);
		s.push(2);
		
		// one way
		for(Integer item: s)
			System.out.print(item);
		
		// another
		Iterator<Integer> it = s.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.print(s.size());
 	}

}
