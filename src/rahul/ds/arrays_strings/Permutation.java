package rahul.ds.arrays_strings;
import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.next();
		
		permute(str.toCharArray(),0);
	}

	private static void permute(char[] c, int i) {
		//System.out.println(String.copyValueOf(c));
		if(i>=c.length-1)
			System.out.println(String.copyValueOf(c));
		else{
			for (int j = i; j < c.length; j++) {
				swap(c,i,j);
				permute(c, i+1);
				swap(c,i,j);
			}
		}
		
	}

	private static void swap(char[] c, int i, int j) {
		char tmp = c[i];
		c[i]=c[j];
		c[j]=tmp;
		
	}

}
