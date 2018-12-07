package poly.sample;

public class Rectangle extends Shape{
	// Field
	private int width;
	private int height;
	
	//Constructor
	public Rectangle() {
		
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	// Getter and Setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+this.width + ", "+ this.height;
	}
	@Override
	public int getArea() {
		return (int)(width * height);
	}
	@Override
	public int getPerimeter() {
		return (int)(2*(width+height));
	}
	
	
	
	
}
