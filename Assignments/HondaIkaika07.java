/**
 * Creates an array with a size of 60
 * Populates the array with random doubles in the range of 1-100
 * Print the contents of the array using printf to limit to 1/2 decimals
 * Calculate & print the average of all entries
 * Count and print the number of entries greater than the average
 * 
 * @author Honda, Ikaika
 * @assignment ICS 111 Assignment 07
 * @date Oct 20, 2019
 * @bugs none
 */

 import java.math.BigDecimal;
 import java.math.RoundingMode;

 public class HondaIkaika07 {
	public static void main(String[] args) {
		final int NUMBER_OF_STUDENTS = 60;
		final int MAXIMUM_SCORE = 100;
		final int LOWEST_SCORE = 55;

		double[] midtermScores = new double[NUMBER_OF_STUDENTS];
		double midtermScoreAverage = 0, midtermScoreSum = 0;
		int numberOfStudentsAboveAverage = 0;

		for(int i = 0; i < midtermScores.length; i++) {
			// Populates the array with randomly generated scores.
			midtermScores[i] = CreateNewScore(LOWEST_SCORE, MAXIMUM_SCORE);

		}

		System.out.printf("Midterm Scores:");
		for(int i = 0; i < midtermScores.length; i++) {
			// Print the students scores.
			System.out.printf("Student " + (i+1) + ": %.1f\n", midtermScores[i]);

			// Sum the values of the array as its being printed.
			midtermScoreSum = midtermScoreSum + midtermScores[i];
		}

		// find the average score
		midtermScoreAverage = midtermScoreSum / midtermScores.length;

		for(int i = 0; i < midtermScores.length; i++) {
			if(midtermScores[i] > midtermScoreAverage) {
				numberOfStudentsAboveAverage++;
			}
		}

		System.out.printf("\nThe average score is: %.2f%%\n", midtermScoreAverage);
		System.out.println(numberOfStudentsAboveAverage + " students are above the average.");
	}

	// Method to generate scores between beginningNumber-endingNumber
	static double CreateNewScore(double beginningNumber, double endingNumber) {
		

		// If the beginning number is higher than the ending number flip them around.
		if(beginningNumber > endingNumber) {
			beginningNumber = beginningNumber + endingNumber;
			endingNumber = beginningNumber - endingNumber;
			beginningNumber = beginningNumber - endingNumber;
		}

		// Some logic to keep the numbers in the acceptable range
		if(beginningNumber > 100) {
			beginningNumber = 100;
		}
		else if(beginningNumber < 0) {
			beginningNumber = 0;
		}

		if(endingNumber > 100) {
			endingNumber = 100;
		}
		else if(endingNumber < 15) {
			endingNumber = 15;
		}

		// If the 2 numbers are within 15 of each other keep subtracting 1 from the low number till it's at least 15 apart.
		double diff = endingNumber - beginningNumber;
		while(diff < 15) {
				beginningNumber = beginningNumber--;
		}

		double x = beginningNumber;
		double y = endingNumber - beginningNumber + 1;
		double randomValue = x + Math.random() * y;
		randomValue = round(randomValue, 1);
		
		// If the randomValue is > 100 it's because of a decimal, remove the decimal.
		if(randomValue > 100) {
			randomValue = (int)(randomValue);
		}
		return randomValue;
	}

	// Method to round doubles to inputed amount of decimal places.
	static double round(double value, int places) {
		BigDecimal bd = new BigDecimal(Double.toString(value));
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}

}