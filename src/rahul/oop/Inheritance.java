package rahul.oop;

class Parent{
	int bloodGroup;
}

class Child extends Parent{
	int name;
}

public class Inheritance {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		c.bloodGroup=3;
		
		//c = p; //error
		p = c; // parent class can refer child
	}

}
