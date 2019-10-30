import java.util.Scanner;
public class Oct21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] myArray = new String[10];

		for(int i = 1; i < myArray.length; i++) {
			System.out.println((i+1) + ". Type something!");
			String userInput = input.nextLine();

			if (userInput.length() == 0) {
				break;
			}
			else if(userInput.length() >= 3) {
				myArray[i] = userInput;
			}
		}

		for(int i = 0; i < myArray.length; i++) {
			System.out.println((i+1) + ". " + myArray[i]);
		}

	}
}