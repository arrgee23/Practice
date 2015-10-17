package codemonk;

import java.util.Scanner;

class Graph1_1 {
	public static void main(String[] args) {
		//System.out.println("das");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		while(t != 0){
			int m,n;
			n=s.nextInt();
			m=s.nextInt();
			
			boolean graph[][] = new boolean[n+1][n+1];
			long coins[] = new long[n+1];
			boolean visited[] = new boolean[n+1];
			
			/*for(int i=1;i<=n;i++)
				graph[i] = new boolean[i+1];
			*/
			for(int i=1;i<=m;i++){
				int x=s.nextInt();
				int y=s.nextInt();
				//if(x>=y)
					graph[x][y]=true;
				//else
					graph[y][x]=true;
			}
			for(int i=1;i<=n;i++)
				coins[i]=s.nextLong();
			// now process
			
			long max=0;
			for(int i=1;i<=n;i++){
				if(!visited[i]){
					long k=dfs(i,graph,visited,coins);
					if(k>max)
						max=k;
				}
			}
			System.out.println(max);
			t--;
		}
	}

	private static long dfs(int i, boolean[][] graph, boolean[] visited,
			long[] coins) {
		// add itself
		long sum = coins[i];

		// mark itself visited
		visited[i]=true;
		
		// do dfs in all nodes that are connected
		for(int j=1;j<graph[i].length;j++){
			
			if(graph[i][j]==true){ // if theres a connection from i to j
				int adjNode=j; 
				if(!visited[adjNode]) // if that connected node is unvisited, visit it
					sum += dfs(j,graph,visited,coins);
			}
		}
		
		return sum;
	}
	
}
