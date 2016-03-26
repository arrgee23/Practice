package crypt.lab;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Pair implements Comparable<Pair>{
	String s;
	int count;
	Pair(String s,Integer n){
		this.s=s;
		this.count = n;
	}
	@Override
	public int compareTo(Pair arg0) {
		
		return arg0.count-this.count;
	}
}


public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("input"));
		
		String words=new String("");
		
		while(s.hasNext()){
			words+= s.nextLine();
			
		}
		
		words = words.replace(",", " ");
		words = words.replace(".", " ");
		words = words.replace("!", " ");
		
		words = removeRedundantSpace(words);
		
		//TODO fix fullstop bug
		
		System.out.println(words);
		
		String[] list = words.split(" ");
		
		/*for(String str : list){
			System.out.println(str);
		}*/
		
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		
		for(String word : list){
			if(!h.containsKey(word))
				h.put(word, 1);
			else{
				Integer num = h.get(word);
				num = num+1;
				h.put(word, num);
			}
		}
		
		Set<Entry<String,Integer>> es = h.entrySet();
		
		Iterator<Entry<String,Integer>> it = es.iterator();
		
		ArrayList<Pair> arr = new ArrayList<Pair>();
		while(it.hasNext()){
			Entry<String,Integer> e = (Entry<String, Integer>) it.next();
			//System.out.println(e.getKey()+" "+e.getValue());
			arr.add(new Pair(e.getKey(),e.getValue()));
		}
		Collections.sort(arr);
		//arr.sort(null);
		
		for(Pair p : arr){
			System.out.println(p.s +" : "+p.count);
		}
	}

	private static String removeRedundantSpace(String words) {
		String s="";
		int count = 0;
		while(words.charAt(count) == ' ')
			count++;
		s+=words.charAt(count);
		
		for (int i = count+1; i < words.length(); i++) {
			// if the last char in dummy string is space dont include other space
			if(s.charAt(s.length()-1)==' '){
				if(words.charAt(i) != ' ')
					s+=words.charAt(i);
			}else
				s+=words.charAt(i);
		}
		return s;
	}

}
