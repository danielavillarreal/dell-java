import java.util.Scanner;
import java.util.HashMap;

public class GradeBook {
	
	//Create a map to store the name and grades
	public static HashMap<String, String> gradeBookInput = new HashMap<String, String>();
	public static HashMap<String, Double> averageGrades = new HashMap<String, Double>();
	
	public static void main(String[] args) {
		inputStudentInfo();
		inputGrades();
		printGrades();
	}
	
	public static void inputStudentInfo() {
		
		//Initiate Scanner
		Scanner reader = new Scanner(System.in);
		
		//Ask user how many students are in the class
		System.out.println("How many students are you entering grades for?");
		Integer numberOfStudents = reader.nextInt();
		reader.nextLine();
		
		//Gather student's name and grades
		for (int i = 0; i < numberOfStudents; i++) {
			
			System.out.println("What is the student's name?");
			String name = reader.nextLine();
			
			System.out.println("Please enter grades in a comma separated list (with spaces). Ex) 90, 100, 85");
			String grades = reader.nextLine();
			
			//Add user's name and grades into Map
			gradeBookInput.put(name, grades);
	}
		reader.close();
	}

	public static void inputGrades() {
		
		//Convert HashMap to String Array
		String[] studentArrayList = (String [])gradeBookInput.keySet().toArray(new String[0]);
		String[] gradeArrayList = (String [])gradeBookInput.values().toArray(new String[0]);
		
		//Convert string Array into a integer array
		for(int i = 0; i < gradeArrayList.length; i++) {
			String grades = gradeArrayList[i];
			String[] gradeStringArray = grades.split(", ");
			
			Integer[] intGradesArray = new Integer[gradeStringArray.length];
			
			for (int j=0; j< intGradesArray.length; j++) {
				Integer num = Integer.parseInt(gradeStringArray[j]);
				intGradesArray[j] = num;
			}
			
			//Compute average
			double sum = 0;
			for (int k = 0; k < intGradesArray.length; k++) {
				sum += intGradesArray[k];
			}
			double average = sum / intGradesArray.length;
			averageGrades.put(studentArrayList[i], average);
			
		}
	}
	
	private static void printGrades() {
		
		String[] studentArrayPrintList = (String[])averageGrades.keySet().toArray(new String[0]);
		Double[] gradeArrayPrintList = (Double[])averageGrades.values().toArray(new Double[0]);
		
		for (int i=0; i < studentArrayPrintList.length; i++) {
			String currentStudent = studentArrayPrintList[i];
			Double currentAverage = gradeArrayPrintList[i];
			
			System.out.println(currentStudent + "'s average grade: " + currentAverage);
		}
		 
	}
	
	}


