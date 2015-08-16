package rahul.ds.treeGraph;
class Node{
	Node[] link;
	int delim;
	
	Node(){
		link = new Node[26];
		delim =0;
	}
}

public class Tries {
	Node root;
	int count;
	
	static int getIndex(char c){
		return c-'a';
	}
	
	Tries(){
		root = new Node();
		count =0;
	}
	void insert(String s){
		Node cursor = root;
		int i;
		for(i=0;i<s.length();i++){
			char c = s.charAt(i);
			int index = Tries.getIndex(c);
			
			if(cursor.link[index]==null){ // no element
				cursor.link[index] = new Node();
			}
			cursor = cursor.link[index];
		}
		cursor.delim = 1; // mark it as end
		count++;
	}
	boolean search(String s){
		Node cursor = root;
		
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			int index = Tries.getIndex(c);
			
			if(cursor.link[index]==null){ // no element
				return false;
			}
			cursor = cursor.link[index];
		}
		if(cursor.delim==1)
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		Tries t = new Tries();
		t.insert("antarktica");
		t.insert("ant");
		t.insert("bat");
		t.insert("batman");
		System.out.print(t.search("birdman"));
	}
}
