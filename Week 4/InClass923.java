import java.util.InputMismatchException;
import java.util.Scanner;
public class InClass923 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		int x = 0;
		int y = 10;

		if (y > 10) {
			x = 1;
		}
		System.out.println("x is: " + x);
		*/

		/*
		int score = 91;
		if (score > 90)  {
			System.out.println("You get an A!");
		}
		*/

		/*
		int userNum = 0;

		while(true) {
			try {
				System.out.println("Enter an integer");
				userNum = input.nextInt();
				break;
			} catch(InputMismatchException ime) {
				System.out.println("Not an integer. Try again.");
				input.next();
			}
		}
		
		int mod = userNum % 2;
		if (mod == 0) {
			System.out.println("Your number is even.");
		} else {
			System.out.println("Your number is odd");
		}


		int overtimeHours = 12;
		int pay = 0;
		if(overtimeHours > 10) {
			pay = pay + 500;
		} else {
			pay = pay + 50;
		}
		*/

		int x = 1;
		int y = 6;
		int rand = (int)(x + Math.random() * y);

		int userGuess = 0;
		while (userGuess != rand) {
			while (true) {
				try{
					System.out.println("Guess the number between " + x + " and " + (y-1));
					userGuess = input.nextInt();
					break;
				}
				catch(InputMismatchException ime){
					System.out.println("That wasn't a number try again");
					input.next();
				}
			}
			if(userGuess == rand) {
				System.out.println("Correct!");
				break;
			} else {
				System.out.println("Sorry, incorrect.");
			}
			
		}
		


	}
}