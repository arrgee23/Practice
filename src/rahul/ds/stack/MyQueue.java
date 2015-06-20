package rahul.ds.stack;

public class MyQueue {
	Stack e;
	Stack d;
	
	MyQueue(){
		d = new Stack();
		e = new Stack();
	}
	
	boolean enqueue(int n){
		return e.push(n);
	}
	
	int dequeue(){
		// if the dequeue stack is empty push the items from the enqueue stack 
		if(d.getTop() == -1){
			while(e.getTop() != -1){
				d.push(e.top());
				e.pop();
			}
		}
		// if it still is non empty
		if(d.getTop() != -1){
			int ret = d.top();
			d.pop();
			return ret;
		}
		else return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q = new MyQueue();
		for(int i = 0; i<10;i++){
			q.enqueue(i);
		}
		for(int i = 0; i<5;i++){
			System.out.println(q.dequeue());
		}
		for(int i = 0; i<10;i++)
			q.enqueue(i+10);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());System.out.println(q.dequeue());
		System.out.println(q.dequeue());System.out.println(q.dequeue());System.out.println(q.dequeue());System.out.println(q.dequeue());
		System.out.println(q.dequeue());System.out.println(q.dequeue());
	}

}
