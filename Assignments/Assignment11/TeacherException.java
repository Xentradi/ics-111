/**
 * Exception used for the student class.
 * Will be thrown if the student class receives invalid data.
 */

public class StudentException extends Exception {
	// The message that will output when the exception happens.

	private String message = "";

	/**
	 * Constructs and exception
	 */
	public StudentException(String message) {
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