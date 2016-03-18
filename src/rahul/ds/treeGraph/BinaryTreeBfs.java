package rahul.ds.treeGraph;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBfs {

	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		int[] a={1,2,3,43,22,11,88,340};
		t.makeBST(a);
		
		Queue <TreeNode> q = new LinkedList<TreeNode>();
		
		q.add(t.root);
		
		while(!q.isEmpty()){
			TreeNode tn = q.poll();
			System.out.print(tn.value+" ");
			if(tn.left != null)
				q.add(tn.left);
			
			if(tn.right != null)
				q.add(tn.right);
		}
	}

}
