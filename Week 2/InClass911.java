/**
 * Short description of the program.
 * 
 * @author     Honda, Ikaika
 * @assignment ICS 111 In Class 9/11
 * @date       Sept 11, 2019
 * @bugs       none
 */


 // import scanner class to allow use of scanner objects
 import java.util.Scanner;

 public class InClass911 {
     public static void main(String[] args){
        // Create a scanner object
        // This lets us read user input
        Scanner reader = new Scanner(System.in);

        //Declare necessary variables
        String userName = "";
        int userAge = 0;
        double userWage = 0.0;
        final String response1 = "!? You need a raise!!";
        final String response2 = "!? NICE!!";
        String useResponse = "";
        
        // Prompt user for input
        System.out.println("What is your name?");
        // Store users input into variable userName
        userName = reader.nextLine();
        System.out.println("Nice to meet you " + userName);

        System.out.println("How old are you?");
        // Stores users age input to userAge
        userAge = reader.nextInt();
        System.out.println("OK! Next year you'll be: " + (++userAge));

        System.out.println("How much do you make per hour?");
        userWage = reader.nextDouble();

        if(userWage >= 10.00) {
            useResponse = "$" + userWage + response2;
        } else {
            useResponse = "$" + userWage + response1;
        }

        System.out.println(useResponse);

     }
 }