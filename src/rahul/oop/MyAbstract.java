package rahul.oop;

// abstract class can have some implementation
// 0-100% abstraction
abstract class Burger{
	String breadType;
	Burger(){
		breadType = "1";
	}
	abstract void showIngredients() ;
}

class ChickenBurger extends Burger{
	/*ChickenBurger(){
		super();
	}*/
	void showIngredients() {
		System.out.println("6kn");
	}

}

class vegBurger extends Burger{
	void showIngredients() {
		System.out.println("alu");
	}
}
public class MyAbstract {

	public static void main(String[] args) {
		ChickenBurger b = new ChickenBurger();
	}

}
