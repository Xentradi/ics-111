/**
 * A program that crashes on purpose
 * The checked exeption is declared in the throws clause of the main method.
 */

 public class ExceptionThrower {
	 public static void main(String[] args) throws MyException{
		 // Create an empty exception
		 MyException me = new MyException();

		 me.setMessage("This program crashes on purpose.");

		 throw me;

	 }
 }