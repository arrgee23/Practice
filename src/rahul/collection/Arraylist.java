package rahul.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Using thre ArrayList
 * @author rahul
 **/
class Arraylist{
	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<String>();
		for(int i=0;i<10;i++){
			a.add("foo");
		}
		// print the entire arraylist
		System.out.println(a);
		
		// using size() to print the aray
		for(int i=0;i<a.size();i++)
			System.out.print(a.get(i));
		
		// using iterator
		Iterator<String> it = a.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		a.remove(0);
	}
}
