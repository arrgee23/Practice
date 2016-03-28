package crypt.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Tuple implements Comparable<Tuple>{
	char s;
	int count;
	Tuple(char s,Integer n){
		this.s=s;
		this.count = n;
	}
	@Override
	public int compareTo(Tuple arg0) {
		return arg0.count-this.count;
	}
}

public class Substitution {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("input"));
		
		String words=s.next();
		int[] hash = new int[26];
		
		for(char c : words.toCharArray()){
			hash[c-'A']++;
		}
		ArrayList<Tuple> t =new ArrayList<Tuple>();
		for(int i=0;i<26;i++){
			t.add(new Tuple((char) ('A'+i),hash[i])); 
		}
		Collections.sort(t);
		
		for(Tuple a : t){
			System.out.println(a.s+" "+a.count);
		}
	}

}
