package inherit.controller;

import inherit.vo.ObjectOverriding;

public class TestObject {

	public static void main(String[] args) {
		// Object method overriding test
			ObjectOverriding test = new ObjectOverriding();
			test.testObjectMethod();
//			System.out.println("hashcode : "+ test.hashCode());
//			System.out.println("toString : "+ test.toString());
//			ObjectOverriding o2 = test;
			
//			System.out.println(test.equals(o2));
	/*	String a= "java";
		String a2 = new String("java");
		
		if(a.hashCode() == a2.hashCode()) {
			System.out.println("11");
		}
		else {
			System.out.println("22");
		}*/
			
	}

}
