package codemonk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StrMatch1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		HashMap<Character,Integer> h = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++){
			if(h.get(str.charAt(i))==null)
				h.put(str.charAt(i),1);
			else{
				h.put(str.charAt(i),h.get(str.charAt(i))+1);
			}
		}
		long down = 1;
		for(Map.Entry<Character, Integer> e : h.entrySet()){
			if(e.getValue()>1)
				down *= fact(e.getValue());
		}
		long up=fact(str.length());
		
		System.out.println(up/down);
		
	}

	private static long fact(Integer value) {
		long num=1;
		for(int i=value;i>1;i--){
			num *=i;
		}
		return num;
	}

}
