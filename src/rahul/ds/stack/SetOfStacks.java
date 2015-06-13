package rahul.ds.stack;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Creates a new stack whenever individual stack's size goes out of bound]
 * */
public class SetOfStacks {
	ArrayList <Stack> s;
	final int MAXSIZE = 3;
	
	public SetOfStacks() {
		// TODO Auto-generated constructor stub
		s = new ArrayList<Stack>();
	}
	boolean myPop(){
		if(s.size() == 0) {
			System.out.println("Set of stack empty could not pop");
			return false;
		}
		else{
			int lastIndex = s.size()-1;
			Stack last = s.get(lastIndex);
			
			if(last.pop() == false){ // empty
				s.remove(lastIndex);
				System.out.println("last stack empty.. removed");
				// recursively apply
				return myPop();
			}
			else{
				System.out.println("popped");
				return true;
			}
		}
	}
	// i is 1 indexed
	boolean customPop(int i){
		if(i>s.size()){ // greater than the total no of stacks
			return false;
		}
		else{
			if(i == s.size()) // the last stack
				myPop();
			else{ // one of the middle stacks
				Stack temp = new Stack((s.size()-i)*MAXSIZE); // make space to store component over the designated stack
				while(s.size() != i){
					
				}
				return false;
			}
		}
		return false;
	}
	boolean myPush(int n){
		// if initially empty allocate a new stack to list
		if(s.size() == 0){
			s.add(new Stack(MAXSIZE));
			Stack last = s.get(s.size()-1);
			last.push(n);
			System.out.println("pushed first stack");
			return true;
		}
		else{
			Stack last = s.get(s.size()-1);
			if(last.push(n)) //last stack in the list still has space
			{
				System.out.println("normal push");
				return true;
			}
			else{	// make a new stack and push
				s.add(new Stack(MAXSIZE));
				Stack last2 = s.get(s.size()-1);
				last2.push(n);
				System.out.println("making newstack then push");
				return true;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetOfStacks s = new SetOfStacks();
		Scanner in = new Scanner(System.in);
		
		int k = in.nextInt();
		
		for(int i=1;i<k;i++){
			s.myPush(i);
		}
		for(int i=1;i<k;i++){
			s.myPop();
		}
		s.myPop();
	}

}
