/**
 * Exception used for any product classes.
 * Will be thrown if any product class receives invalid data.
 */

public class ProductException extends Exception {
	// The message that will output when the exception happens.

	private String message = "";

	/**
	 * Constructs a new exception
	 * @param message the error message
	 */
	public ProductException(String message) {
      this.message = message;
	}

	/**
	 * Constructs a new exception without a message
	 */
	public ProductException() {
		// empty constructor
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