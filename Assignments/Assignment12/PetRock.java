public class PetRock {

	// Declare and initialize instance variables
	private String rockType = "";
	private String name = "";
	private int age = 1;
	private double price = 0.00;


	public PetRock() {
		// empty constructor
	}


	/**
	 * 
	 * @param rockType
	 * @param name
	 * @param age
	 * @param price
	 */
	public PetRock(String rockType, String name, int age, double price) {
		this.setRockType(rockType);
		this.setName(name);
		this.setAge(age);
		this.setPrice(price);
	}

	// get methods

	public String getRockType() {
		return this.rockType;
	}

	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

	public double getPrice() {
		return this.price;
	}

	// set methods

	/**
	 * Sets the rock material of the pet rock.
	 * @param rockType The type of rock the pet rock is
	 * @throws ProductException
	 */
	public void setRockType(String rockType) throws ProductException {
		if(rockType.length() < 1) {
			ProductException pe = new ProductException("The entered rock type is too short. Rock types must be at least 1 character long.");
			throw pe;
		} else {
			this.rockType = rockType;
		}
	}
	
	/**
	 * All pets need a name. Sets the pet rock's name.
	 * @param name The name of the pet rock
	 * @throws ProductException
	 */
	public void setName(String name) throws ProductException {
		if(name.length() < 1) {
			ProductException pe = new ProductException("The entered name is too short. Names must be at least 1 character long.");
			throw pe;
		} else {
			this.name = name;
		}
		
	}

	/**
	 * Sets the age of the pet rock. Anything less than 1 year old is irrelevant to rocks.
	 * @param age the age of the pet rock
	 * @throws ProductException
	 */
	public void setAge(int age) throws ProductException {
		if(age < 0) {
			ProductException pe = new ProductException("Pet rocks cannot be less than 0 years old.");
			throw pe;
		} else {
			this.age = age;
		}
		
	}


	/**
	 * Set the price of the pet rock.
	 * @param price price of the pet rock
	 * @throws ProductException
	 */
	public void setPrice(double price) throws ProductException {
		if(price < 0.01 || price > 9999.99) {
			ProductException pe = new ProductException(price + " is an invalid entry. Enter a value between 0.01 - 9999.99");
			throw pe;
		} else {
			this.price = price;
		}	
	}


	public String toString() {
		return "PetRock{" +
				"rockType='" + this.rockType + "', " +
				"name='" + this.name + "', " +
				"price=" + this.price +
				"}";
	}
}