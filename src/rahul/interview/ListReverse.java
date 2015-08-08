package rahul.interview;

public class ListReverse {

	public static void main(String[] args) {
		Node a = new Node(1);
		a.append(2);
		a.append(3);
		a.append(4);
		a.append(5);
		
		a.print();
		
		a= kReverse(a,2);
		a=reverse(a);
		a.print();
	}
	private static Node kReverse(Node start,int k) {
		if(start==null)
			return null;
		else{
			Node l=start;
			Node m=start;
			Node r = start.next;
			
			int i=0;
			while(r!=null && i<k-1){
				m=r;
				r=r.next;
				m.next=l;
				l=m;
				i++;
			}
			start.next=r;
			return l;
		}
	}
	private static Node reverse(Node start) {
		if(start==null)
			return null;
		else{
			Node l=start;
			Node m=start;
			Node r = start.next;
			
			while(r!=null){
				m=r;
				r=r.next;
				m.next=l;
				l=m;
			}
			start.next=null;
			return l;
		}
		
	}

}
