import java.util.Scanner;

public class GuessingGame {
	
	public GuessingGame() {
		Boolean newgame = false;
		int guesses = 0; 
		// If the user asks to repeat the game, newgame will stay false until they no longer want to play
		while (newgame == false) {
		
			// Creates random number
			Boolean guessed = false;
			int number = (int)(Math.random() * 51);
			System.out.println("Start guessing a number between 1 and 50!");
			
			
			// Checks if the number has been guessed
			// If the number is guessed, it leaves the while loop and asks if they want to do it again
			while (guessed == false) {
	
				// Inputs their guess
				Scanner scanner = new Scanner(System.in);
				String input = scanner.nextLine();
				int guess = Integer.parseInt(input);
			
				// If the guess is too high, they will be told the guess is too high
				if (guess > number) {
					System.out.println(guess + " is too high!");
					guesses++;
				}
				
				// If the guess is too low, they will be told the guess is too low
				else if (guess < number) {
					System.out.println(guess + " is too low");
					guesses++;
				}
				
				// Once they guess the right number, the user will be asked if they would like to repeat the program
				else if (guess == number) {
					// Inputs if they want to repeat the code
					guesses++;
					System.out.println(guess + " is correct! It took you " + guesses + " guesses to guess the number");
					System.out.println("Do you want to play again?");
	
					Scanner scanner1 = new Scanner(System.in);
					String again = scanner1.nextLine();
					
					if (again.equals("yes") || again.equals("y")) {
						System.out.println("Starting new game!");
						guessed = true;
						
					}
					
					else {
						System.out.println("Thank you for playing!");
						newgame = true;
						guessed = true;

					}
					
				}
				
			}
	
		}

	}
	
	public static void main(String[] args) {
		new GuessingGame();
	}

}