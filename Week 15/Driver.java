import java.util.*;

public class Driver {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1);

		Random random1 = new Random(345);
		System.out.print("From random1: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(random1.nextInt(100) + " ");
		}


	}
}