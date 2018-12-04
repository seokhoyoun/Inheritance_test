package practice.ext;

public class Tiger extends Animal implements Predetor,Barkable{
	
	public String getFood() {
		return "apple";
	}
	
	public void bark() {
		System.out.println("어흥");
	}
}
