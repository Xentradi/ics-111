public class InClass99 {
    public static void main(String[] args){
        /*
        int theInteger = 5;
        double theDouble = 5.55;
        char theChar = 'c';
        boolean theBoolean = false;
        final String theString = "Bananas are awesome";

        System.out.println("theInteger\t" + theInteger);
        System.out.println("theDouble\t" + theDouble);
        System.out.println("theChar\t\t" + theChar);
        System.out.println("theBoolean\t" + theBoolean);
        System.out.println(theString);
        */

        // print my favorite foods from an array, numbered and on separate lines.
        String[] favoriteFoods = { "Pizza", "Sushi", "Sushi pizza" };
        for(int i = 0; i < favoriteFoods.length; i++) {
            System.out.println("[" + (i+1) + "] " + favoriteFoods[i]);
        }

        // blank line
        System.out.println("");

        // calculate the sum of 1234 & 5678. print the result
        int x = 1234, y = 5678;
        int z = x+y;
        System.out.println("The sum of " + x + " and " + y + " is: " + z);

        // blank line"
        System.out.println("");

        // store and print the cost of a burger, fries, and nuggets
        double a = 5.99;
        double b = 2.99;
        double c = 3.99;
        System.out.println("Cost of Burger:\t\t$" + a);
        System.out.println("Cost of Fries:\t\t$" + b);
        System.out.println("Cost of Nuggets:\t$" + c);

        double theX = 1.0;
        double theY = 5.0;
        double theZ = theX-- + (++theY);
        System.out.println("X: " + theX);
        System.out.println("Y: " + theY);
        System.out.println("Z: " + theZ);
    }
}