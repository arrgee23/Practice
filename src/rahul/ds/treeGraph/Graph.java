package rahul.ds.treeGraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// adjacency list representation
public class Graph {
	private final int v;
	private LinkedList<Integer>[] adj;
	private int e;
	
	// validate vertex
	private void validateVertex(int v) {
        if (v < 0 || v >= this.v)
            throw new IndexOutOfBoundsException("vertex " + v + " is not between 0 and " + (this.v-1));
    }
	
	// creates a graph with v vertices
	Graph(int v){
		this.e = 0;
		this.v = v;
		this.adj = new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i] = new LinkedList<Integer>();
	}
	Graph(Scanner s){
		this(s.nextInt());
		int E = s.nextInt();
		if (e < 0) throw new IllegalArgumentException("Number of edges must be nonnegative");
		for (int i = 0; i <E; i++) {
            int v = s.nextInt();;
            int w = s.nextInt();;
            addEdge(v, w);
            //System.out.println("executing "+(i+1)+"th time");
        }	
	}
	
	// add an edge v-w
	void addEdge(int v,int w){
		validateVertex(v);
		validateVertex(w);
		e++;
		adj[v].add(w);
		adj[w].add(v);
	}
	
	LinkedList<Integer> adj(int v) // adjacent vertices to v
	{
		return adj[v];
	}
	int V(){ // no of vertices
		return v;
	}
	int E(){ // no of edges
		return e;
	}
	public String toString() {
        StringBuilder s = new StringBuilder();
        String NEWLINE = System.getProperty("line.separator");
        s.append(v + " vertices, " + e + " edges " + NEWLINE);
        for (int v = 0; v < this.v; v++) {
            s.append(v + ": ");
            ListIterator<Integer> it = adj[v].listIterator();
            while(it.hasNext()){
            	Integer w = (Integer)it.next();
            	s.append(w + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }
	
	public static void main(String[] args) {
		//In in = new In(args[0]);
		//Graph g = new Graph(in);
		String file = "graph.txt";
		try {
			Scanner s = new Scanner(new File(file));
			//Scanner s = new Scanner(System.in);
			
			Graph g =  new Graph(s);
			System.out.println(g);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
