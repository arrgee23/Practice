package teach;

public class Enum {
	// normal enum with default values
	enum Suit{
		HEARTS,SPADE,CLUBS,DIAMONDS;
	}
	enum SpecialSuit{
		HEARTS (1), //calls constructor with value 1
		SPADE (2),
		DIAMONDS (3),
		CLUBS (4);
		
		// member variables
		int value;
		/* this a normal enum constructir
		SpecialSuit(int a){
			
		}*/
		SpecialSuit(int a){
			this.value = a;
		}
		void foo(){
			System.out.print("foo");
		}
	}
	Suit suit;
	int value;
	SpecialSuit splSuit;
	
	Enum(String suit,int value){
		if(suit.equals("hearts")){
			this.suit = Suit.CLUBS;
			this.splSuit = SpecialSuit.CLUBS;
			
		}
		this.value = value;
	}
	public static void main(String[] args) {
		Enum a = new Enum("hearts",3);
		Enum b = new Enum("random",7);
		
		System.out.println(a.splSuit);
		a.splSuit.foo();
		System.out.println(b.suit);
	}
}
