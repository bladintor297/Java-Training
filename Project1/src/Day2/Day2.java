package Day2;

public class Day2 {
	public static void printCheer() {
		System.out.println ("Three cheers for Pirates");
		System.out.println ("Huzzah!");
		System.out.println ("Huzzah!");
		System.out.println ("Huzzah!");
	}
	
	public static void day1() {
		System.out.println("A partridge in a pear tree.");
	}
	
	public static void day2() {
		System.out.println("Two turtle doves, and");
		day1();
	}
	
	public static void breakfast() {
		System.out.println("I do not like green eggs and ham,\nI do not like them, Sam I am!");
	}
	
	public static void goat() {
		System.out.println("I do not like them on boat,\nI like them with a goat,");
		breakfast();
	}
	
	public static void Lollipop() {
		System.out.println("Lollipop, lollipop\nOh, lolli lolli lolli");
	}
	
	public static void Calc() {
		for (int i=0; i<10; ++i) {
			String inner = "I'm inside the loop";
			System.out.println(inner);
		}
		String outer = "I'm inside the Main()";
		System.out.println(outer);
	}
	
	public static void main (String[] args) {
//		Task 1
//		printCheer();
//		System.out.println();
//		printCheer();
		
//		Task2
//		day1();
//		day2();
		
//		Task3
//		breakfast();
//		goat();
		
//		Task4
//		Lollipop();
//		System.out.println();
//		Lollipop();
//		System.out.println("Call my baby lollipop");
		
//		Task5
		Calc();
	}
}
