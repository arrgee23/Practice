package rahul.ds.treeGraph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeFunctions {
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		int[] a = {7,3,10,4,3};
		tree.makeBST(a);
		
		//TreeNode t = firstCommonAncestor(tree.root,tree.root.left.left,tree.root.left.left);
		//System.out.println(t.value);
		makeLinkedListsOfEveryLevel(tree);
		Stack<Integer> s = new Stack<Integer>();
		//pathSum(tree.root,21,s);
		printAllPathSum(tree.root, 10, 0, s);
	}
	/**
	 * Makes every level of the tree a new linkedList
	 * @param tree
	 */
	private static void makeLinkedListsOfEveryLevel(BinaryTree tree) {
		Queue <TreeNode> q = new LinkedList<TreeNode>(); // queue to store
		TreeNode dummy = new TreeNode(); // make a dummy treeNode to mark the end of a level in queue
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		
		/*
		 * the idea is to push children at a level then push the dummy node at the end
		 * and every time pop the nodes till dummy node till the list becomes null
		 */
		
		// start by adding root to the queue followed by dummy node
		if(tree.root != null)
			q.add(tree.root);
		
		q.add(dummy);
		
		// start the process
		while(!q.isEmpty() && q.element() != dummy){ // incase the first element is dummy 
													//	that means the tree is already traversed
			TreeNode popped;
			LinkedList<TreeNode> ll = new LinkedList<TreeNode>();
			
			while(!q.isEmpty() && !(popped=q.poll()).equals(dummy)){
				// popped is a valid treeNode
				ll.add(popped);// add to linked list
				
				// add the children if they are not null to queue
				if(popped.left != null)
					q.add(popped.left);
				
				if(popped.right != null)
					q.add(popped.right);
			}
			// now add the linked list to result arraylist
			lists.add(ll);
			// add the dummy node back
			q.add(dummy);
		}
		
		// finally print the list
		for(int i=0;i<lists.size();i++){
			System.out.print(i+"th level: ");
			for (int j = 0; j < lists.get(i).size(); j++) {
				System.out.print(lists.get(i).get(j).value+" ");
			}
			System.out.println("");
		}
	}
	
	
	/**
	 * Design an algorithm and write code to find the first common ancestor of two nodes
	 * in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
	 * necessarily a binary search tree
	 */
	 // first common ancestor is the node from where u can access both nodes. and it is furtehest away from root

	static TreeNode firstCommonAncestor(TreeNode root,TreeNode a,TreeNode b){
		// start from root and find the node
		int leftCount = countAppearence(root.left,a,b); // returns how many of a and b appears in thr subtree
		int rightCount = countAppearence(root.right,a,b);
		
		if(leftCount == 1 && rightCount == 1) // this is the right node
			return root;
		else if(leftCount == 2){
			TreeNode tn = firstCommonAncestor(root.left, a, b);
			if(tn == null)
				return root; 
			else
				return tn;
		}
		else if(rightCount==2){
			TreeNode tn = firstCommonAncestor(root.right, a, b);
			if(tn == null) // backtrack case when the root itself is the ancestor
				return root; 
			else
				return tn;
		}else{ // left 1 right 0 or right 1 left 0 that means root is one of a or b thus 
			return null;	// return null to backtrack
		}
	}
	// counts how many of a or b appears in subtree excluding root
	private static int countAppearence(TreeNode root, TreeNode a, TreeNode b) {
		if(root==null)
			return 0;
		else{
			int addFactor = 0;
			if(root.equals(a)|| root.equals(b))
				addFactor ++;
			return countAppearence(root.left, a, b)+countAppearence(root.right, a, b)+addFactor;
		}
		
	}
	
	/**
	 * Print all root to leaf path whose sum equals sum
	 * @param root the current node (root when calling)
	 * @param sum = the sum
	 * @param s = the stack to store the values
	 */
	static void pathSum(TreeNode root,int sum, Stack<Integer> s){
		if(root == null)
			return;
		else{
			sum = sum-root.value;
			s.push(root.value); // push the item
			
			if(root.left==null && root.right==null && sum==0){ // got to the last point and the sum matches
				Iterator<Integer> it = s.iterator();
				while(it.hasNext()){
					System.out.print(it.next()+" ");
				}
				System.out.println("");
			}
			else{ // its a valid node
					pathSum(root.left, sum, s);
					pathSum(root.right, sum, s);
				}
			s.pop(); // pop the item back backtrack
		}
	}	

	
	/*
	 * print all paths which sum up to that value. 
	 * Note that it can be any path in the tree-it does not have to start at the root.
	 */
	static void printAllPathSum(TreeNode root,int sum,int level,Stack<Integer> s){
		if(root==null)
			return;
		else{
			s.push(root.value); // push the value
			// check backwards 
			int temp=sum;
			for(int i=level;i>=0;i--){
				temp -= s.get(i);
				if(temp==0)
					printTllNow(s,i,level);
			}
			printAllPathSum(root.left,sum,level+1,s);
			printAllPathSum(root.right,sum,level+1,s);
			s.pop(); // return to the original state
		}
	}
	/**
	 * Helper function for printing stack at allpath sum
	 * @param s
	 * @param i
	 * @param level
	 */
	private static void printTllNow(Stack<Integer> s, int i, int level) {
		System.out.print("at level"+level+" ");
		for(int j=i;j<=level;j++)
			System.out.print(s.get(j)+" ");
		System.out.println("");
	}
}
