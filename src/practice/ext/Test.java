package practice.ext;
import java.lang.*;
public class Test {
	
	
	public static void test(String str) {
		if(str == null | str.length() ==0) {
			System.out.println("String is empty");
		}
		else {
			System.out.println("String is not empty");
		}
		
	}
	
	public static void main(String[] args) {
		String a = "자바";
		if(new String("자바") == "자바") {
			System.out.println("1111");
		}
		else {
			System.out.println("2222");
		}
	}
}
