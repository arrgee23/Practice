package rahul.ds.treeGraph;

public class TreeNode {
	public int value;
	public TreeNode left;
	public TreeNode right;
	public TreeNode parent;
	TreeNode(){
		left = null;
		right = null;
		parent = null;
	}
	TreeNode(int n){
		this();
		value = n;
	}
	
}
