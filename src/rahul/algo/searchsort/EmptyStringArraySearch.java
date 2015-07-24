package rahul.algo.searchsort;
/**
 * Given a sorted array of strings which is interspersed with empty strings, write a meth-
 * od to find the location of a given string.
 * @author rahul
 *
 */
public class EmptyStringArraySearch {

	public static void main(String[] args) {
		String[] s = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
		int n = search(s,0,s.length-1,"dad");
		System.out.println(n);
	}

	private static int search(String[] s,int l,int h, String string) {
		if(l>h)
			return -1;
		
		int mid = (l+h)/2;
		
		
		if(s[mid].equals("")){ // we are in a dead position go left or right
			// first go left
			int temp = mid-1;
			while(temp>=l && s[temp].equals(""))
				temp--;
			
			// still if we dont find a non empty element
			if(temp < l){ // time to go right
				temp = mid+1;
				while(temp<=h && s[temp].equals(""))
					temp++;
			}
			// still if we get empty element then the string doesnt exist
			if(temp > h)
				return -1;
			else
				mid = temp;
		}
		
		if(s[mid].equals(string))
				return mid;
		
		if(s[mid].compareTo(string) < 0)// the arr string is smaller than the search str
			return search(s,mid+1,h,string); // search in right half
		
		else // left half
			return search(s,l,mid-1,string);
		
		
	}

}
