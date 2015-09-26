package teach;

public class Gen<T> {
	T t;
	Gen(T a){
		t=a;
	}
	
	// generic method
	public static <E> E foo(E a){
		System.out.print(a);
		return a;
	}
	
	public static void main(String[] args) {
		Integer a = foo(134);
		System.out.println(a);
		
		Gen<Integer> g = new Gen<Integer>(45);
		System.out.print(g.t);
	}

}
