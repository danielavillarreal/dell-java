import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Choose rock, paper, or scissors!");
	    String player2Hand = reader.nextLine();
	    String playerHand = calculatePlayerHand();
	    System.out.println("Computer said " + playerHand);
	    System.out.println("You said " + player2Hand);    
	    System.out.println(calculateWinner(playerHand, player2Hand)+ " won!");
	    reader.close();
	    
	}
	
	public static String calculatePlayerHand() {
		Random rand = new Random();
		String playerHand = "";
		int rand1 = rand.nextInt(3);
		if (rand1 == 0) {
			playerHand = "Paper";
		} else if(rand1 == 1){
			playerHand = "Rock";
		} else if(rand1 == 2){
			playerHand = "Scissors";
		}
		return playerHand;
	}
	
	public static String calculateWinner(String playerHand, String player2Hand) {
		
		String winner = "";
		
		//if user enters rock/Rock
		if (player2Hand.equals("rock") || player2Hand.equals("Rock")) {
			if (playerHand.equals("Paper")) {
				winner = "Computer";
			} else if (playerHand.equals("Scissors")) {
				winner = "You";
			} else if (playerHand.equals("Rock")) {
				winner = "Tie";
			}
			
		//If user enters paper/Paper
		} else if (player2Hand.equals("paper") || player2Hand.equals("Paper")) {
			if (playerHand.equals("Scissors")) {
				winner = "Computer";
			} else if (playerHand.equals("Rock")) {
				winner = "You";
			} else if (playerHand.equals("Paper")) {
				winner = "Tie";
			}
			
		//if user enters scissors/Scissors
		} else if (player2Hand.equals("scissors") || player2Hand.equals("Scissors")) {
			if (playerHand.equals("Paper")) {
				winner = "You";
			} else if (playerHand.equals("Rock")) {
				winner = "Computer";
			} else if (playerHand.equals("Scissors")) {
				winner = "Tie";
			}	
		}
		
		return winner;
		
		}
}