package assignTwoStudent12345;

import java.util.Arrays;

public class Building {
	private String name;
	private Apartment[] apartments;
	private int numberOfApartments;
	private int capacity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Apartment getApartment(int i){
		if(i<numberOfApartments)
			return apartments[i];
		return null;
	}
	boolean addApartment(Apartment a){
		if(numberOfApartments==capacity)
			return false;
		
		apartments[numberOfApartments++]=a;
		return true;
	}
	
	public int numberEmpty(){
		return capacity-numberOfApartments;
	}
	
	public void sortApartments(){
		
		for(int i=0;i<numberOfApartments-1;i++){
			for(int j=0;j<numberOfApartments-i-1;j++)
			if(apartments[j].getFloorNumber()>apartments[j+1].getFloorNumber()){
				Apartment swap =apartments[j];
				apartments[j]=apartments[j-1];
				apartments[j+1]=swap;
			}
		}
	}
	
	@Override
	public String toString() {
		return "Building [name=" + name + ", apartments="
				+ Arrays.toString(apartments) + ", numberOfApartments="
				+ numberOfApartments + ", capacity=" + capacity + "]";
	}
	public int getNumberOfApartments() {
		return numberOfApartments;
	}
		public void setNumberOfApartments(int numberOfApartments) {
		this.numberOfApartments = numberOfApartments;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public Building(String name, int capacity) {
		this.numberOfApartments = 0;
		this.apartments = new Apartment[capacity];
		this.name = name;
		this.capacity = capacity;
	}
	
	
}
