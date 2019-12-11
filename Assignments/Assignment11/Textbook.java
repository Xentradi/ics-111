import java.math.BigInteger;

/**
 * A class for modeling a textbook
 * The characteristics of a textbook are:
 * 	1) ISBN
 * 	2) Title
 * 	3) Author
 * 	4) Publisher
 * 	5) Edition
 */
import java.text.MessageFormat;
public class Textbook {
	/* Declare the characteristics of a textbook */
	private String isbn = "";
	private String title = "";
	private String author = "";
	private String publisher = "";
	private String edition = "";

	public Textbook(String isbn, String title, String author, String publisher, String edition) {
		this.setIsbn(isbn);
		this.setTitle(title);
		this.setAuthor(author);
		this.setPublisher(publisher);
		this.setEdition(edition);
	}
	
	/* Get methods */
	public String getIsbn() {
		return this.isbn;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getPublisher() {
		return this.author;
	}

	public String getEdition() {
		return this.author;
	}

	/* Set methods */
	public void setIsbn(String newIsbn) throws TextbookException {
		if(newIsbn.length() <= 0) {
			// Throw Exception
			TextbookException te = new TextbookException("Err: ISBN is too short.");
			throw te;
		} else {
			this.isbn = newIsbn;
		}
 		
	}

	public void setTitle(String newTitle) throws TextbookException {
		if(newTitle.length() <= 0 ) {
			// Throw Exception
			TextbookException te = new TextbookException("Err: Title is invalid.");
			throw te;
		} else {
			this.title = newTitle;
		}
	}

	public void setAuthor(String newAuthor) throws TextbookException {
		if(newAuthor.length() <= 0) {
			// Throw Exception
			TextbookException te = new TextbookException("Err: Author is invalid.");
			throw te;
		} else {
			this.author = newAuthor;
		}
	}

	public void setPublisher(String newPublisher) throws TextbookException {
		if(newPublisher.length() <= 0) {
			// Throw Exception
			TextbookException te = new TextbookException("Err: Publisher is invalid.");
			throw te;
		} else {
			this.publisher = newPublisher;
		}
		
	}

	public void setEdition(String newEdition) throws TextbookException {
		if(newEdition.length() <= 0) {
			// Throw Exception
			TextbookException te = new TextbookException("Err: Edition is invalid.");
			throw te;
		} else {
			this.edition = newEdition;
		}
		
	}

	/**
	 * Returns a printable string of instance variables
	 * 
	 * Example: an object new Object2Textbook("9781401207700", "Superman: Cover to Cover", "Various", "DC Comics", "Hardcover");
	 * 	isbn: 9781401207700, title: Superman: Cover to Cover, author: Various, publisher: DC Comics, edition: Hardcover
	 * 
	 * @return	output	A printable string of the instance variables.
	*/
	public String toString() {
		String output = MessageFormat.format("isbn: {0}, title: {1}, author: {2}, publisher: {3}, edition: {4}", this.isbn, this.title, this.author, this.publisher, this.edition);
		return output;
	}
}