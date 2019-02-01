
public class Truck extends Vehicle{

	//Attributes
	private int bedSize;
	
	//Constructor
	public Truck() {
		
	}

	//Getter and Setter
	public int getBedSize() {
		return bedSize;
	}
	
	public void setBedSize(int myBedSize) {
		this.bedSize = myBedSize;
	}

	//Methods
	
	@Override
	//Calls the super method and adds the bed size
	public void printVehicleDescription() {
		
		super.printVehicleDescription();
		System.out.println("Truck Bed Size: " + bedSize);
		
	}
	
	


}
