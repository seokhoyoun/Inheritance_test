package poly.run;
import poly.sample.*;

public class TestPoly1 {

	public static void main(String[] args) {
		// 상속받은 부모의 public 메소드는 후손이 자신의 것처럼 사용할 수 있다.
		Circle cir = new Circle(100,100,50);
		System.out.println(cir.toString());
		System.out.println(cir); // toString()이 자동 생성 된다.
		
		Rectangle rec = new Rectangle(20,20,150,150);
		System.out.println(rec);
		
		// 다형성 : 부모 클래스형 래퍼런스가 후손 객체의 주소를 받을 수 있다.
		
		Shape sh = cir;
		System.out.println(sh);
		sh = rec;
		System.out.println(sh);
		Object obj = cir;
		System.out.println(obj);
	}

}
