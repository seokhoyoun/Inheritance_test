package poly.sample;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle() {
		
	}
	public Triangle(int x, int y,int base, int height) {
		super(x, y);
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public int getArea() {
		
		return (base * height)/2;
	}

	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return base + height + getHypotenuse();
	}
	public int getHypotenuse() {
		return (int)(Math.sqrt(base * base+ height + height));
	}
	
	@Override
	public String toString() {
		return super.toString()+","+this.base + ", "+ this.height;
	}
	
}
