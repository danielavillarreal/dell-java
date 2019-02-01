
public abstract class Vehicle {
	
	//Attributes
	private String licenseNum;
	private String make;
	private String model;
	private String price;
	
	
	//Getters and Setters
	public String getLicenseNum() {
		return licenseNum;
	}
	
	public void setLicenseNum(String myLicenseNum) {
		this.licenseNum = myLicenseNum;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake (String myMake) {
		this.make = myMake;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String myModel) {
		this.model = myModel;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String myPrice) {
		this.price = myPrice;
	}
	
	//Methods
	
	//Print vehicle description (license number,  model, make, price)
	//Makes it a super method that allows the children to add to it
	public void printVehicleDescription() {
		System.out.println("Vehicle License Number: " + licenseNum);
		System.out.println("Vehicle Make: " + make);
		System.out.println("Vehicle Model: " + model);
		System.out.println("Vehicle Price: " + price);
	}
		

}
