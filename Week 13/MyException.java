/**
 * An example of a custom exception class
 * Can be used as a template to create custom exceptions
 * this class is not meant to be run, it is meant to be thrown.
 */

public class MyException extends Exception {
	// The message that will output when the exception happens.

	private String message = "";

	/**
	 * Constructs and exception
	 */
	public MyException() {
		// constructor
	}

	// Get methods
	public String getMessage() {
		return this.message;
	}

	// Set methods
	public void setMessage(String message) {
		this.message = message;
	}

}