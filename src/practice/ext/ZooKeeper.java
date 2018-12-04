package practice.ext;

public class ZooKeeper {
	
	public void feed(Predetor predetor) {
		System.out.println("feed "+predetor.getFood());
	}
	
/*	public void feed(Lion lion) {
		System.out.println("feed banana");
	}*/

	public static void main(String[] args) {
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zookeeper.feed(tiger);
		zookeeper.feed(lion);
	}

}
