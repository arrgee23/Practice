package rahul.ds.stack;

public class StackWithMin {
	Stack s;
	Stack min;
	
	public StackWithMin() {
		// TODO Auto-generated constructor stub
		s = new Stack();
		min = new Stack();
	}
	
	boolean myPush(int n){
		if(s.push(n)){
			if(min.getTop() == -1) //when min is empty simply push
				min.push(n);
			else{ // when min is not emty simply push the min element of the n and min.top
				min.push(n < min.top() ? n : min.top());
			}
			return true;
		}
		return false;
	}
	
	boolean myPop(){
		if(s.pop()){
			min.pop();
			return true;
		}
		return false;
	}
	int myTop(){
		return s.top();
	}
	int min(){
		return min.top();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithMin s = new StackWithMin();
		s.myPush(17);
		System.out.println(s.min());
		s.myPush(5);
		System.out.println(s.min());
		s.myPush(15);
		System.out.println(s.min());
		s.myPush(3);
		System.out.println(s.min());
		s.myPop();
		System.out.println(s.min());
		s.myPop();
		System.out.println(s.min());
		s.myPop();
		System.out.println(s.min());
	}

}
