import java.util.Scanner;
public class InClass925 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double billTotal = 0;
        double cashOnHand = 0; 
        boolean hasFriends = true;

        System.out.println("What is the bill total?");
        billTotal = input.nextDouble();

        System.out.println("How much cash do you have?");
        cashOnHand = input.nextDouble();

        if(billTotal <= cashOnHand || hasFriends == true) {
            System.out.println("You're good");
        } else {
            System.out.println(("That's going to be a problem."));
        }

    }
}