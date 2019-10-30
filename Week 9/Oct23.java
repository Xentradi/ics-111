public class Oct23 {
	public static void main(String[] args) {
		/*
		int[] x = {4, 10, 22, 100, 48, 79};

		int key = 48;
		boolean found = false;
		int i = 0;
		while (i < x.length && found == false) {
			if(x[i] == key) {
				System.out.println("Key found at index: " + i);
				found = true;
			}
			i++;
		}
		if(found == false) {
			System.out.println("Key not found.");
		}
		*/

		int[] myArray = { 3, 4, 22, 42, 100};
		int low = 0;
		int high = myArray.length - 1;
		int mid = (low + high)/2;
		System.out.println(mid);

		int x = 22;

		if (x  < myArray[mid]) {
		    for (int i = 0; i < mid; i++) {
		        if(x == myArray[i]) {
		            System.out.println("Found at index: " + i);
		        }
		    }
		}
		else if (x >= myArray[mid]) {
		    for (int i = mid; i < myArray.length; i++) {
		        if(x == myArray[i]) {
		            System.out.println("Found at index: " + i);
		        }
		    }
		}

	}
}