
public class DriversLicense {
	
	//Global Attributes
	public String firstName;
	public String lastName;
	public String dateOfBirth;
	public String height;
	public String gender;

	
	//Static Attributes
	
	//Constructor 
	public DriversLicense() {
		
	}
	
	//Methods
	
	//This method gets the full name of the person
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public int getAge() {
		String [] dateParts = dateOfBirth.split("/");
		String year = dateParts[2];
		int yearInt = Integer.parseInt(year);	
		int age = 2018 - yearInt;
		return age; 
	}
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String myFirstName) {
		this.firstName = myFirstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String myLastName) {
		this.lastName = myLastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String myDateOfBirth) {
		this.dateOfBirth = myDateOfBirth;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String myHeight) {
		this.height = myHeight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String myGender) {
		this.gender = myGender;
	}
	



}
