package inherit.polymorphisom.model;

public class Circle implements IShape{
	static final double PI = Math.PI;
	private double radius;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}
	
	public double area() {
		return Math.round(radius * radius * PI * 10)/10.0;
		
	}
	public double perimeter() {
		return Math.round(radius * PI * 2 * 10)/10.0;
	}
	
	
}
