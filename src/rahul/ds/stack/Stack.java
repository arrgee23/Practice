package rahul.ds.stack;

public class Stack {
	private int size;
	private int[] arr;
	private int top;
	
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	//empty constructor makes a stack of 100 elements 
	Stack(){
		size = 100;
		arr = new int[size];
		top = -1;
	}
	Stack(int n){
		size = n;
		arr = new int[size];
		top = -1;
	}
	public boolean push(int n){
		if(top == size-1)
			return false;
		else{
			arr[++top] = n;
			return true;
		}
	}
	public int top(){
		if(top != -1)
			return arr[top];
		return 999;
	}
	public boolean pop(){
		if(top==-1)
			return false;
		else{
			top--;
			return true;
		}
	}
}
