package poly.sample;

public interface IShape {
	// 상수 필드를 멤버로 선언 가능.
	public static final int DATA = 1;
	// 추상메소드만 멤버로 가진 추상클래스 변형체
	/*public abstract*/ int getArea(); // 생략가능
	public abstract int getPerimeter();
}
