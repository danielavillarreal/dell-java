
public class Room implements Rentable {
	
	//Attributes
	public double dailyRate;
	public String roomName;
	public String bedType;
	public String roomType;
	
	//Constructor
	public Room(double dailyRate, String roomName, String bedType, String roomType) {
		this.dailyRate = dailyRate;
		this.roomName = roomName;
		this.bedType = bedType;
		this.roomType = roomType;
		
	}
	
	//Methods
	
	@Override
	//Returns the description of the room
	public String getDescription() {
		return "Room Name: " + roomName + ", " +
				"Bed Type: " + bedType + ", " +
				"Room Type: " + roomType + ", " +
				"Daily Rate: " + dailyRate;
	}
	
	@Override
	//Returns the room's daily rate
	public double getDailyRate() {
		return dailyRate;
	}

	@Override
	//returns the price of the room;
	public double getPrice(double days) {
		return dailyRate * days;
	}
}
