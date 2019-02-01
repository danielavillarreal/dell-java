
public class CarLotProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creates Lots
		CarLot firstLot = new CarLot(5);
		firstLot.setLotName("Lot One");
		
		CarLot secondLot = new CarLot(5);
		secondLot.setLotName("Lot Two");
		
		//Creates Vehicles
		Car firstCar = new Car();
		firstCar.setCarType("Sedan");
		firstCar.setLicenseNum("TVJ-8823");
		firstCar.setMake("Honda");
		firstCar.setModel("Accord");
		firstCar.setNumDoors(4);
		firstCar.setPrice("$20,000");
		
		Car secondCar = new Car();
		secondCar.setCarType("Sedan");
		secondCar.setLicenseNum("GIQ-7196");
		secondCar.setMake("Toyota");
		secondCar.setModel("Camry");
		secondCar.setNumDoors(4);
		secondCar.setPrice("$22,000");
		
		Car thirdCar = new Car();
		thirdCar.setCarType("Hatchback");
		thirdCar.setLicenseNum("ABC-1234");
		thirdCar.setMake("KIA");
		thirdCar.setModel("Soul");
		thirdCar.setNumDoors(4);
		thirdCar.setPrice("$28,000");
		
		Car fourthCar = new Car();
		fourthCar.setCarType("Coupe");
		fourthCar.setLicenseNum("EFG-5678");
		fourthCar.setMake("Chevrolet");
		fourthCar.setModel("Corvette");
		fourthCar.setNumDoors(2);
		fourthCar.setPrice("$55,000");
		
		Truck firstTruck = new Truck();
		firstTruck.setLicenseNum("HIJ-9101");
		firstTruck.setMake("Ford");
		firstTruck.setModel("F-150");
		firstTruck.setPrice("$59,000");
		firstTruck.setBedSize(66);
		
		Truck secondTruck = new Truck();
		secondTruck.setLicenseNum("KLM-1213");
		secondTruck.setMake("Ford");
		secondTruck.setModel("F-250");
		secondTruck.setPrice("$80,000");
		secondTruck.setBedSize(80);
		
		Truck thirdTruck = new Truck();
		thirdTruck.setLicenseNum("OPQ-1415");
		thirdTruck.setMake("Dodge");
		thirdTruck.setModel("Ram");
		thirdTruck.setPrice("$72,000");
		thirdTruck.setBedSize(75);
		
		Truck fourthTruck = new Truck();
		fourthTruck.setLicenseNum("RST-1617");
		fourthTruck.setMake("Dodge");
		fourthTruck.setModel("Ram");
		fourthTruck.setPrice("$65,000");
		fourthTruck.setBedSize(70);

		//Adds Cars/Trucks into First Lot
		firstLot.addCarToLot(firstCar, 2);
		firstLot.addCarToLot(thirdCar, 4);
		firstLot.addCarToLot(secondTruck, 0);
		firstLot.addCarToLot(fourthTruck, 3);
		
		//Adds Cars/Trucks into Second Lot
		secondLot.addCarToLot(secondCar, 0);
		secondLot.addCarToLot(fourthCar, 1);
		secondLot.addCarToLot(firstTruck, 2);
		secondLot.addCarToLot(thirdTruck, 3);
		
		//Prints Lot One and Lot two
		firstLot.printLotInventory();
		secondLot.printLotInventory();
	}

}
