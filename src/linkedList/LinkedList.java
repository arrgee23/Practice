package linkedList;

public class LinkedList {
	Node head;
	int size;
	
	LinkedList(){
		head = null;
		size = 0;
	}
	
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.n+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	void insert(int i) {
		Node temp = head;
		if(size != 0) {
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(i);
		}else {
			head = new Node(i);
		}

		size++;
	}
	
	boolean delete(int n) {
		if(head == null)
			return false;
		else if(head.n == n) {
			head = null;
			return true;
		}
		else {
			Node temp = head;
			
			// go till the last element
			while(temp.next.next != null) {
				if(head.next.n == n) {	
					head.next = head.next.next;
					
					head = temp; // restore
					return true;
				}
				head = head.next;
			}
			
			// now head points at the element before last.. 
			if(head.next.n== n) {
				head.next = null;
				
				head = temp; // restore
				return true;
			}
			head = temp; // restore
		}
		
		return false;
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.insert(1);
		ll.print();
		ll.insert(2);
		ll.print();
		ll.insert(4);
		ll.insert(6);
		ll.print();
		ll.delete(6);
		ll.print();
		
		ll.print();
		ll.delete(4);
		ll.print();
		ll.delete(2);
		ll.print();
		ll.delete(1);
		ll.print();
		ll.print();
	}
}
