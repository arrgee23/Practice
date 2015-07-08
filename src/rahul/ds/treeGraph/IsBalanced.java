package rahul.ds.treeGraph;

public class IsBalanced {
	public static boolean isBalanced(BinaryTree b){
		return (b.height(b.root) - b.minHeight(b.root) <= 1);
	}
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		
		b.root = new TreeNode(1);
		b.root.right = new TreeNode(2);
		b.root.left = new TreeNode(2);
		System.out.println(isBalanced(b));
		b.root.right = new TreeNode(2);
		System.out.println(isBalanced(b));
		b.root.right.right = new TreeNode(2);
		System.out.println(isBalanced(b));
		b.root.right.right.right = new TreeNode(2);
		System.out.println(isBalanced(b));
	}
}
