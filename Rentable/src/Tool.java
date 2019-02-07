
public class Tool implements Rentable {
	
	//Attributes
	public double hourlyRate;
	public String toolName;
	public String toolType;
	public String toolSize;
	
	//Constructor
	public Tool(double hourlyRate, String toolName, String toolType, String toolSize) {
		this.hourlyRate = hourlyRate;
		this.toolName = toolName;
		this.toolType = toolType;
		this.toolSize = toolSize;
	}

	@Override
	public String getDescription() {
		return "Tool Name: " + toolName + ", " +
				"Tool Type: " + toolType + ", " +
				"Tool Size: " + toolSize + ", " +
				"Hourly Rate: " + hourlyRate;
	}

	@Override
	public double getDailyRate() {
		return hourlyRate * 24;
	}

	@Override
	public double getPrice(double days) {
		return (hourlyRate * 24) * days;
	}

}
