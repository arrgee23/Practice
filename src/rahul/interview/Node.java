package rahul.interview;


class Node{
	int val;
	Node next;
	
	Node(int n){
		this.val = n;
		next=null;
	}
	
	void prepend(int n){
		Node n2 = new Node(n);
		n2.next = this.next;
		this.next = n2;
	}
	void append(int n){
		Node n2 = new Node(n);
		Node cursor = this;
		while(cursor.next != null){
			
			cursor = cursor.next;
		}
		cursor.next = n2;
	}
	void print(){
		Node cursor = this;
		while(cursor != null){
			System.out.print(cursor.val+" ");
			cursor = cursor.next;
		}
		System.out.println("");
	}
}
