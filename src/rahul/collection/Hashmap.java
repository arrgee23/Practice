package rahul.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	
	public static void main(String[] args) {
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		
		h.put("one",1);
		
		Set<Entry<String, Integer>> set = h.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry<String, Integer> m =(Map.Entry<String, Integer>) it.next();
			System.out.print(m.getKey()+m.getValue());
		}
		
		//or
		for(Map.Entry<String, Integer> e : h.entrySet())
			System.out.print(e.getKey()+e.getValue());
		
		//or
		Iterator<Entry<String, Integer>> i = h.entrySet().iterator();
		while(i.hasNext()){
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>)i.next();
			System.out.print(e.getKey()+e.getValue());
		}
	}
}
