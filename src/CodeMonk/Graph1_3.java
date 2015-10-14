package CodeMonk;

import java.util.Scanner;

public class Graph1_3 {
	static boolean graph[][];
	static boolean visited[];
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		graph = new boolean[n+1][n+1];
		visited = new boolean[n+1];
		
		for (int i = 0; i < e; i++) {
			int a=s.nextInt();
			int b=s.nextInt();
			graph[a][b]=true;
		}
		int min=Integer.MAX_VALUE;
		for(int i=1;i<=n;i++){
			int res=dfs(i);
			refreshVisited();
			
			if(res<min)
				min=res;
		}
		System.out.println(min);
	}
	private static void refreshVisited() {
		for(int i=0;i<visited.length;i++)
			visited[i]=false;
		
	}
	static int dfs(int i) {
		
		// mark itself visited
		visited[i]=true;
		int sum=1; // count itself
		
		// do dfs in all nodes that are connected
		for(int j=1;j<graph[i].length;j++){
			
			if(graph[i][j]==true){ // if theres a connection from i to j
				int adjNode=j; 
				if(!visited[adjNode]) // if that connected node is unvisited, visit it
					sum += dfs(j);
			}
		}
		
		return sum;
	}
}
