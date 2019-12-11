/**
 * The driver class is for our custom objects.
 * Create and print Student objects.
 * IMPORTANT: Student.java must be in the same folder as School.
**/

public class School {
	public static void main(String[] args) {
		Student student1  = new Student("Ikaika", 1, 2.5);

		System.out.println(student1);

		try {
			student1.setGpa(5);
         System.out.println(student1);
		}
		catch (StudentException se) {
			System.out.println(se.getMessage());
		}
	}
}