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
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
		this.setBirthday(birthday);
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

	public void setId(int newId) throws TeacherException {
		if(newId > 1000) {
			TeacherException te = new TeacherException("Err: Teacher ID must be greater than 1000");
			throw te;
		} else {
			this.id = newId;
		}
		
	}

	public void setName(String newName) throws TeacherException {
		if(newName.length() >= 0) {
			TeacherException te = new TeacherException("Err: Teacher Name is invalid");
			throw te;
		} else {
			this.name = newName;
		}
		
	}

	public void setEmail(String newEmail) throws TeacherException {
		if(newEmail.length() >= 0) {
			TeacherException te = new TeacherException("Err: Teacher Email is invalid");
			throw te;
		} else {
			this.email = newEmail;
		}
		
	}

	public void setBirthday(LocalDate newBirthday) throws TeacherException {
		if(newBirthday.length() >= 0) {
			// should probably also make sure the birthday is realistic and we're not trying to make somebody 1 day old.
			TeacherException te = new TeacherException("Err: Teacher Age is invalid");
			throw te;
		} else {
			this.birthday = newBirthday;
		}
		
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