package practice.ext;

public class Lion extends Predetor implements Barkable{
	
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("으르렁");
	}
}
