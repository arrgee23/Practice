/**
 * 
 */
package rahul.ds.stack;


/**
 * Sorts a stack using only builtin methods.
 * Uses two stacks for doing so.
 * @author Rahul
 * Like selection sort
 */
public class StackSort {

	public static void sort(Stack s){
		Stack aux = new Stack(); // stack to be used for saving data
		
		// uses selection sort
		// at each iteration find the minimum item
		// and push it at the bottom
		// 1st time n pops, 2nd time n-1 pops so on
		int n = s.getTop()+1; // no of items
		
		for(int i=0;i<n;i++){
			int min = Integer.MAX_VALUE;
			
			for(int j=0;j<n-i;j++){
				int p = s.top();
				s.pop();
				if(p<min){ // if the popped no is a candidate for min then dont push it, push the value held before
							// if thats not the initail INT_MAX
					// if not the first temp valu
					if(min != Integer.MAX_VALUE)
						aux.push(min);
					min = p;	
				}
				else // simply push the value in aux array
					aux.push(p);
			}
			// finally push the min in stack
			s.push(min);
			
			// restore the items from aux stack
			while(!aux.isEmpty()){
				s.push(aux.top());
				aux.pop();
			}
		}
	}
	/**
	 * Testing
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(12);s.push(67);s.push(67);s.push(2);s.push(17);s.push(12);s.push(9);
		s.push(-1);
		s.push(12);
		sort(s);
		
		while(!s.isEmpty()){
			System.out.println(s.top());
			s.pop();
		}
	}

}
