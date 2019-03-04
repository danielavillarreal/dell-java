
public class Car extends Vehicle{
	
	//Attributes
	private String carType;
	private int numDoors;
	
	//Constructor
	public Car() {
		
	}
	
	//Getters and Setters
	public String getCarType() {
		return carType;
	}
	
	public void setCarType(String myCarType) {
		this.carType = myCarType;
	}
	
	public int getNumDoors() {
		return numDoors;
	}
	
	public void setNumDoors(int myNumDoors) {
		this.numDoors = myNumDoors;
	}
	
	//Methods
	
	@Override
	//Calls the super method and adds the bed size
	public void printVehicleDescription() {
		
		super.printVehicleDescription();
		System.out.println("Car Type: " + carType);
		System.out.println("Number of Doors in the Car: " + numDoors);
		
	}

	

}
