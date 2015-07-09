package rahul.ds.treeGraph;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class BFS {
	public static void main(String[] args) {
		String file = "graph.txt";
		try {
			Scanner s = new Scanner(new File(file));
			//Scanner s = new Scanner(System.in);
			
			Graph g =  new Graph(s);
			bfs(g);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void bfs(Graph g) {
		int vertices = g.V();
		for (int i = 0; i < vertices; i++) {
			if(g.getVertex(i).color.equals("white"))
				bfsHelper(g,i);
			
			System.out.println("***************");
		}
		bfsHelper(g,0);
	}

	private static void bfsHelper(Graph g, int i) {
		Queue<GraphNode> q = (Queue<GraphNode>) new LinkedList<GraphNode>();
		GraphNode curr = g.getVertex(i);
		if(curr.color.equals("white"))// unprocessed
		{
			// initialization
			q.add(curr); // start
			curr.color = "black";
			
			while(!q.isEmpty()){
				// dequeue that node
				GraphNode n = q.poll();
				
				// process the node
				System.out.print(n.value+" ");
				
				// add its sibilings to queue
				LinkedList<GraphNode> adj = g.adj(n.value);
				Iterator<GraphNode> it = adj.iterator();
				while(it.hasNext()){
					GraphNode nd= it.next();
					if(nd.color.equals("white")){
						nd.color = "black"; // in case it is added again
						q.add(nd);
						
					}
				}
			}
		}
	}
}
