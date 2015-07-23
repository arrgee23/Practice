package rahul.algo.recursion;

import java.util.Iterator;
import java.util.Stack;


public class MatchingParens {
	static int size;
	// function to print all pairs of matching parenthesis
	static void matchingParens(int n){
		Stack<Character> parens = new Stack<Character>();
		size = n;
		helper(n,n,parens);
	}
	private static void helper(int open, int close, Stack<Character> parens) {
		// base condition
		if(open == 0 && close == 0){
			Iterator<Character> it = parens.iterator();
			while(it.hasNext())
				System.out.print(it.next());
			System.out.println("");
		}
		else if(open==close) // both equal then generate an opening brace
		{
			parens.push('(');
			helper(open-1, close, parens);
			parens.pop(); //undo
		}else if(open==0){ // generate only a closing brace
			parens.push(')');
			helper(open, close-1, parens);
			parens.pop(); //undo
		}else{
			// do both
			parens.push('(');
			helper(open-1, close, parens);
			parens.pop(); //undo
			
			parens.push(')');
			helper(open, close-1, parens);
			parens.pop(); //undo
		}
	}
	public static void main(String[] args) {
		matchingParens(3);
	}

}
