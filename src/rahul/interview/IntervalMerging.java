package rahul.interview;

import java.util.*;
import java.io.*;

class Point implements Comparable<Point>{
	int start;
	int end;
	Point(int x,int y){
		start = x;
		end = y;
	}
	public int compareTo(Point p2){
		if(this.start-p2.start == 0)
			return this.end-p2.end;
		else
			return this.start-p2.start;
	}
}
public class IntervalMerging {

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		Scanner s=null;
		try {
			s = new Scanner(new File("points.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int n = s.nextInt();
		Point[] points = new Point[n];
		for (int i = 0; i < points.length; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			points[i] = new Point(x, y);
		}
		//Arrays.sort(points,null);
		pointSort(points);
		for (int i = 0; i < points.length; i++) {
			System.out.print("("+points[i].start+","+points[i].end+") ");
		}
		System.out.println("");
		Stack<Point> stack = pointMerge(points);
		if(stack != null)
			for (int i = 0; i < stack.size(); i++) {
				System.out.print("("+stack.get(i).start+","+stack.get(i).end+") ");
			}
	}

	private static void pointSort(Point[] points) {
		Point min = points[0];
		int index = 0;
		for (int i = 0; i < points.length-1; i++) {
			min = points[i];
			index  = i;
			for (int j = i+1; j < points.length; j++) {
				if(min.compareTo(points[j])> 0){
					min = points[j];
					index = j;
				}
			}
			// swap
			Point temp=points[i];
			points[i]=points[index];
			points[index] = temp;
		}
	}

	private static Stack<Point> pointMerge(Point[] points) {
		if(points.length == 0)
			return null;
		else{
			Stack<Point> s = new Stack<Point>();
			s.push(points[0]);
			for (int i = 1; i < points.length; i++) {
				if(points[i].start <= s.peek().end){
					if(points[i].end > s.peek().end)
						s.peek().end =points[i].end; 
				}
				else{
					s.push(points[i]);
				}
			}
			return s;
		}
	}

}
