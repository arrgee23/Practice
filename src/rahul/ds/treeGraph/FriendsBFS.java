package rahul.ds.treeGraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class FriendsBFS {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s=new Scanner(new File("test.txt"));
		
		int[][] graph = new int[26][26];
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph.length; j++) {
				if(i!=j)
					graph[i][j] = Integer.MAX_VALUE;
			}
		}
		int t=5;
		char b='A';
		int base=b;
		
		while(t!=0){
			char ch1=s.next().charAt(0);
			char ch2=s.next().charAt(0);
			int f1=ch1-base;
			int f2=ch2-base;
			
			graph[f1][f2] = 1;
			graph[f2][f1] = 1;
			t--;
		}
		// graph is done
		// do bfs here
		System.out.println(returnDiff(4,5,graph));
	}

	private static int returnDiff(int from, int to, int[][] graph) {
		 HashMap<Integer,Boolean> h = new HashMap<Integer, Boolean>();
		 Queue<Integer> q = new LinkedList<Integer>();
		 
		 // initialize 
		 q.add(from);
		 h.put(from, true);
		 int distance = 0;
		 int size = 1;
		 
		 while(!q.isEmpty()){
			 int curr=q.poll();
			 size--;
			 if(curr==to)
				 return distance;
			 
			 for (int i = 0; i < graph[curr].length; i++) {
				if(graph[curr][i] != Integer.MAX_VALUE && !h.containsKey(i)){
					q.add(i);
					h.put(i,true);
				}
			}
			 // we have reached the end of a level
			if(size==0){
				size=q.size();
				distance++;
			}
		 }
		 return -1;
	}

}
