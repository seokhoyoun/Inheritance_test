package poly.run;
import poly.sample.*;
public class TestUpDownCast {
	public void test1() {
		Shape s = null;
		s = new Circle(1,1,1);
		// UpCasting
		if(s instanceof Rectangle)
		((Rectangle)s).setWidth(50);
		else if(s instanceof Circle)
		System.out.println("반지름 : "+((Circle)s).getRadius());
		else if(s instanceof Triangle)
			System.out.println("ㅅㄱㅎ");
		System.out.println(s.getArea());
		//후손타입으로 다운 캐스팅시에는 래퍼런스가 참조하는 객체의 클래스형을 확인해야함.
	}
	
	public static void main(String[] args) {
		// 상속관계에 있는 부모, 자식클래스간 형변환 테스트
		TestUpDownCast t = new TestUpDownCast();
		t.test1();
	}
}
