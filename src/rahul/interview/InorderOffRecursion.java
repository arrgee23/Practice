package rahul.interview;

import java.util.Stack;

public class InorderOffRecursion {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.l= new TreeNode(2);
		root.r =  new TreeNode(3);
		root.l.l = new TreeNode(4);
		root.l.r = new TreeNode(5);
		
	}

	@SuppressWarnings("unused")
	private static void inorder(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode curr= root;
		s.push(root);
		while(!s.isEmpty()){
			if(curr.l != null){
				s.push(curr.l);
				curr = curr.l;
			}
			else{
				TreeNode n = s.pop();
				System.out.print(n.val+" ");
				if(n.r != null)
					s.push(n.r);
			}
		}
	}
	
	@SuppressWarnings("unused")
	private static void preorder(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode curr= root;
		s.push(root);
		System.out.print(curr.val+" ");
		while(!s.isEmpty()){
			if(curr.l != null){
				s.push(curr.l);
				curr = curr.l;
				System.out.print(curr.val+" ");
			}
			else{
				TreeNode n = s.pop();
				
				if(n.r != null){
					s.push(n.r);
					System.out.print(n.r.val+" ");
				}
			}
		}
	}
	@SuppressWarnings("unused")
	private static void postorder(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode curr= root;
		s.push(root);
		
		while(!s.isEmpty()){
			if(curr.l != null){
				s.push(curr.l);
				curr = curr.l;
		
			}
			else{
				TreeNode n = s.pop();
				System.out.print(n.val+" ");
				if(n.r != null){
					s.push(n.r);
				}
			}
		}
	}

}
