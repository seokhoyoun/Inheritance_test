package inherit.polymorphisom.model;

public class Triangle implements IShape{
	private double base;
	private double height;
	
	public Triangle() {
		
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double area() {
		return Math.round(base * height /2 * 10)/10.0;
	}
	public double getHypotenuse() {
		// 빗변 길이
		return Math.sqrt(base*base + height+height);
	}
	@Override
	public double perimeter() {
		return Math.round((base + height + getHypotenuse()) * 10)/10.0;
		
	}
}
