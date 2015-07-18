package rahul.collection;
import java.util.ArrayList;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer> ();
		a.add(45);
		a.add(10);
		a.add(78);
		a.add(6);
		for(Integer in:a)
			System.out.print(in+" ");
		a.sort(null);
		
		for(Integer in:a)
			System.out.print(in+" ");
		// sorting for arrays 
		int[] arr = {1,67,2,4,1,2,22,12,90,442,123,5,2};
		
		Arrays.sort(arr);
		for(Integer in:arr)
			System.out.print(in+" ");
		
	}

}
