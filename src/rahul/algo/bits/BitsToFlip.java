package rahul.algo.bits;
/**
 *  Given two Integers A & B, Print the number of bits to be flipped in order to convert ‘A’ to ‘B’.
 * @author rahul
 *
 */
public class BitsToFlip {
	static StringBuffer intToBinaryString(int a){
		StringBuffer s = new StringBuffer();
		if(a==0)
			s.append(a);
		else{
			while(a!=0){
				if(a%2==1)
					s.append("1");
				else s.append("0");
				
				a = a/2;
			}
			s.reverse();
		}
		
		return s;
	}
	static int bitsToFlip(int a, int b){
		StringBuffer aa = intToBinaryString(a);
		StringBuffer bb = intToBinaryString(b);
		
		// make them of same size append zeros at the higer order bits of the smaller number
		if(aa.length()>bb.length()){
			bb.reverse();
			for (int i = 0; i < aa.length()-bb.length(); i++) 
				bb.append("0");
			bb.reverse();
		}else if(bb.length()>aa.length()){
			aa.reverse();
			for (int i = 0; i < bb.length()-aa.length(); i++) 
				aa.append("0");
			aa.reverse();
		}
		
		int count=0;
		for(int i=0;i<aa.length();i++)
			if(aa.charAt(i)!=bb.charAt(i))
				count++;
		
		return count;
		
	}
	public static void main(String[] args) {
		System.out.println(intToBinaryString(16));
	}

}
