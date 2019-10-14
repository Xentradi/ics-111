/**
 * Converts dollar amount to optimal currency to use in order to minimize coin
 * usage.
 * 
 * @author Honda, Ikaika
 * @assignment ICS 111 Assignment 04
 * @date Sept 22, 2019
 * @bugs Short description of bugs in the program, if any.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class HondaIkaika04 {
	public static void main(String[] args) {
		final int VALUE_OF_DOLLAR = 100;
		final int VALUE_OF_QUARTER = 25;
		final int VALUE_OF_DIME = 10;
		final int VALUE_OF_NICKEL = 5;

		String userName = "";
		double movieCost = 0;

		Scanner reader = new Scanner(System.in);

		// Collect the users name.
		System.out.println("What is your name?");
		userName = reader.nextLine();

		System.out.println("Hey " + userName + ". It's movie time!");

		// Collect the price of the movie. Repeat the try.. catch until there is no
		// exception
		while(true) {
			try {
				System.out.println("How much does the movie cost?");
				movieCost = reader.nextDouble();
				break;
			} catch (InputMismatchException ime) {
				System.out.println("Uh, that doesn't sound like a price to me.");
				reader.next();
			}
		}
		
		// convert the entered double cost to integer cents
		int costInCents = (int) (movieCost * 100);

		int numberOfDollars = costInCents / VALUE_OF_DOLLAR;
		int remainingCents = costInCents % VALUE_OF_DOLLAR;

		int numberOfQuarters = remainingCents / VALUE_OF_QUARTER;
		remainingCents = remainingCents % VALUE_OF_QUARTER;

		int numberOfDimes = remainingCents / VALUE_OF_DIME;
		remainingCents = remainingCents % VALUE_OF_DIME;

		int numberOfNickels = remainingCents / VALUE_OF_NICKEL;
		remainingCents = remainingCents % VALUE_OF_NICKEL;

		int numberOfPennies = remainingCents;

		System.out.printf("$%.2f, So that would be . . .\n", movieCost);
		System.out.println(numberOfDollars + " dollars.");
		System.out.println(numberOfQuarters + " quarters.");
		System.out.println(numberOfDimes + " dimes.");
		System.out.println(numberOfNickels + " nickels.");
		System.out.println(numberOfPennies + " pennies.");

	}
}
