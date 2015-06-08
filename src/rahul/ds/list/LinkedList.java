package rahul.ds.list;

import java.util.Hashtable;

public class LinkedList {
	Node start;
	
	public LinkedList() {
		this.setStart(null);
	}
	
	public LinkedList(int n){
		this.setStart(null);
		this.append(n);
	}
	
	public LinkedList(int[] n){
		for(int i=0;i<n.length;i++)
			this.append(n[i]);
	}
	
	public LinkedList prepend(int n){
		Node temp = new Node(n);
		
		Node holder = start;
		start = temp;
		start.setNext(holder);
		
		return this;
	}
	
	public LinkedList delete(Node n){
		//if the next node is not null copy the next node
		Node nextNode = n.getNext();
		if(nextNode != null){
			n.setValue(nextNode.getValue());
			n.setNext(nextNode.getNext());
		}
		else{
			Node cursor = this.getStart();
			while(cursor.getNext()!=n)
				cursor = cursor.getNext();
			cursor.setNext(null);
		}
		// now remove nextnode
		
		return this;
	}
	
	public LinkedList printList(){
		Node cursor = start;
		while(cursor != null){
			System.out.print(cursor.getValue()+" ");
			cursor = cursor.getNext();
		}
		System.out.println();
		return this;
	}
	
	public Node reverseRecursive(Node first){
		if(first == null)
			return first;
		Node restList = first.getNext();
		if(restList==null)
			return first;
		else{
			Node newHead = reverseRecursive(restList);
			// now restList points to the last element and the list except the first element is reversed 
			first.getNext().setNext(first);
			first.setNext(null);
			this.setStart(newHead); // 
			return newHead;
		}
	}
	
	public LinkedList reverse(){
		Node prev = null;
		Node curr = this.getStart();
		Node after;
		// at each start of iteration prev points to the reversed array
		// curr and after point to the start of non reversed array.
		while(curr != null){
			after = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = after;
		}
		//finally current is null and prev is the last node in unreversed array
		// or first node in the reversed array
		start = prev;
		return this;
	}
	
	public LinkedList append(int n){
		if(start == null)
			start = new Node(n);
		else{
			Node cursor = start;
			while(cursor.getNext() != null)
				cursor = cursor.getNext();
			cursor.setNext(new Node(n));
		}
		return this;
	}
	/*
	 * Removes duplicates in an unsorted ll
	 * uses hashtable
	 * buggy*/
	public LinkedList removeDuplicates(){
		Hashtable<Integer, Integer> a = new Hashtable<Integer,Integer>();
		Node cursor = this.getStart();
		
		while(cursor != null){
			Node tempNext = cursor.getNext();
			
			// as it is a copy deletion when deleting we dont move the pointer at all
			if(a.containsKey(cursor.getValue()))
				delete(cursor);
			else{
				a.put(cursor.getValue(), cursor.getValue());
				cursor = tempNext;
			}
		}
		return this;
	}
	public Node detectLoop(){
		Node fptr = this.getStart();
		Node ptr = this.getStart();
		
		// loop till they meet
		do{
			// check if any of them is null; in that case the loop doesnt contain cycle
			// as fptr moves faster it suffices to check only fptr
			if(fptr == null || fptr.getNext() == null)
				return null;
			fptr = fptr.getNext().getNext();
			ptr = ptr.getNext();
		}while(fptr != ptr);
		
		// now they meet at k distance before loop start point
		// where k denotes the position of fptr when ptr is at the start of the list for the first time
		// head is also k distance from start point
		fptr = this.getStart(); //  move fptr to the start of the list
		
		// move them one at a time.. where they meet is the loop starting point
		while(fptr != ptr){
			ptr = ptr.getNext();
			fptr = fptr.getNext();
		}
		return fptr;
	}
	
	public Node getStart() {
		return start;
	}

	public void setStart(Node start) {
		this.start = start;
	}
	
	public static void main(String args[]){
		int[] a = {1,2,3,4,5,6,7,8,9};
		LinkedList l = new LinkedList(a);
		
		/* making loop
		Node last = null;
		Node cursor = l.getStart();
		while(cursor.getNext() != null)
			cursor = cursor.getNext();
		last = cursor;
	
		last.setNext(last);*/
		
		/*int[] b = {1,2,7,5,8};
		LinkedList l2 = new LinkedList(b);
		l.delete(l.getStart().getNext().getNext()).printList();
		l.removeDuplicates().printList();
		
		// adding two lists like an adder
		int sum = 1200;int carry = 0;
		LinkedList l3 = new LinkedList();
		Node aptr = l.getStart();
		Node bptr = l2.getStart();
		
		while(!(sum == 0 && carry == 0)){
			int aval=0,bval=0;
			
			if(aptr!=null){
				aval = aptr.getValue();
				aptr = aptr.getNext();
			}
			if(bptr!=null){
				bval = bptr.getValue();
				bptr = bptr.getNext();
			}
			
			sum = (aval+bval+carry)%10;
			carry = (aval+bval+carry)/10;
			l3.append(sum);
		}
		l3.printList();*/
		Node s = l.detectLoop();
		if(s != null)
			System.out.println(s.getValue());
	}
}
