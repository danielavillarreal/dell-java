
public class CarLot {

	//Attributes
	public static int carCount = 0;
	private String lotName;
	private Vehicle[] listOfVehicles;
	
	//Constructor
	public CarLot(int amountOfVehicles) {
		listOfVehicles = new Vehicle[amountOfVehicles];
	}
	
	//Getters and Setters
	public String getLotName() {
		return lotName;
	}
	
	public void setLotName(String myLotName) {
		this.lotName = myLotName;
	}
	
	public Vehicle[] getListOfVehicles () {
		return listOfVehicles;
	}
	
	public void setListOfVehicles (Vehicle[] myListOfVehicles) {
		this.listOfVehicles = myListOfVehicles;
	}
	
	//Methods
	
	//This method adds car to the lot
	public void addCarToLot(Vehicle vehicle, int spot) {
		try {
			//Checks to see if the spot is available
			if (!(listOfVehicles[spot] == null)) {
				System.out.println("Cannot place car in parking spot " + spot + " because it is taken."); }
				else listOfVehicles[spot] = vehicle;
			//Calls the super method and adds the bed size
			} catch(Exception e) {
				System.out.println("Cannot place car in spot " + spot + " because it does not exist.");
			} 
	}
	
	//This method prints the inventory of the Lot
	public void printLotInventory() {
		carCount = 0;
		System.out.println(lotName + ": ");
		for (int i = 0; i < listOfVehicles.length; i++) {
			if (!(listOfVehicles[i] == null)) {
				carCount++;
				listOfVehicles[i].printVehicleDescription();
				System.out.println();
			}
		}
		
	System.out.println(lotName + " has " + carCount + " cars.");
	System.out.println();
	}
}
