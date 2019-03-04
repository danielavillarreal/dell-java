import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class WordGuessGame {

	public static void main(String[] args) {

		boolean winner = false;
		String randomWord = initiateReader();
		char[] listOfWords = makeLetterArray(randomWord);
		char[] letters = displayWord(randomWord);
		while (winner != true) {
			char letterGuessed = getUserInput();
			char[] newGuess = checkGuesses(letterGuessed, randomWord, letters);
			winner = checkForWin(letters, listOfWords);
		}

	}

	// Initiates the Reader and picks word from list
	
	public static String initiateReader() {

		Random randWord = new Random();
		int index = 0;
		String[] listOfWords = null;

		try {
			
			// fetches guesswords.txt
			BufferedReader reader = new BufferedReader(new FileReader("guesswords.txt"));
			int amountOfWords = 0;
			String line;
			// Adds each string to array list
			while ((line = reader.readLine()) != null) {
				amountOfWords++;
			}
			reader.close();
			listOfWords = new String[amountOfWords];
			int counter = 0;
			String randomWord;
			BufferedReader wordReader = new BufferedReader(new FileReader("guesswords.txt"));
			while ((randomWord = wordReader.readLine()) != null) {
				listOfWords[counter] = randomWord;
				counter++;
			}
			index = randWord.nextInt(amountOfWords);
			wordReader.close();
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
			String randomWord = listOfWords[index];
			return randomWord;
		}
		
	// puts all the letters into an array
	public static char[] makeLetterArray(String randomWord) {

		char[] listOfWords = new char[randomWord.length()];
		for (int i = 0; i < randomWord.length(); i++) {
			listOfWords[i] = randomWord.charAt(i);
		}
		return listOfWords;
	}

	// displays the word as ----
	public static char[] displayWord(String randomWord) {

		char[] hiddenWord = new char[randomWord.length()];

		// Goes through all the letters in the list and shows the letter if it is
		// visible
		for (int i = 0; i < randomWord.length(); i++) {
			hiddenWord[i] = '-';
		}
		System.out.println(hiddenWord);
		return hiddenWord;
	}

	// prints the game
	public static void showLetters(char[] letters) {
		System.out.println(String.valueOf(letters));
	}

	// Takes the users input
	public static char getUserInput() {
		Scanner scRead = new Scanner(System.in);
		System.out.println("Please guess a letter.");
		String letterGuessed = scRead.nextLine();
		return letterGuessed.charAt(0);

	}

	public static char[] checkGuesses(char letterGuessed, String randomWord, char[] letters) {
		int count = 0;
		for (int i = 0; i < randomWord.length(); i++) {
			if (letterGuessed == randomWord.charAt(i)) {
				int index = randomWord.indexOf(letterGuessed, count);
				letters[index] = letterGuessed;
				count = index + 1;
			}
		}
		showLetters(letters);
		return letters;
	}

	public static boolean checkForWin(char[] letters, char[] listOfWords) {
		boolean winner = Arrays.equals(letters, listOfWords);
		if (winner == true) {
			System.out.println("Congratulations! You guessed the word!");
		}
		return (winner);
	}

}
