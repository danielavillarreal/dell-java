import java.util.Scanner;

public class RentableProgram {

	public static void main(String[] args) {
		
		//Creates List of rentable items
		Rentable[] rentalList = new Rentable[9];
		
		//Instantiates instances of rooms to rent
		Room firstRoom = new Room(50.00, "Best Western", "Queen Bed", "Suite");
		Room secondRoom = new Room(120.75, "JW Marriott", "King Bed", "Deluxe Suite");
		Room thirdRoom = new Room(84.35, "Embassy Suites", "Queen Bed", "Double");
		
		//Instantiates instances of condos to rent
		Condo firstCondo = new Condo(350.25, "The Century", 3, 2);
		Condo secondCondo = new Condo (200.00, "Society Hill Towers", 2, 1);
		Condo thirdCondo = new Condo (160.00, "Lincoln Plaza", 4, 4);
		
		//Instantiates instances of tools to rent
		Tool firstTool = new Tool (8.75, "Wrench", "Indoor", "Small");
		Tool secondTool = new Tool (4.25, "Hammer", "Indoor", "Medium");
		Tool thirdTool = new Tool (12.50, "Lawn Mower", "Outdoor", "Large");
		
		//Adds items to rentalList
		rentalList[0] = firstRoom;
		rentalList[1] = secondRoom;
		rentalList[2] = thirdRoom;
		rentalList[3] = firstCondo;
		rentalList[4] = secondCondo;
		rentalList[5] = thirdCondo;
		rentalList[6] = firstTool;
		rentalList[7] = secondTool;
		rentalList[8] = thirdTool;

		//Loops through list and prints out the description
		for (int i = 0; i < rentalList.length; i++) {
			System.out.println(rentalList[i].getDescription());
		}
		
		//Asks users for the number of days to update price
		Scanner reader = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter number of days: ");
		double numberOfDays = reader.nextDouble();
		reader.close();
		
		//Loops through the list to get the rate according to the number of days
		for (int i = 0; i < rentalList.length; i++) {
			System.out.println(rentalList[i].getDescription() + " with a price of $" + rentalList[i].getPrice(numberOfDays) +
					" for " + numberOfDays + " days.");
		}
		
	}

}
