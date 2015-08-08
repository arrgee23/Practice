package rahul.interview;

public class TreeNode {
	int val;
	TreeNode l;
	TreeNode r;
	
	TreeNode(int n){
		this.val = n;
		this.l=null;
		this.r=null;
	}
	TreeNode(){
		this(0);
	}
	static void preorder(TreeNode root){
		if(root==null) return;
		else{
			System.out.print(root.val+" ");
			preorder(root.l);
			preorder(root.r);
		}
	}
}
