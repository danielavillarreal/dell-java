
public class GarageManager {

	//Instantiate a few cars and proceed to park and vacate them
	//from the garages
	public static void main(String[] args) {
		
		//Creates and Names parkingGarages
		ParkingGarage firstGarage = new ParkingGarage(5);
		firstGarage.setGarageName("Garage One");
		ParkingGarage secondGarage = new ParkingGarage(5);
		secondGarage.setGarageName("Garage Two");
		
		//Creates the firstCar
		Car firstCar = new Car();
		firstCar.setColor("White");
		firstCar.setLicenseNumber("TVJ-8823");
		firstCar.setMake("Honda");
		firstCar.setModel("Civic");

		
		//Creates the secondCar
		Car secondCar = new Car();
		secondCar.setColor("Black");
		secondCar.setLicenseNumber("GIQ-7196");
		secondCar.setMake("Toyota");
		secondCar.setModel("Camry");
		
		//Creates the thirdCar
		Car thirdCar = new Car();
		thirdCar.setColor("Red");
		thirdCar.setLicenseNumber("HYO-0711");
		thirdCar.setMake("Ford");
		thirdCar.setModel("Escape");
		
		//Creates the fourthCar 
		Car fourthCar = new Car();
		fourthCar.setColor("Blue");
		fourthCar.setLicenseNumber("DOM-1428");
		fourthCar.setMake("Chevrolet");
		fourthCar.setModel("Malibu");
		
		//Adds the Honda Civic and the Ford Escape to the firstGarage
		firstGarage.park(firstCar, 0);
		firstGarage.park(thirdCar, 3);
		
		//vacates the Ford Escape from the firstGarage
		firstGarage.vacate(3);
		
		//Prints the inventory
		firstGarage.printInventory();
		
		//Adds the Toyota Camry and Chevy Malibu to secondGarage
		secondGarage.park(secondCar, 1);
		secondGarage.park(fourthCar, 4);
		
		//Vacates the Chevy Malibu from the secondGarage
		//secondGarage.vacate(4);
		
		//Prints the second garage's inventory
		secondGarage.printInventory();
	}

}
