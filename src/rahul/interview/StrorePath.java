package rahul.interview;

import java.util.Stack;

public class StrorePath {
	static TreeNode retPath(TreeNode root,Stack<TreeNode> s,int n){
		if(root==null){
			return null;
		}else{
			s.push(root);
			if(s.peek().val==n)
				return root;
			else{
				TreeNode ls = retPath(root.l,s,n);
				if(ls==null)
					ls = retPath(root.r,s,n);
				if(ls !=null)
					return ls;
				
				s.pop();
				return null;
			}
		}
	} 
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root.l = new TreeNode(1);
		root.r = new TreeNode(2);
		root.l.l = new TreeNode(3);
		root.l.r = new TreeNode(4);
		root.r.r = new TreeNode(5);
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		retPath(root,s,8);
		
		while(!s.isEmpty()){
			System.out.println(s.pop().val);
		}
	}
}
