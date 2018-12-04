package oop.inherit.sample;

public class Person {
	//field
	private String name;
	private int age;
	private char gender;
	
	//Constructor
	public Person() {	// Super 클래스는 무조건 기본 생성자가 있어야한다.
		System.out.println("person() run...");
	}
	
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return name+", "+age+", "+gender+", ";
	}
	
}
