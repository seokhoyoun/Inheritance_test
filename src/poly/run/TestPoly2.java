package poly.run;

import poly.sample.*;

public class TestPoly2 {

	public static void main(String[] args) {
		// 추상메소드 오버라이딩 테스트
		Shape s = null;
		s = new Circle(100,100,150);
		// 클래스 형변환이 발생
		// 상속관계에 있는 클래스 끼리 형변환
		// 후손이 부모타입으로 바뀜 : UpCasting 이라고 한다.
		// 자동으로 형변환 된다.
		// Shape 클래스 멤버만 사용할 수 있게 됨.
		// 후손이 소유한 후손메소드를 사용하려면 후손클래스형으로 형변환을 한다.
		// 부모래퍼런스를 후손타입으로 형변환 : DownCasting - 직접 명시해야함.
		// 연산자 우선순위 참고!!
		System.out.println(((Circle)s).getRadius());
		// s를 먼저 형변환 하고 메소드를 호출해야한다.
		
		System.out.println(s.toString());
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
	}

}
