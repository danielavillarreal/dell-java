
public class LicenseProgram {

	public static void main(String[] args) {
		
		
		//creating the firstDriver
		DriversLicense firstDriver = new DriversLicense();
		firstDriver.firstName = "Daniela";
		firstDriver.lastName = "Villarreal";
		firstDriver.dateOfBirth = "07/11/1997";
		firstDriver.height = "5 ft 6 in.";
		firstDriver.gender = "Female";
		

		//creating the secondDriver
		DriversLicense secondDriver = new DriversLicense();
		secondDriver.firstName = "Brianna";
		secondDriver.lastName = "Goulet";
		secondDriver.dateOfBirth = "09/27/1993";
		secondDriver.height = "5 ft 3 in.";
		secondDriver.gender = "Female";
		
		//creating the thirdDriver
		DriversLicense thirdDriver = new DriversLicense();
		thirdDriver.firstName = "Moises";
		thirdDriver.lastName = "Martinez";
		thirdDriver.dateOfBirth = "03/05/1997";
		thirdDriver.height = "6 ft 1 in.";
		thirdDriver.gender = "Male";
		
		//Prints out the firstDriver
		System.out.println("First Driver Name: " + firstDriver.getFullName());
		System.out.println("First Driver Age: " + firstDriver.getAge());
		
		//Prints out the firstDriver
		System.out.println("Second Driver Name: " + secondDriver.getFullName());
		System.out.println("Second Driver Age: " + secondDriver.getAge());
		
		//Prints out the firstDriver
		System.out.println("Third Driver Name: " + thirdDriver.getFullName());
		System.out.println("Third Driver Age: " + thirdDriver.getAge());
		

	}

}
