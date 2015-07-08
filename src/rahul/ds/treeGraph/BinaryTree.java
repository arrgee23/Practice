package rahul.ds.treeGraph;

public class BinaryTree {
	
	TreeNode root;
	BinaryTree(){
		root = null;
	}
	void insertBST(int n){
		TreeNode nd = new TreeNode(n);
		if(root==null){
			root = nd;
			return;
		}
		TreeNode temp = root;
		while(true){
			if(temp.value > n){
				if(temp.left != null)
					temp = temp.left;
				else{
					temp.left = nd;
					nd.parent = temp;
					break;
				}
			}
			else{
				if(temp.right != null)
					temp = temp.right;
				else{
					temp.right = nd;
					nd.parent = temp;
					break;
				}
			}
		}
		
	}
	
	void makeBST(int[] a){
		for (int i = 0; i < a.length; i++) {
			insertBST(a[i]);
		}
	}
	
	private void inOrderHelper(TreeNode temp){
		if(temp==null)return;
		else{
			inOrderHelper(temp.left);
			System.out.println(temp.value+" ");
			inOrderHelper(temp.right);
		}
	}
	void inOrder(){
		inOrderHelper(root);
	}
	
	TreeNode BSTSearch(int n){
		TreeNode temp = root;
		while( temp != null && temp.value != n){
			if(temp.value > n)
				temp = temp.left;
			else
				temp = temp.right;
		}
		return temp;
	}
	
	TreeNode succesor(TreeNode t){
		TreeNode left = t.left;
		if(left != null)
			while(left.right != null)
				left = left.right;
		return left;
	}
	
	int height(TreeNode root){
		if(root==null)
			return 0;
		else{
			int lh = height(root.left);
			int rh = height(root.right);
			return lh>rh ? lh+1 : rh+1;
		}
	}
	int minHeight(TreeNode root){
		if(root==null)
			return 0;
		else{
			int lh = height(root.left);
			int rh = height(root.right);
			return lh<rh ? lh+1 : rh+1;
		}
	}
	
	void BSTDelete(int n){
		TreeNode node = BSTSearch(n);
		if(node != null){ // if node not found it needn't be deleted
			
			// both children is null
			if(node.left == null && node.right == null)
				if(node == root)
					root=null;
				else if(node == node.parent.left) // check if its the leftchild of parrent
					node.parent.left = null;
				else
					node.parent.right = null;
			
			//check left child null
			else if(node.left == null && node.right != null)
				// replace node with right child
				if(node == node.parent.left) // check if its the leftchild of parrent
					node.parent.left = node.right;
				else
					node.parent.right = node.right;
			
			//check right child null
			else if(node.left != null && node.right == null)
				// replace node with right child
				if(node == node.parent.left) // check if its the leftchild of parrent
					node.parent.left = node.left;
				else
					node.parent.right = node.left;
		
			else{ // hard case where both children of the node is present
				TreeNode succesor = succesor(node); // find the inorder succesor of the node
				
				// remove succesor
				if(succesor == succesor.parent.left) 
					succesor.parent.left = null;
				else
					succesor.parent.right = null;
				
				// replace node with succesor
				if(node == node.parent.left) 
					node.parent.left = succesor;
				else
					node.parent.right = succesor;
				
				// finally set left and right pointers of succesor in place
				succesor.left = node.left;
				succesor.right = node.right;
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		
		int[] arr = {5,12,2,4,7,23,21,90};
		bst.makeBST(arr);
		
		bst.BSTDelete(5);
		bst.inOrder();
	}
}
