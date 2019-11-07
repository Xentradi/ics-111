
/**
 * Create array `midtermScores` with pre-determined size (60)
 * Fill the array with numbers between 0-100. numbers must span 15 whole numbers
 * Print the contents of the array. use printf to trim to 1 or 2 decimal places
 * Calculate the average of all array values. Print the average.
 * Count how many values are above the average. Print the count.
 * Create a second array called `letterGrades` same size as `midtermScores`
 * Convert the number values from `midtermScores` to letter grades in `letterGrades`
 * Print a list of how many of each letter grade there are.
 * Ask the user for a number (between 1 and 60)
 * Print the numerical and letter grade for that number.
 * 
 * There is no student 0
 * Include try/catch
 * 
 * @author Honda, Ikaika
 * @assignment ICS 111 Assignment 08
 * @date Oct 30, 2019
 * @bugs none
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.InputMismatchException;

public class HondaIkaika08 {
	public static void main(String[] args) {
		final int NUMBER_OF_STUDENTS = 60;
		final int MAX_SCORE = 100;
		final int MIN_SCORE = 1;

		double[] midtermScores = new double[NUMBER_OF_STUDENTS];
		char[] letterGrades = new char[midtermScores.length];
		int[] countLetterGrades = new int[5];
		// Count Letter Grades [0] A [1] B [2] C [3] D [4] F

		double sumScores = 0;
		double averageScore = 0;
		int scoresAboveAverage = 0;

		// Create scores, fill arrays, sum scores, count letter grades
		for (int i = 0; i < midtermScores.length; i++) {
			midtermScores[i] = CreateNewScore(MIN_SCORE, MAX_SCORE);
			sumScores = sumScores + midtermScores[i];

			char grade = ' ';
			if (midtermScores[i] < 60) {
				grade = 'F';
				countLetterGrades[4]++;
			} else if (midtermScores[i] < 70) {
				grade = 'D';
				countLetterGrades[3]++;
			} else if (midtermScores[i] < 80) {
				grade = 'C';
				countLetterGrades[2]++;
			} else if (midtermScores[i] < 90) {
				grade = 'B';
				countLetterGrades[1]++;
			} else if (midtermScores[i] <= 100) {
				grade = 'A';
				countLetterGrades[0]++;
			}
			letterGrades[i] = grade;
		}

		// find the average score
		averageScore = sumScores / midtermScores.length;

		// find average letter grade.
		char averageGrade = ' ';
		if (averageScore < 60) {
			averageGrade = 'F';
		} else if (averageScore < 70) {
			averageGrade = 'D';
		} else if (averageScore < 80) {
			averageGrade = 'C';
		} else if (averageScore < 90) {
			averageGrade = 'B';
		} else if (averageScore <= 100) {
			averageGrade = 'A';
		}

		// print the arrays. count how many scores are above average
		for (int i = 0; i < midtermScores.length; i++) {
			System.out.printf("Student " + (i + 1) + "\n\tScore: %.1f\n\tLetter Grade: " + letterGrades[i] + "\n",
					midtermScores[i]);
			if (midtermScores[i] > averageScore) {
				scoresAboveAverage++;
			}
		}

		// print the averages and how many are above average
		System.out.printf("\nAverage Score: %.1f\nAverage Grade: " + averageGrade + "\n", averageScore);
		System.out.println("Scores above the average: " + scoresAboveAverage);

		// print the count of letter grades
		System.out.println("Count of letter grades:");
		for (int i = 0; i < countLetterGrades.length; i++) {
			if (i == 0) {
				System.out.print("A: ");
			} else if (i == 1) {
				System.out.print("B: ");
			} else if (i == 2) {
				System.out.print("C: ");
			} else if (i == 3) {
				System.out.print("D: ");
			} else if (i == 4) {
				System.out.print("F: ");
			}
			System.out.print(countLetterGrades[i] + "\n");
		}

		Scanner input = new Scanner(System.in);
		int userStudentNum = -1;

		// Ask the user for a student number, if they enter 0 exit the loop
		while (userStudentNum == -1 || userStudentNum > midtermScores.length) {
			if (userStudentNum == 0) {
				break;
			} else if (userStudentNum > midtermScores.length) {
				System.out.println("That was not a valid option.");
			}

			try {
				System.out.println("Input a student number between 1-" + midtermScores.length + ". Or enter 0 to EXIT.");
				userStudentNum = input.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("That was not a valid option.");
				input.next();
			}

			// if the user enters a value less than 0 set the variable to an int that will
			// trigger the error message
			if (userStudentNum < 0) {
				userStudentNum = midtermScores.length + 1;
			}
		}
		input.close();

		if(userStudentNum == 0) {
			System.exit(0);
		}

		// subtract 1 from input number to match the array index
		userStudentNum = userStudentNum - 1;
		System.out.printf("Student " + (userStudentNum + 1) + "\n\tScore: %.1f\n\tLetter Grade: "
				+ letterGrades[userStudentNum] + "\n", midtermScores[userStudentNum]);

	}

	public static double CreateNewScore(double beginningNumber, double endingNumber) {
		// If the beginning number is higher than the ending number flip them around.
		if (beginningNumber > endingNumber) {
			beginningNumber = beginningNumber + endingNumber;
			endingNumber = beginningNumber - endingNumber;
			beginningNumber = beginningNumber - endingNumber;
		}

		// Some logic to keep the numbers in the acceptable range
		if (beginningNumber > 100) {
			beginningNumber = 100;
		} else if (beginningNumber < 0) {
			beginningNumber = 0;
		}

		if (endingNumber > 100) {
			endingNumber = 100;
		} else if (endingNumber < 15) {
			endingNumber = 15;
		}

		// If the 2 numbers are within 15 of each other keep subtracting 1 from the low
		// number till it's at least 15 apart.
		double diff = endingNumber - beginningNumber;
		while (diff < 15) {
			beginningNumber = beginningNumber--;
		}

		double x = beginningNumber;
		double y = endingNumber - beginningNumber + 1;
		double randomValue = x + Math.random() * y;
		randomValue = round(randomValue, 1);

		// If the randomValue is > 100 it's because of a decimal, remove the decimal.
		if (randomValue > 100) {
			randomValue = (int) (randomValue);
		}
		return randomValue;
	}

	// Method to round doubles to inputed amount of decimal places.
	public static double round(double value, int places) {
		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}