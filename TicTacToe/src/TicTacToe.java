import java.util.Scanner;


public class TicTacToe {

	public static char[][] board = new char [3][3];
	public static char player;
	
	public static void main(String[] args) {
		player = 'X';
		resetBoard();
		printBoard();
		
}
	
	//resets the board to empty values
	public static void resetBoard(){
		
		for (int i=0; i < 3; i++) {
			
			for (int j=0; j<3; j++) {
				board[i][j] = '-';
			}
		}
	}
	
	
	//This prints out the board
	public static void printBoard() {
	     System.out.println("  0   1   2");
		 System.out.println("0 " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);  
		 System.out.println("-------------");
		 System.out.println("1 " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);  
		 System.out.println("-------------");
		 System.out.println("2 " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]); 
	}   
	
	//Checks to see if board is full
	public static boolean isBoardFull() {
		
		boolean isFull = true;
		
		for (int i=0; i < 3; i++) {
			
			for (int j=0; j < 3; j++) {
				
				if (board[i][j] == '-') {
					isFull=false;
			}
		}
	}
		return isFull;
	}
	
	
	//switches between players
	public static void switchPlayer() {
		
		if (player == 'X') {
			player = 'O';
		}
		else {
			player = 'X';
		}
	}

	
	
	
}