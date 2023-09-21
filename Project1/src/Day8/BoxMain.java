package Day8;

public class BoxMain {
	
	public static void main(String[] args) {
		Box myBox1 = new Box(10, 20, 15);
		Box myBox2 = new Box();
		Box myBox3 = new Box(7);
		
		double vol = 0;
		
		vol = myBox1.volume();
		System.out.println("Vol Box1: " + vol);
		vol = myBox2.volume();
		System.out.println("Vol Box2: " + vol);
		vol = myBox3.volume();
		System.out.println("Vol Box3: " + vol);
	}

}
