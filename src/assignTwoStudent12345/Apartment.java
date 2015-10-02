package assignTwoStudent12345;

public class Apartment {
	private int numberOfBedrooms;
	private int numberOfBathrooms;
	private int numberOfLiving;
	private int floorNumber;
	private char apartmentLetter;
	private boolean available;
	private Person owner;
	private double rent;
	
	public Apartment(int numberOfBedrooms, int numberOfBathrooms,
			int numberOfLiving,
			boolean available, Person owner, double rent) {
		super();
		this.numberOfBedrooms = numberOfBedrooms;
		this.numberOfBathrooms = numberOfBathrooms;
		this.numberOfLiving = numberOfLiving;
		this.available = available;
		this.owner = owner;
		this.rent = rent;
	}

		
	public String toString() {
		return "Apartment [numberOfBedrooms=" + numberOfBedrooms
				+ ", numberOfBathrooms=" + numberOfBathrooms
				+ ", numberOfLiving=" + numberOfLiving + ", floorNumber="
				+ floorNumber + ", apartmentLetter=" + apartmentLetter
				+ ", available=" + available + ", owner=" + owner + ", rent="
				+ rent + "]";
	}

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public int getNumberOfLiving() {
		return numberOfLiving;
	}

	public void setNumberOfLiving(int numberOfLiving) {
		this.numberOfLiving = numberOfLiving;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public char getApartmentLetter() {
		return apartmentLetter;
	}

	public void setApartmentLetter(char apartmentLetter) {
		this.apartmentLetter = apartmentLetter;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Person getOwner() {
		return owner;
	}

	public boolean setOwner(Person owner) {
		// owner cant be null
		if(owner==null)
			return false;
		
		this.owner=owner;
		return true;
	}

	public double getRent() {
		return rent;
	}

	public boolean setRent(double rent) {
		if(rent<=0) // rent cant be smaller than 0
			return false;
		
		this.rent = rent;
		return true;
	}
}
