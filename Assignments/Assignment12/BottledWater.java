import java.util.Date;
public class BottledWater {

	// Declare and initialize instance variables
	private String source = "";
	private Date bottleDate = new Date();
	private double price = 0.00;

	public BottledWater(String source, Date bottleDate, double price) {

	}

	public BottledWater() {
		// empty constructor
	}

	// get methods
	
	public String getSource() {
		return this.source;
	}

	public Date getBottleDate() {
		return this.bottleDate;
	}

	public double getPrice() {
		return this.price;
	}

	// set methods

	public void setSource(String source) throws ProductException {
		if(source.length() < 1) {
			ProductException pe = new ProductException("Source name is too short.");
			throw pe;
		} else {
			this.source = source;
		}
	}
	

	public void setBottleDate(Date bottleDate) throws ProductException {

	}


	public void setPrice(double price) throws ProductException {

	}


	public String toString() {
		return "BottledWater{" +
				"source='" + this.source + "', " +
				"bottleDate='" + this.bottleDate + "', " +
				"price=" + this.price +
				"}";
	}
}