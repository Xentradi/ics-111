/**
 * A program that crashes on purpose
 * The checked exception is caught in a try/catch
 */

 public class ExceptionThrower2 {
	 public static void main(String[] args) throws MyException{
		try {
			// Create an empty exception
			MyException me = new MyException();

			me.setMessage("This program crashes on purpose.");

			throw me;
		}
		catch (MyException someName) {
			System.out.println("MyException was thrown on purpose");
		}
		

	}
}
