/**
 * Exception used for the textbook class.
 * Will be thrown if the textbook class receives invalid data.
 */

public class TextbookException extends Exception {
	// The message that will output when the exception happens.

	private String message = "";

	/**
	 * Constructs and exception
	 */
	public TextbookException(String message) {
      this.message = message;
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