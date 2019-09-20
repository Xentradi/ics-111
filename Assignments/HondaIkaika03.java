/**
 * Converts a defined amount of seconds into minutes, hours, and days.
 * 
 * @author     Honda, Ikaika
 * @assignment ICS 111 Assignment 03
 * @date       Sept 14, 2019
 * @bugs       Only used 2 arithmetic operators in 6 total operations
 */

 public class HondaIkaika03 {
	 public static void main(String[] args) {

        final int SECONDS_IN_MINUTE = 60;
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;

		// The given number of seconds until the end of the world!
		final int initialSeconds = 123456789;

		// Converts seconds to minutes and calculates how many seconds would remain.
		int remainingSeconds = initialSeconds % SECONDS_IN_MINUTE;
		int minutes = initialSeconds / SECONDS_IN_MINUTE;

		// Converts minutes to hours and calculates how many minutes would remain.
		int renaminingMinutes = minutes % MINUTES_IN_HOUR;
		int hours = minutes / MINUTES_IN_HOUR;

		// Converts hours to days and calculates how many hours would remain.
		int remainingHours = hours % HOURS_IN_DAY;
		int days = hours / HOURS_IN_DAY;

		// Prints the findings.
		System.out.println("Seconds: " + initialSeconds);
		System.out.println("The world will end in " + days + " days " + remainingHours + 
		" hours " + renaminingMinutes + " minutes and " + remainingSeconds + " seconds!\n");
		
		System.out.println(initialSeconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
		System.out.println(minutes + " minutes is " + hours + " hours and " + renaminingMinutes + " minutes.");
		System.out.println(hours + " hours is " + days + " days and " + remainingHours + " hours.");

	 }
 }