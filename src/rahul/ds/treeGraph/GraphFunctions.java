package rahul.ds.treeGraph;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;


public class GraphFunctions {
	/**
	 * Finds if a graph has path from a given node to a given node.
	 * uses DFS
	 * @param g the graph
	 * @param s int source node no
	 * @param d int dest node no
	 * @return true or false
	 */
	public static boolean hasPath(Graph g,int s,int d){
		
		GraphNode src = g.getVertex(s);
		//GraphNode dest = g.getVertex(d);
		
		//mark src as visited
		src.color = "black";
		
		// find all verteces adjacent to src
		if(s==d)
			return true;
		else{
			Iterator<GraphNode> it = g.adj(src.value).iterator();
			while(it.hasNext()){
				GraphNode curr = it.next();
				boolean flag=false;
				if(curr.color == "white"){ // if an unprocessed node
					// check if any of them has a path to dest
					flag=hasPath(g,curr.value,d);
					if(flag == true)
						return true; // if anyone has a path return else continue serarching
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String file = "graph.txt";
		try {
			Scanner s = new Scanner(new File(file));
			//Scanner s = new Scanner(System.in);
			
			Graph g =  new Graph(s);
			System.out.print(hasPath(g,11,10));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
