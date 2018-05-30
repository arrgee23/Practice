package rahul.oop;

// interfaces are 100% abstract. all variables and methods must be instantiated
interface Shape{
	final int L =0;
	static int K=0; // static and final values can exist initialized
	
	
	//error int k;
	
	//int getVolume();
	abstract int getVolume();
	int getHeight(); // both are same need not start with abstract
}

class Cube implements Shape{
	static int K=3;
	int l =0;
	static {
		K=6;
		//l=8; // error
	}
	
	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		return 0;
	}
	
}

public class MyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
