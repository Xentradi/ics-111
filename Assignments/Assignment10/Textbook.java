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
public class Textbook {
	/* Declare the characteristics of a textbook */
	private String isbn = "";
	private String title = "";
	private String author = "";
	private String publisher = "";
	private String edition = "";

	public Textbook(String isbn, String title, String author, String publisher, String edition) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.edition = edition;
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
	public void setIsbn(String newIsbn) {
		this.isbn = newIsbn;
	}

	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

	public void setAuthor(String newAuthor) {
		this.author = newAuthor;
	}

	public void setPublisher(String newPublisher) {
		this.publisher = newPublisher;
	}

	public void setEdition(String newEdition) {
		this.edition = newEdition;
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