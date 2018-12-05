package practice.ext;

public class Tiger extends Predetor implements Barkable{
	
	public String getFood() {
		return "apple";
	}
	
	public void bark() {
		System.out.println("어흥");
	}
}
