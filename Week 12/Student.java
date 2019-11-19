public class Student {
	/** Declare the characteristics of a student */

	private String name = "";
	private int idNum = 0;
	private double studentGPA = 0.0;

	/**
	 * Constructs a student object
	 * 
	 * @param name The student's name.
	 * @param idNum The student's ID number.
	 * @param studentGPA The student's gpa.
	 */

	public Student(String name, int idNum, double studentGPA) {
		this.name = name;
		this.idNum = idNum;
		this.studentGPA = studentGPA;
	}

	
	/* Accessor/get methods */

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.idNum;
	}

	public double getGpa() {
		return this.studentGPA;
	}

	/* Mutator/set methods */

	public void setName(String newName) {
		this.name = newName;
	}

	public void setId(int newId) {
		this.idNum = newId;
	}

	public void setGpa(double newGpa) {
		this.studentGPA = newGpa;
	}


	/**
	 * Returns a printable string of instance variables
	 * 
	 * Example: an object new Student("Ed", 4321, 4.0);
	 * 	Student name: Ed
	 * 	ID: 4321
	 * 	GPA: 4.0
	 * 
	 * @return	output	A printable string of the instance variables.
	*/
	public String toString() {
		String output = "";
		output += "Student name: " + this.name;
		output += "\nID: " + this.idNum;
		output += "\nGPA: " + this.studentGPA;
		return output;
	}
}