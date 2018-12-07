package poly.sample;

public abstract class Shape /*extends AbstClass*/implements IShape{
	//Field
	private int x; // x 좌표
	private int y; // y 좌표
	
	//Constructor
	public Shape() {
		
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 초기화 블럭 : 인스턴스변수 초기값 처리
	{
		x = y = 10;
	}
	
	//Getter and Setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		// return 클래스명 @ 16진수 hashcode;
		return this.x +", "+this.y;
	}
	/*@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}*/
}
