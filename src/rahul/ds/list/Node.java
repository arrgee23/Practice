package rahul.ds.list;

public class Node {
	private int value;
	private Node next;
	
	Node(){
		this.setValue(0);
		this.setNext(null);
	}
	Node (int n){
		this.setValue(n);
		this.setNext(null);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
