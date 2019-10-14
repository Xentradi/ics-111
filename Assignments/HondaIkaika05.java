/**
 * Plays rock, paper, scissors with the user
 * 
 * @author Honda, Ikaika
 * @assignment ICS 111 Assignment 05
 * @date Sept 22, 2019
 * @bugs None
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class HondaIkaika05 {
	public static void main(String[] args) {

		// create a new scanner object to take user input
		Scanner input = new Scanner(System.in);

		// create an array of the possible outcomes
		final String POSSIBLE_CHOICES[] = {"Rock", "Paper", "Scissors"};

		// finds a "random" integer between 0 and 2
		int x = (int)(0 + Math.random() * 3);

		// declare and initialize input variables
		String userName = "";
		int userChoice = 0;

		// continue to ask for a name until the user actually gives one.
		while(true) {
			try {
				System.out.println("What's your name?");
				userName = input.nextLine();
				if(userName.length() > 0) {
					break;
				}
				else {
					System.out.println("Don't be like that");
				}
			}
			catch(InputMismatchException ime) {
				System.out.println("Looks like something went wrong; lets try again.");
				input.next();
			}
		}
		
		System.out.println("Hey, " + userName + "! Let's play rock, paper scissors!");
		System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors.");

		while(true) {
			try {
				System.out.println("Ready? Go!");
				userChoice = input.nextInt();

				// if the user's choice was less than 1 or greater than 3 make them try again.
				if (userChoice < 1 || userChoice > 3) {
					System.out.println("That isn't a valid option. Try again.");
				} else {
					break;
				}
			}
			catch(InputMismatchException ime) {
				System.out.println("That isn't a valid option. Try again.");
				input.next();
			}
		}

		// subtract 1 from user choice to match the choice of the program for easy comparison
		userChoice = userChoice - 1;
		
		System.out.println("I chose: " + POSSIBLE_CHOICES[x]);
		System.out.println("You chose: " + POSSIBLE_CHOICES[userChoice]);


		/* possible outcomes
			0 < 1 < 2 < 0

			0 rock
			1 paper
			2 scissors
		*/

		int status = 1;

		/*	status 
			0 - lose
			1 - win
			2 - draw
		*/

		// Look for lose conditions
		if(userChoice == x) {
			// if both chose the same it's a draw.
			status = 2;
		}
		else if (userChoice == 2 && x == 0) {
			// if user chose scissors and computer chose rock. player loses
			status = 0;
		}
		else if(userChoice < x) {
			// otherwise if the players choice was lower than the computer, the player wins
			status = 0;
		}

		if(status == 1) {
			System.out.println("Looks like you won!");
		}
		else if(status == 0) {
			System.out.println("Looks like you lose.");
		}
		else if(status == 2) {
			System.out.println("Looks like a draw.");
		}
	}
}