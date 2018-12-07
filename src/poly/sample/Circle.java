package poly.sample;

public class 
Circle extends Shape{
	// Field
	private int radius; // 원의 반지름
	
	// Constructor;
	public Circle() {
	}
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	// Getter and Setter
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+this.radius;
	}
	@Override
	public int getArea() {
		// 원의 면적을 구해서 리턴
		return (int)(Math.PI * Math.pow(radius, 2));
	}
	@Override
	public int getPerimeter() {
		// 원의 둘레를 구해서 리턴
		
		return (int)(Math.PI * 2 * radius);
	}
	
	
	
}
