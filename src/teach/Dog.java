package teach;

public class Dog {
	String name;
	String age;
	
	
	public Dog(String n, String a) {
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	void bark(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("bagal","40");
		
		//d.bark("vow vow");
		System.out.println(d.getName());
	}
}
