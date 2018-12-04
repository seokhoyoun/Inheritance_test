package oop.inherit.run;

import java.util.Scanner;

import oop.inherit.sample.Student;

public class TestInheritance1 {

	public static void main(String[] args) {
		Student ss = new Student();
		Scanner scanner = new Scanner(System.in);
		
/*		System.out.print("학생 이름 : ");
		ss.setName(scanner.next());
		System.out.print("학교 이름 : ");
		scanner.nextLine(); // 버퍼에서 꺼내기
		ss.setSchoolName(scanner.nextLine());
		System.out.print("학년 : ");
		ss.setSchoolYear(scanner.nextInt());
		System.out.print("나이 : ");
		ss.setAge(scanner.nextInt());
		System.out.print("성별(남/여) : ");
		ss.setGender(scanner.next().charAt(0));
		System.out.print("전공 : ");
		ss.setMajor(scanner.next());
		System.out.print("학점 : ");
		ss.setScore(scanner.nextDouble());*/
		
		System.out.println(ss.information());
		System.out.println(ss.hashCode());
		System.out.println(ss.toString());
		
		Student st = ss;
		
		System.out.println(ss.equals(st));
		
	}

}
