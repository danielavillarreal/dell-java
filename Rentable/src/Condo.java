
public class Condo implements Rentable{
	
	//Attributes
	public double weeklyRate;
	public String condoName;
	public int numberOfRooms;
	public int numberOfBathrooms;
	
	//Constructor
	public Condo(double weeklyRate, String condoName, int numberOfRooms, int numberOfBathrooms) {
		this.weeklyRate = weeklyRate;
		this.condoName = condoName;
		this.numberOfRooms = numberOfRooms;
		this.numberOfBathrooms = numberOfBathrooms;
	}

	@Override
	//Returns the Description of the Condo
	public String getDescription() {
		return "Condo Name: " + condoName + ", " +
				"Number of Rooms: " + numberOfRooms + ", " +
				"Number of Bathrooms: " + numberOfBathrooms + ", " +
				"Weekly Rate: " + weeklyRate;
	}

	@Override
	//Returns the weeklyRate of the Condo
	public double getDailyRate() {
		return weeklyRate / 7;
	}

	@Override
	//Returns the price of the Condo
	public double getPrice(double days) {
		return (weeklyRate / 7) * days;
	}

}
