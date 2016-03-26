package rahul.ds.treeGraph;

import java.util.Scanner;

class MyNode
{
	int n;
	MyNode left;
	MyNode right;
	
	MyNode(int n){
		this.n=n;
		left=null;
		right=null;
	}
}

class BTree{
	MyNode root;
	public BTree(String s) {
		root = makeTree(root,s);
	}
	void inorder(MyNode root){
		if(root !=null){
			inorder(root.left);
			System.out.print(root.n+" ");
			inorder(root.right);
		}
			
	}
	
	MyNode makeTree(MyNode root,String s){
		String kernel = s.substring(1,s.length()-1);
		if(kernel.length()==0)
			return null;
		else{
			// search the index of the first opening parentheses 
			int i=0;
			while(kernel.charAt(i)!='(')
				i++;
			int n = Integer.parseInt(kernel.substring(0, i));
			
			// search the ending parentheses
			int count = 1;
			int j=i;
			while(count!=0){
				j++;
				if(kernel.charAt(j)=='(')
					count++;
				else if(kernel.charAt(j)==')')
					count--;
				
			}
			String ltree = kernel.substring(i,j+1);
			String rtree = kernel.substring(j+1);
			
			root = new MyNode(n);
			root.left=makeTree(root.left,ltree);
			root.right=makeTree(root.right,rtree);
			return root;
		}
	}
}

public class ParseTree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//String str = s.next();
		String str = "(0(5(6()())(4()(9()())))(7(1()())(3()())))";
		BTree t = new BTree(str);
		
		//t.inorder(t.root);
		System.out.println(findKDistanceSum(t.root,2));
	}

	private static int findKDistanceSum(MyNode root, int i) {
		if(root==null)
			return 0;
		else{
			if(i==0)
				return root.n;
			else
				return findKDistanceSum(root.left, i-1)+findKDistanceSum(root.right, i-1);
		}
	}

}
