import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
    System.out.println("Please type a number to the console.");
	Scanner reader = new Scanner(System.in);
	int firstNum = reader.nextInt(); //Reads first number from user
	System.out.println("Please type another number to the console.");
	int secondNum = reader.nextInt(); //Reads second number
	reader.close();
	int sum = addition(firstNum, secondNum);
	System.out.println("Addition: " + sum);
	int subtract = subtraction(firstNum, secondNum);
	System.out.println("Subtraction: " + subtract);
	int multiply = multiplication(firstNum, secondNum);
	System.out.println("Multiplication: " + multiply);
	int divide = division(firstNum, secondNum);
	System.out.println("Division: " + divide);
	}
	
	//Addition
	public static int addition (int firstNum, int secondNum) {
		int sum = firstNum + secondNum;
		return sum;
	}
	
	//Subtraction 
	public static int subtraction (int firstNum, int secondNum) {
		int subtract = firstNum - secondNum;
		return subtract;
	}
	
	//Multiplication
	public static int multiplication (int firstNum, int secondNum) {
		int multiply = firstNum * secondNum;
		return multiply;
	}
	
	//Division
	public static int division (int firstNum, int secondNum) {
		int divide = firstNum / secondNum;
		return divide;
	}

}
