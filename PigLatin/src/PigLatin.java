import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter an English word.");
	Scanner reader = new Scanner(System.in);
	String engWord = reader.nextLine();
	String translation = checkWord(engWord);
	reader.close();
	System.out.println(translation);
	}
    
    public static String checkWord(String engWord) {
    	
    	char[] vowels  = {'a','e','i','o','u'};
    	char firstLetter = engWord.charAt(0);
    	
    	//Check if first letter is a vowel
    	for (int i=0; i<vowels.length; i++) {
    		if (firstLetter == vowels[i]) {
    			return engWord + "yay";
    		}
    	}
    	
    	//consonant is the first letter but has a vowel
    	for (int j=0; j<vowels.length; j++) {
    		for(int i=0; i<vowels.length; i++)
    		if (engWord.charAt(j) == vowels[i]) {
    			String afterVowel = engWord.substring(j, engWord.length());
    			String beforeVowel = engWord.substring(0, j);
    			return afterVowel + beforeVowel + "ay";
    		}
    	}
    	
    	//word has no vowel
    	return engWord + "ay";
    }
    
}
