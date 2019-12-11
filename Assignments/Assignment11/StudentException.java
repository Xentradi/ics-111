/**
 * Exception used for the teacher class.
 * Will be thrown if the teacher class receives invalid data.
 */

public class TeacherException extends Exception {
	// The message that will output when the exception happens.

	private String message = "";

	/**
	 * Constructs and exception
	 */
	public TeacherException(String message) {
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