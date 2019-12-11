import java.math.*;


public class Circle {
	/**
	 * Instance variables for Circle
	 */
	private double radius = 0;

	/**
	 * Constructs a Circle
	 * 
	 * @param radius The radius of the circle
	 */
	public Circle(double radius) {
		setRadius(radius);
	}

	/** set/get methods */

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getDiameter() {
		return this.radius*2;
	}

	public double getCirc() {
		double circ = this.getDiameter() * Math.PI;
		return circ;
	}

	public double getArea() {
		double area = Math.PI * Math.pow(this.getRadius(),2);
		return area;
	}

}