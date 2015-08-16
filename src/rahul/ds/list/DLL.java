package rahul.ds.list;
class DllNode{
	int data;
	DllNode prev;
	DllNode next;
	
	DllNode(int n){
		data=n;
		prev=this;
		next=this;
	}
}
public class DLL {
	DllNode start;
	DllNode end;
	
	void printF(){
		DllNode c = start;
		while(c != end){
			System.out.print(c.data+" ");
			c = c.next;
		}
		System.out.println(c.data+" ");
	}
	
	void printB(){
		DllNode c = end;
		while(c != start){
			System.out.print(c.data+" ");
			c = c.prev;
		}
		System.out.println(c.data+" ");
	}
	
	DLL(){
		start=end=null;
	}
	
	void push(int n){
		DllNode d = new DllNode(n);
		
		// first node
		if(start==null){
			start = d;
			end = d;
		}else{
			d.next = start;
			start.prev = d;
			start = d;
		}
	}
	
	void append(int n){
		DllNode d = new DllNode(n);
		
		// first node
		if(start==null){
			start = d;
			end = d;
		}else{
			d.prev = end;
			end.next = d;
			end = d;
			end.next = start;
			start.prev = end;
		}
	}
	
	static DllNode listToBst(DllNode root,int n){
		if(n<=0)
			return null;
		else{
			DllNode mid = root;
			for (int i = 0; i < n/2; i++) {
				mid = mid.next;
			}
			DllNode l=root;
			DllNode r=mid.next;
			
			l=listToBst(l, n/2);
			r=listToBst(r, n-n/2-1);
			
			mid.prev=l;
			mid.next=r;
			return mid;
			
		}
	}
	
	public static void main(String[] args) {
		DLL d = new DLL();
		d.append(1);
		d.append(2);d.append(3);d.append(4);d.append(5);
		//d.printB();
		d.printF();
		
		DllNode root = listToBst(d.start, 5);
		
		inorder(root);
	}

	private static void inorder(DllNode root) {
		if(root!=null){
			inorder(root.prev);
			System.out.println(root.data);
			inorder(root.next);
		}
		
	}

}
