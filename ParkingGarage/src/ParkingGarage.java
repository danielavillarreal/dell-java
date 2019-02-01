
public class ParkingGarage {
	
	//Attributes
	private Car[] carArray;
	private String garageName;
	
	//Constructor
	public ParkingGarage(int capacity) {
		carArray =  new Car[capacity];
	}
	
	//Getters and Setters
	public Car[] getCarArray() {
		return carArray;
	}
	
	public void setCarArray(Car[] myCarArray) {
		this.carArray = myCarArray;
	}
	
	public String getGarageName() {
		return garageName;
	}
	
	public void setGarageName(String myGarageName) {
		this.garageName = myGarageName;
	}
	
	//Methods
	
	//Will add the car to the parking spot
	public void park(Car car, int spot) {
		
		try {
		//Checks to see if the spot is available
		if (!(carArray[spot] == null)) {
			System.out.println("Cannot place car in parking spot " + spot + " because it is taken."); }
			else carArray[spot] = car;
		} catch(Exception e) {
			System.out.println("Cannot place car in spot " + spot + " because it does not exist.");
		//checks to see if spot exists
		
		} 

			
	}
	
	//Will remove the car from the specified spot
	public void vacate(int spot) {
		
		//checks if the spot user is trying to vacate is empty
		if (carArray[spot] == null) {
			System.out.println("This parking spot is empty.");
		}
		else if (!(carArray[spot] == null)) {
			carArray[spot] = null;
		}
	}
	
	//Prints out the listing of all the cars with brief description
	//(stall number (array index) of the car in the parking garage
	//Car's color, license number, make, and model
	public void printInventory() {
		System.out.println(garageName);
		for (int i = 0; i < carArray.length; i++) {
			if (!(carArray[i] == null)) {
				System.out.println("Spot number: " + i);
				System.out.println("Car color: " + carArray[i].getColor());
				System.out.println("Car make: " + carArray[i].getMake());
				System.out.println("Car model: " + carArray[i].getModel());
				System.out.println("License plate: " + carArray[i].getLicenseNumber());
				System.out.println();
			} 
	} 
			 

	}
	

}
