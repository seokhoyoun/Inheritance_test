package inherit.polymorphism.controller;

import inherit.polymorphisom.model.Circle;
import inherit.polymorphisom.model.IShape;
import inherit.polymorphisom.model.Rectangle;
import inherit.polymorphisom.model.Triangle;

public class TestIShape {
	
	public static void main(String[] args) {
		/*IShape s = new Circle(15.5);
		System.out.println("원의 넓이 : "+s.area());
		System.out.println("원의 둘레 : "+s.perimeter());
		
		IShape s2 = new Rectangle(34.5,42.7);
		System.out.println("사각형의 넓이 : "+s2.area());
		System.out.println("사각형의 둘레 : "+s2.perimeter());*/
		
		IShape[] s3 = new IShape[5];
		
		s3[0] = new Triangle(12.5,10.5);
		s3[1] = new Circle(10.5);
		s3[2] = new Rectangle(1.5,5.5);
		s3[3] = new Triangle(15.5,6.5);
		s3[4] = new Rectangle(15.5,16.5);
		for(int i = 0; i < s3.length; i++) {
			if(s3[i] instanceof Triangle) {
				Triangle a = (Triangle) s3[i];
				System.out.println("빗변의 길이) "+Math.round(a.getHypotenuse()*10)/10.0);
			}
			System.out.println(i+"번 도형 넓이) "+s3[i].area());
			System.out.println(i+"번 도형 둘레) "+s3[i].perimeter());
			System.out.println();
		}
	}
	
}
