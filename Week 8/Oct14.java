import java.util.Scanner;
import java.util.Arrays;
public class Oct14 {
	public static void main(String[] args) {
		int numStudents = 5;
		double[] midtermGrades = new double[numStudents];

		Scanner input = new Scanner(System.in);

		for (int i  = 0; i < midtermGrades.length; i++) {
			System.out.println("Enter grade: ");
			midtermGrades[i] = input.nextDouble();
		}
		String gradeString = Arrays.toString(midtermGrades);
		gradeString = gradeString.replace("[", "");
		gradeString = gradeString.replace("]", "");
		System.out.println("The student grades are: " + gradeString );

		double sumMidtermGrade = 0.0;
		// total the grades
		for (int i = 0; i < midtermGrades.length; i++) {
			sumMidtermGrade += midtermGrades[i];
		}
		
		// average the grades
		double avgMidtermGrade = sumMidtermGrade / midtermGrades.length;

		System.out.println("Average: " + avgMidtermGrade);
	}
}