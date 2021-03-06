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

	/**
	 * Constructs a student object
	 * 
	 * @param name The student's name.
	 * @param idNum The student's ID number.
	 */
	public Student(String name, int idNum) {
		this.name = name;
		this.idNum = idNum;
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

	public void setId(int newId) throws StudentException {
      if(newID > 0) {
         this.idNum = newId;
      } else {
         // Throw an exception
         StudentException se = new StudentException("ERROR: " + newId + " is less than 1.");
         throw se;
      }
	}

	public void setGpa(double newGpa) throws StudentException {
		if(newGpa >= 0.0 && newGpa <= 4.0) {
			this.studentGPA = newGpa;
		} else {
			// Throw an exception with appropriate error message.
			StudentException se = new StudentException("ERROR: " + newGpa + " is not between 0.0 - 4.0");
         //se.setMessage("ERROR: " + newGpa + "is not between 0.0 - 4.0");
			throw se;
		}

		
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