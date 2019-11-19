/**
 * Create array `midtermScores` with a size of 60 filled with randomly generated grades (doubled)
 * Use method `printStudentData` to print the values of the array
 * Use method `findArrayAverage` to find the average of an array. Print the return
 * Print the number of grades above the average
 * 
 * Create array `letterGrades`  with the same size as `midtermScores`
 * Translate the scores from midtermScores into letter grades stored in letterGrades
 * Use method `printStudentData` to print the values of `letterGrades`
 * Count and print the number of each letter grade contained in `letterGrades`
 * Use a method to print the number grade and letter grade of a student based on their number (1-60)
 * 
 * Additional notes:
 * There is no student 0
 * Include try/catch if necessary
 * 
 * @author Honda, Ikaika
 * @assignment ICS 111 Assignment 09
 * @date Nov 15, 2019
 * @bugs none
 */

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.InputMismatchException;

public class HondaIkaika09 {
	public static void main(String[] args) {
		final int NUMBER_OF_STUDENTS = 60;
		final int MAX_SCORE = 100;
		final int MIN_SCORE = 1;

		double[] midtermScores = new double[NUMBER_OF_STUDENTS];
		char[] letterGrades = new char[midtermScores.length];
		int scoresOverAverage = 0;

		// Count Letter Grades [0] A [1] B [2] C [3] D [4] F
		int[] countLetterGrades = new int[5];

		// fill in the scores
		for(int i = 0; i < midtermScores.length; i++) {
			midtermScores[i] = createNewScore(MIN_SCORE, MAX_SCORE);
		}

		double averageScore = findArrayAverage(midtermScores);

		for(int i = 0; i < midtermScores.length; i++) {
			if(midtermScores[i] > averageScore) {
				scoresOverAverage++;
			}	
		}
		
		printStudentData(midtermScores);
		System.out.println("");
		System.out.println("Average score: " + averageScore);
		System.out.println("Scores over Average: " + scoresOverAverage);
		System.out.println("");

		// convert scores to grades
		for(int i = 0; i < letterGrades.length; i++) {
			letterGrades[i] = convertScoreToGrade(midtermScores[i]);

			// count each grade
			if(letterGrades[i] == 'A') {
				countLetterGrades[0]++;
			} else if(letterGrades[i] == 'B') {
				countLetterGrades[1]++;
			} else if(letterGrades[i] == 'C') {
				countLetterGrades[2]++;
			} else if(letterGrades[i] == 'D') {
				countLetterGrades[3]++;
			} else if(letterGrades[i] == 'F') {
				countLetterGrades[4]++;
			}
		}

		printStudentData(letterGrades);

		System.out.print("\n\n");

		// print count of letter grades
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
		System.out.println();

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
		userStudentNum = userStudentNum - 1;
		System.out.println("Student# " + (userStudentNum + 1) + ": Score: " + accessStudentData(userStudentNum, midtermScores) + "% Grade: " + accessStudentData(userStudentNum, letterGrades));


	}

	
	public static void printStudentData(double[] vArray) {
		for (int i = 0; i < vArray.length; i++) {
			System.out.printf("Student " + (i + 1) + ": %.1f\n", vArray[i]);	
		}
	}

	public static void printStudentData(char[] vArray) {
		for (int i = 0; i < vArray.length; i++) {
			System.out.println("Student " + (i+1) + ": " + vArray[i]);
		}
	}

	public static double findArrayAverage(double[] vArray) {
		int arraySum = 0;
		for(int i = 0; i < vArray.length; i++) {
			arraySum += vArray[i];
		}
		return arraySum / vArray.length;
	}

	public static double accessStudentData(int vIndex, double[] vArray) {
		return vArray[vIndex];
	}

	public static char accessStudentData(int vIndex, char[] vArray) {
		return vArray[vIndex];
	}


	/**
	 * Methods not required by the assignment
	 */
	public static double createNewScore(double beginningNumber, double endingNumber) {
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

		// Space the numbers out to meet the 15 difference minimum
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

	public static double round(double value, int places) {
		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	public static char convertScoreToGrade(double score) {
		char grade = 'Z';
		if (score < 60) {
			grade = 'F';
		} else if (score < 70) {
			grade = 'D';
		} else if (score < 80) {
			grade = 'C';
		} else if (score < 90) {
			grade = 'B';
		} else if (score <= 100) {
			grade = 'A';
		}
		// System.out.println(grade);
		return grade;
	}


}