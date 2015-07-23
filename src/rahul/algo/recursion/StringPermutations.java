package rahul.algo.recursion;

public class StringPermutations {

	static void permute(StringBuffer s,int i){
		if(i>=s.length()-1) // last char
			System.out.println(s);
		else{
			permute(s,i+1);
			for (int j = i+1; j < s.length(); j++) {
				// swap ith char with every other possible char(including itself)
				//  and call the routine again with i+1 th char
				
				//swap
				char jth = s.charAt(j);
				char ith = s.charAt(i);
				s.setCharAt(j, ith);
				s.setCharAt(i, jth);
				
				// permute
				permute(s, i+1);
				
				// undo swap
				s.setCharAt(j, jth);
				s.setCharAt(i, ith);
			}
		}
	}
	// prints aab as aab,baa,aba no more
	static void permuteExclusive(StringBuffer s,int i){
		if(i>=s.length()-1) // last char
			System.out.println(s);
		else{
			permuteExclusive(s, i+1);
			for (int j = i+1; j < s.length(); j++) {
				// swap ith char with every other possible char(including itself)
				//  and call the routine again with i+1 th char
				
				char jth = s.charAt(j);
				char ith = s.charAt(i);
				if(jth != ith ){ //when chars not same swap
					//swap
					s.setCharAt(j, ith);
					s.setCharAt(i, jth);
					
					// permute
					permuteExclusive(s, i+1);
					
					// undo swap
					s.setCharAt(j, jth);
					s.setCharAt(i, ith);
				}
			}
		}
	}
	public static void main(String[] args) {
		String s = "abac";
		StringBuffer buff = new StringBuffer(s);
		permuteExclusive(buff,0);
	}

}
