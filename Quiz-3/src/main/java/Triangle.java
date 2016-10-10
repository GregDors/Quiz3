import java.util.Date;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private Date datecreated;

	public Triangle() {
		datecreated = new Date();
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		datecreated = new Date();

	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	@Override
	/**
	 * getArea - Finds the area of a triangle you create
	 * 
	 * @return
	 */
	public double getArea() {
		while(side1 > 0 && side2 > 0 && side3 > 0){
			if ((side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1) {
				double x = (side1 + side2 + side3) / 2;
				return Math.sqrt(x * (x - side1) * (x - side2) * (x - side3));
			} else {
				return 0;
			}
		} 
		return 0;
	}

	@Override
	/**
	 * getPerimeter - Finds the perimeter of a triangle you create
	 * 
	 * @return
	 */
	public double getPerimeter() {

		return (side1 + side2 + side3);
	}

	@Override
	public String toString() {
		return ("This is a triangle created on " + datecreated + ". The Area of the triangle is " + getArea()
				+ "and the perimeter is " + getPerimeter() + ".");
	}
}
