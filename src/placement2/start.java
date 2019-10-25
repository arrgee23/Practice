package placement2;

import java.util.*;
;

public class start {
	public static void foo(int[][] mat)
	{
		System.out.println(mat[0][0]);
	}
	public static void main(String[] args)
	{
		/*
		Scanner s = new Scanner(System.in);
		
		String ss = "This is a good day"; // read till the next line
		char[] ca = ss.toCharArray();
		Arrays.sort(ca);
		System.out.println(ca);
		
		String[] sa = ss.split(" ");
		
		
		for(String sss: sa)
		{
			System.out.println(sss);
		}
		
		
		Arrays.sort(sa);
		
		for(String sss: sa)
		{
			System.out.print(sss+" ");
		}
		
		int i = sa.length;
		//Arrays.sort(a, fromIndex, toIndex, c);
		
		int[][] mat = new int[10][3];
		mat[0][0] = 1;
		
		for(int k=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.println(mat[k][j]);
			}
		}
		
		foo(mat);
		
		// Stringbuffer for string manipulation
		StringBuffer sb = new StringBuffer("hjgaMANUhashj");
		String str = "hjgaMANUhashj";
		
		sb.delete(sb.indexOf("MANU"),sb.indexOf("MANU")+4);
		System.out.print(sb);
		*/
		char[] carr = {'a','b'};
		String ssss = new String(carr);
		
		System.out.println(ssss);

		Double[] arr = new Double[]{9.3,6.2,7.2,2.2,4.0};

		Arrays.sort(arr,new MyCompare());

		for(double n:arr)
			System.out.print(n+" ");

	}

	
}

 class MyCompare implements Comparator <Double>
	{
		public int compare(Double a,Double b)
		{
			return a>b ? 1:-1;
		}
	}