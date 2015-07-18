package rahul.ds.arrays_strings;

public class Anagram {
	static boolean isAnagram(String s1,String s2){
		// make a hashtable of character counts
		int[] hs1 = new int[256];
		for (int i = 0; i < s1.length(); i++) {
			int j=0;
			char a=s1.charAt(i);
			j=a;
			//System.out.print(j);
			hs1[j]++;
		}
		
		int[] hs2 = new int[256];
		for (int i = 0; i < s2.length(); i++) {
			int j=0;
			char a=s2.charAt(i);
			j=a;
			//System.out.print(j);
			hs2[j]++;
		}
		if(s1.length()!=s2.length())
			return false;
		else{
			for(int i=0;i<256;i++)
				if(!(hs1[i] == hs2[i]))
					return false;
			return true;
		}
	}
	
	public static void main(String[] args){
		System.out.print(isAnagram(" man", " god"));
	}

}
