package oop.inherit.run;

import oop.inherit.sample.Member;
import oop.inherit.sample.Student;

public class TestInheritance2 {
	public static void main(String[] args) {
		Student ss = new Student("홍길동",27,'남',"강남대학교",2,3.8,"체육");
		Member mm = new Member("홍길순",33,'여',"kh123","1234567",3312.235);
		
		System.out.println(ss.information());
		System.out.println(mm.information());
	}
}
