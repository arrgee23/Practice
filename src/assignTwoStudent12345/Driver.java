package assignTwoStudent12345;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		Building b = new Building("MyBuilding",100);
		Scanner s = new Scanner(System.in);
		while(true){
			
			System.out.print("\n\nEnter "
					+ "1 to populate the building\n"
					+ "2 to Display Apartments in building\n"
					+ "3 to sort Apartment Data\n"
					+ "4 to view Report\n"
					+ "5 to exit\n\n");
			System.out.print("your input: ");
			int input = s.nextInt();
			
			
			if(input==1)
				populate(b,s);
			
			if(input==2)
				display(b);
			
			if(input==3)
				sort(b);
			
			if(input==4)
				report(b);
			
			if(input==5){
				System.out.println("Exiting...");
				break;
			}
			
		}
		System.out.println("Exited");
		s.close();
	}

	private static void report(Building b) {
		System.out.println("%ge of empty Apartments ="+((double)b.numberEmpty()/b.getCapacity())*100);
		double totalRent=0;
		for(int i=0;i<b.getNumberOfApartments();i++){
			totalRent += b.getApartment(i).getRent();
		}
		System.out.println("Total rent per week:"+totalRent);
		
		int l=0;
		for(int i=0;i<b.getNumberOfApartments();i++){
			totalRent += b.getApartment(i).getNumberOfBathrooms();
		}
		System.out.println("Total No. of bathrooms:"+l);
		
		l=0;
		for(int i=0;i<b.getNumberOfApartments();i++){
			totalRent += b.getApartment(i).getNumberOfBedrooms();
		}
		System.out.println("Total No. of bedrooms:"+l);
	}

	private static void sort(Building b) {
		b.sortApartments();
	}

	private static void display(Building b) {
		System.out.print(b.toString());
		
	}

	private static void populate(Building b, Scanner s2) {
		System.out.println("Enter how many apartments you want to insert: ");
		int n=s2.nextInt();
		
		for (int i = 0; i < n; i++) {
			b.addApartment(new Apartment(i,i,i,true,new Person("foo1","foo"),i));
		}
	}
}
