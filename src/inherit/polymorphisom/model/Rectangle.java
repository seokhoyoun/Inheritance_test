package inherit.polymorphisom.model;

public class Rectangle implements IShape{
	private double width;
	private double height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return Math.round(width * height * 10)/10.0;
	}
	
	public double perimeter() {
		return Math.round(2 * (width + height) * 10)/10.0;
	}
}
