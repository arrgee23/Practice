package rahul.ds.treeGraph;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DFS {
	static void dfs(Graph g){
		int vertices = g.V();
		for (int i = 0; i < vertices; i++) {
			if(g.getVertex(i).color.equals("white")) {
				dfsRecr(g,i);
			
			System.out.println("\n***************\n");
			}
		}
	}
	private static void dfsRecr(Graph g,int n) {
		//this node is not yet seen
		if(g.getVertex(n).color.equals("white"))
		{
			// this node is being processed
			g.getVertex(n).color = "gray";
			System.out.print(g.getVertex(n).value+" ");
			
			LinkedList<GraphNode> adj = g.adj(n);
			Iterator<GraphNode> it = adj.iterator();
			while(it.hasNext()){
				GraphNode nd= it.next();
				dfsRecr(g,nd.value);
			}
			g.getVertex(n).color = "black"; // mark this node as completely processed
		}
		else if(g.getVertex(n).color.equals("gray")) {
			// we have reached one of the ancestors through back edge
			System.out.print("("+g.getVertex(n).value+")"+"--cycle--");
		}
	}
	public static void main(String[] args) {
		String file = "graph.txt";
		try {
			Scanner s = new Scanner(new File(file));
			//Scanner s = new Scanner(System.in);
			
			Graph g =  new Graph(s);
			dfs(g);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
