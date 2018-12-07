package poly.sample;
// 미완성된 클래스를 의미함 : 추상클래스
// 객체 생성 못 하는 클래스임.
// 래퍼런스 변수는 선언할 수 있다.
// 추상 클래스의 생성자는 protected를 붙힌다.
// abstract는 클래스 앞 메소드 앞에만 사용 가능.
// 추상 메소드는 메소드의 헤드만 작성한다.

public abstract class AbstClass {
	// Constructor
	protected AbstClass() {
		
	}
	
	// Method
	// 미완성(추상 : abstract) 메소드
	public abstract int getArea();
	public abstract int getPerimeter();
}
