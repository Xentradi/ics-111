import java.util.Scanner;
import java.util.InputMismatchException;

public class Oct16 {
	public static void main(String[] args) {

		// ask the user how many favorite ~things~ they have. 
		// create an array of that size
		// fill the array with crap they input

		Scanner input = new Scanner(System.in);
		Scanner colorInput = new Scanner(System.in);
		int arraySize = 0;

		try {
			System.out.println("How many favorite colors do you have?");
			arraySize = input.nextInt();
		}
		catch(InputMismatchException ime) {
			System.out.println("Please enter a whole number greater than 0");
		}
		input.close();

		String[] favoriteColors = new String[arraySize];

		for(int i = 0; i < favoriteColors.length; i++) {
			System.out.println("Enter favorite color #" + (i + 1) + ": ");
			favoriteColors[i] = colorInput.nextLine();
		}
		colorInput.close();

		System.out.println("Your favorite colors are:");
		for(int i = 0; i < favoriteColors.length; i++) {
			System.out.println((i+1) + ". " + favoriteColors[i]);
		}

	}
}