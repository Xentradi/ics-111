/**
 * A class for modeling a student.
 * The characteristics defined for a student are:
 * 	1) StudentID
 * 	2) Name
 * 	3) GPA
 */

import java.text.MessageFormat;
public class Student {
	
	/* Declare the characteristics of a student */
	private int id = 0;
	private String name = "";
	private double gpa  = 0.0;

	/**
	 * 
	 * Constructs a student object.
	 * 
	 * @param idNum The student's ID number.
	 * @param name	The student's name.
	 * @param gpa	The student's GPA.
	 */
	public Student(int idNum, String name, double gpa) {
		this.id = idNum;
		this.name = name;
		this.gpa = gpa;
	}


	/* Get methods */

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public double getGpa() {
		return.this.gpa;
	}


	/* Set methods */

	public void setId(int newId) {
		this.id = newId;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setGpa(double newGpa) {
		this.gpa = newGpa;
	}

	/**
	 * Returns a printable string of instance variables
	 * 
	 * Example: an object new Student(4321, "Ed", 4.0);
	 * 	id: 4321, name: Ed, gpa: 4.0
	 * 
	 * @return	output	A printable string of the instance variables.
	*/
	public String toString() {
		String output = MessageFormat.format("id: {0}, name: {1}, gpa: {2}", this.id, this.name, this.gpa);
		return output;
	}


}