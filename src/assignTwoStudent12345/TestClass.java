package assignTwoStudent12345;

public class TestClass {

	public TestClass() {  // constructor for TestClass 
		
	}
	
	public void runtest1() {
		// first test case
		Apartment myApartment = new Apartment(2,3,3,true,new Person("foo1","foo"),1234);
		Person p= new Person("papai","kolkata");
		myApartment.setApartmentLetter('A');
		myApartment.setAvailable(true);
		myApartment.setFloorNumber(7);
		myApartment.setNumberOfBathrooms(2);
		myApartment.setNumberOfBedrooms(2);
		myApartment.setNumberOfLiving(4);
		myApartment.setOwner(p);
		myApartment.setRent(7000);
		
		System.out.println(myApartment.toString());
		
	}
	
	public void runtest2() {
		// second test case
		Person p = new Person("arrgee","32 red road");
		System.out.print(p.toString());
		
	}
	
	public void runtest3() {
		// third test case
		Building building = new Building("BurzKhalifa", 30);
		building.addApartment(new Apartment(2,3,3,true,new Person("foo1","foo"),1234));
		building.addApartment(new Apartment(2,3,3,true,new Person("foo1","foo"),1234));
		building.addApartment(new Apartment(2,3,3,true,new Person("foo1","foo"),1234));
		
		System.out.println(building.toString());
	}
	
	public static void main(String[] args) {
		// TODO write code here 
		TestClass mytest = new TestClass();
		System.out.println("Running test1... ");
		mytest.runtest1();
		System.out.println("Running test2... ");
		mytest.runtest2();
		System.out.println("Running test3... ");
		mytest.runtest3();
	}

}
