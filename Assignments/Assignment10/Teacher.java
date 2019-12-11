/**
 * A class for modeling a teacher.
 * The characteristics defined for a teacher are:
 * 	1) TeacherId
 * 	2) Name
 *  3) Email
 * 	4) Birthday
 */
import java.text.MessageFormat;
import java.time.LocalDate;
public class Teacher {
	/* Declare the characteristics of a teacher */
	private int id = 0;
	private String name = "";
	private String email = "";
	private LocalDate birthday = LocalDate.of(1970, 1, 1);

	/**
	 * 
	 * @param id	The teacher's ID number.
	 * @param name	The teacher's name.
	 * @param email The teacher's email.
	 * @param birthday	The teacher's birthday.
	 */
	public Teacher(int id, String name, String email, LocalDate birthday) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	}

	/* Get methods */
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public LocalDate getBirthday() {
		return this.birthday;
	}

	/* Set methods */

	public void setId(int newId) {
		this.id = newId;
	}

	public void setId(String newName) {
		this.name = newName;
	}

	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	public void setId(LocalDate newBirthday) {
		this.birthday = newBirthday;
		/* 
		 * Weird I know but those pesky child labor laws.
		 * Also I wanted to try a Date datatype. ¯\_(ツ)_/¯
		 */
	}

	/**
	 * Returns a printable string of instance variables
	 * 
	 * Example: an object new Teacher(123, "teacherName", "teacher@domain.com", 1970-01-01);
	 * 	id: 123, name: teacherName, email: teacher@domain.com, 1970-01-01
	 * 
	 * @return	output	A printable string of the instance variables.
	*/
	public String toString() {
		String output = MessageFormat.format("id: {0}, name: {1}, email: {2}, birthday: {3}", this.id, this.name, this.email, this.birthday);
		return output;
	}

	
}