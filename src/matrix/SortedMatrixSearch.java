package matrix;
import java.util.*;

class Coordinate implements Comparable<Coordinate>{
	int x;int y;
	Coordinate(int a,int b){
		x=a;y=b;
	}
	public int compareTo(Coordinate c){
		return this.x-c.x;
	}
}
public class SortedMatrixSearch {

	public static void main(String[] args) {
		int[][] m = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
              };
		
		Coordinate a = search(m,290,0,m[0].length-1);
		System.out.println(a.x+" "+a.y);
	}

	private static Coordinate search(int[][] m, int x,int r,int c) {
		if(r<0 || c<0 || r>m.length-1 || c>m[0].length-1)
			return new Coordinate(-1,-1);
		else{
			int n = m[r][c];
			if(n==x)
				return new Coordinate(r,c);
			else if(n>x)
				return search(m,x,r,c-1);
			else 
				return search(m,x,r+1,c);
		}
	}

}

class CoordinateComparator implements Comparator<Coordinate>{
	public int compare(Coordinate a,Coordinate b){
		return a.x-b.x;
	}
}