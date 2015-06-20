package rahul.ds.treeGraph;

public class BinaryTree {
	
	Node root;
	BinaryTree(){
		root = null;
	}
	
	int height(Node root){
		if(root==null)
			return 0;
		else{
			int lh = height(root.left);
			int rh = height(root.right);
			return lh>rh ? lh+1 : rh+1;
		}
	}
	int minHeight(Node root){
		if(root==null)
			return 0;
		else{
			int lh = height(root.left);
			int rh = height(root.right);
			return lh<rh ? lh+1 : rh+1;
		}
	}
}
