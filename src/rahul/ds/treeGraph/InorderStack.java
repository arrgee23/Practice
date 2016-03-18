package rahul.ds.treeGraph;

import java.util.Stack;

public class InorderStack {

	public static void main(String[] args) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		BinaryTree t = new BinaryTree();
		int[] a = {1,6,3,10,45,22,88,11,100};
		
		t.makeBST(a);
		
		
		// inorder
		TreeNode ptr = t.root;
		do{
			while(ptr!=null){
				s.push(ptr);
				ptr = ptr.left;
			}
			// nothing to push in left
			TreeNode top = s.pop();
			//System.out.print(top.value+" ");
			ptr = top.right;
			
		}while(!s.isEmpty() || ptr != null);
		
		
		// preorder
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		
		s2.push(t.root);
		
		while(!s2.isEmpty()){
			TreeNode n = s2.pop();
			System.out.println(n.value);
			if(n.right !=null)
				s2.push(n.right);
			if(n.left!=null)
				s2.push(n.left);
		}
	}

}
