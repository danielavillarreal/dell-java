import java.util.Scanner;


public class Statistics {

	public static void main(String[] args) {
		//Reads user input and parsing into a string array
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a list of numbers separated by a comma.");
		String numberList = reader.nextLine();
		reader.close();
		String[] numberListArray = numberList.split(",");
		
		//Create an integer array to store converted user input
		Double[] numberIntArray = new Double[numberListArray.length];
		for (int i = 0; i < numberListArray.length; i++) {
			//Turns string into integer
			Double num = Double.parseDouble(numberListArray[i]); 
			numberIntArray[i] = num;
		}
		
		//Prints out the Max, Min, Number of Elements, Average, and Sum
		System.out.println("Max: " + getMaxValue(numberIntArray));
		System.out.println("Min: " + getMinValue(numberIntArray));
		System.out.println("Number of Elements: " + numberIntArray.length);
		System.out.println("Average: " + getAverage(numberIntArray));
		System.out.println("Sum: " + getSum(numberIntArray));
	}
	
	//Gets the maximum value of the inputs
	public static Double getMaxValue(Double[] numbers) {
		
		Double max = numbers[0];
		
		for (int i=0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	//Gets the minimum value of the inputs
	public static Double getMinValue(Double[] numbers) {
		
		Double min = numbers[0];
		
		for (int i=0; i < numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	
	//Gets the Average of the inputs
	public static Double getAverage (Double[] numbers) {
		
		Double sum = (double) 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum / numbers.length;
		
	}
	
	//Gets the sum of the inputs
	public static Double getSum (Double[] numbers) {
		
		Double sum = (double) 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum;
		
	}
	
}
