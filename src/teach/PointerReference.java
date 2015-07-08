package teach;
/**
 * Here it is proved that classes are passed as references to a function
 * whereas for basic datatypes duplicate values() are passed
 * @author rahul
 *
 */
public class PointerReference {
	static void swap(int a,int b){
		a = a+b;
		b = a-b;
		a = a-b;
	}
	
	static void swapAsClass(JustAnInteger a,JustAnInteger b){
		int temp = a.a;
		a.a = b.a;
		b.a = temp;
	}

	
	static void print(int a){
		System.out.print(a+" ");
	}
	public static void main(String[] args) {
		// trying to pass
		int a=5;int b=3;
		swap(a,b);
		print(a);print(b); // 3,5
		
		JustAnInteger aa = new JustAnInteger();
		aa.a = 5;
		JustAnInteger bb = new JustAnInteger();
		bb.a = 3;
		
		swap(aa.a,bb.a);
		print(aa.a);print(bb.a); // 5,3
		
		// passing the class
		swapAsClass(aa, bb);
		print(aa.a);print(bb.a); // output 3,5
	}
}
