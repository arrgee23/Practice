package codevita;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Errorlog {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(System.in); 
		String key = s.nextLine();
		String file = s.nextLine();
		HashMap <String,Integer> h = new HashMap <String,Integer>();
		
		Scanner ss = new Scanner(new File(file));
		while(ss.hasNextLine()){
			String line = ss.nextLine();
			if(line.indexOf(key) != -1){ //match
				String date = line.substring(0, 10);
				if(h.containsKey(date)){
					Integer i = h.get(date);
					i = i+1;
					h.put(date, i);
				}else{ // new
					h.put(date, 1);
				}
			}
		}
		
		for(Map.Entry<String, Integer> e : h.entrySet())
			System.out.println(e.getKey()+" "+e.getValue());
		

	}

}
