package rahul.ds.treeGraph;

public class BstToDll {
	
	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		
		int[] arr = {94,56,3,10,12,45};
		bst.makeBST(arr);
		
		TreeNode head = toDll(bst.root);
		TreeNode c = head;
		do{
			System.out.println(c.value);
			c = c.right;
		}while(c != head);
	}

	private static TreeNode toDll(TreeNode root) {
		if(root == null)
			return root;
		else{
			
			TreeNode prev = toDll(root.left);
			TreeNode next = toDll(root.right);
			
			// make itself a dll
			root.left = root;
			root.right = root;
			
			prev = merge(prev,root);
			
			prev = merge(prev,next);
			
			return prev;
		}
		
	}

	private static TreeNode merge(TreeNode first, TreeNode second) {
		if(first == null)
			return second;
		if(second==null) return first;
		
		TreeNode fl = first.left;
		TreeNode sl = second.left;
		
		fl.right = second;
		second.left = fl;
		
		first.left = sl;
		sl.right = first;
		String s ="dad";
		return first;
	}
}
