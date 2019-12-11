/**
 * Driver class for the school scenario
 * Creates 3 objects : Student, Teacher, & Textbook
 * Prints and modifies these objects
 * 
 * Required files: Student.java, Teacher.java, Textbook.java
 * 
 * Also sorry about the birthday, I don't know your birthday so I used linux epoch. 
 * I'm not saying you look that old...I should stop now.
 * 
 * @author     Honda, Ikaika
 * @assignment ICS 111 Assignment 10
 * @date       November 18, 2019
 * @bugs       None
 */
import java.time.LocalDate;
public class HondaIkaika11 {
	public static void main(String[] args) {
		System.out.print("This program models a school.\nIt contains 3 objects:\n1) Student\n2) Teacher\n3) Textbook\n\n");

		Student student1 = new Student(1, "Ikaika", 2.0);
		Teacher teacher1 = new Teacher(1, "Nikki Manuel", "ndmanuel@hawaii.edu", LocalDate.of(1970, 1, 1));
		Textbook textbook1 = new Textbook("9781401207700", "Superman: Cover to Cover", "Various", "DC Comics", "Hardcover");
		
		System.out.println("\nPrinted using System.out.println(student1.toString())");
		System.out.println(student1.toString());

		System.out.println("\nPrinted using System.out.println(teacher1)");
		System.out.println(teacher1);

		System.out.println("\nUsed a mutator method to change student1's name then printed again.");
		student1.setName("Ikaika Honda");
		System.out.println(student1);

		System.out.println("\nUsed a get method to print textbook1's title in the following sentence:");
		System.out.println("I wish we could use " + textbook1.getTitle() + " as a textbook.");

	}
}