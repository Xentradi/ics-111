/**
 * 1. Prints numbers 4-14
 * 2. Prints numbers 52-61
 * 3. Prints numbers 73-84
 * 4. Prints numbers between x & y user input
 * 
 * @author Honda, Ikaika
 * @assignment ICS 111 Assignment 06
 * @date Oct 14, 2019
 * @bugs I haven't come up with a graceful method to get out of the input loop without giving it the values it wants.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

 public class HondaIkaika06 {
	 public static void main(String[] args) {
		int x = 0, y = 0;
		String output = "";


		// use while loop to print numbers 4-17
		x = 4;
		y = 17;
		output = "4-17: ";
		while (x <= y) {
			output = output + x + " ";
			x++;	
		}
		System.out.println(output);


		// use do while loop to print numbers 52-61
		x = 52;
		y = 61;
		output = "52-61: ";
		do {
			output = output + x + " ";
			x++;
		}
		while (x <= y);
		System.out.println(output);
		

		// use for loop to print numbers 73-84
		for(x = 73, y = 84, output = "73-84: "; x <= y; x++) {
			output = output + x + " ";
		}
		System.out.println(output);

		
		x = 0;
		y = 0;
		// create scanner object
		Scanner input = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Let's try a custom one, please choose the first integer:");
				x = input.nextInt();
				break;
	
			}
			catch(InputMismatchException ime) {
				System.out.println("That wasn't an integer! Try again or press ctrl-c to exit.");
				input.next();
			}
		}

		while(true) {
			try {
				System.out.println("Please choose the second integer:");
				y = input.nextInt();
				break;
	
			}
			catch(InputMismatchException ime) {
				System.out.println("That wasn't an integer! Try again or press ctrl-c to exit.");
				input.next();
			}
		}
		// close the scanner.
		input.close();

		output = x + "-" + y + ": ";
		if(x < y) {
			System.out.println("Ok, counting up.");
			while(x <= y) {
				output = output + x + " ";
				x++;
			}
		}
		else if(x > y) {
			System.out.println("Ok, counting down.");
			while(x >= y) {
				output = output + x + " ";
				x--;
			}
		}
		else {
			output = "Those are the same number. So here's your number: " + x;
		}
		System.out.println(output);
		
	 }
 }