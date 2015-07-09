package rahul.ds.treeGraph;

public class GraphNode {
	public String color; // one of white,grey,black
	public int value;
	
	GraphNode(){
		color = "white";
	}
	GraphNode(int n){
		this();
		value = n;
	}
}
