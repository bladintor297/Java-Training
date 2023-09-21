package Day3;

import java.util.Scanner;

public class Day3a {

	public static void CheckHumidity(double h) {

		if (h > 90)
			System.out.println("Rain -> skip watering");
		else
			System.out.println("No Rain -> water the plants");
	}

	public static void ValueComparison() {
		int a = 5;
		int b = 10;

		System.out.println(a < b);
		System.out.println(a > 100);
		System.out.println(a <= 5);
		System.out.println(b == 2 * a);
		System.out.println(b != 2 * a);
	}

	public static void StringComparison() {
		String a = "Example";
		String b = "example";

		System.out.println(a.equals(b));

		a = "SoftUni";
		b = "#SoftUni".substring(1);
		System.out.println(a.equals(b));
		System.out.println(a == b);
	}

	public static void FreezingWeather() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Temperature: ");
		double temp = Double.parseDouble(sc.nextLine());

		if (temp <= 0)
			System.out.println("Freezing weather");
	}

	public static void BlockOfCode() {
		String color = "red";

		if (color.equals("red"))
			System.out.println("tomato");

		else
			System.out.println("banana");

		System.out.println("lemon");
	}

	public static void OddEven() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double num = Double.parseDouble(sc.nextLine());

		if (num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

	public static void SeriesOfCondition() {
		int a = 7;

		if (a > 4)
			System.out.println("Bigger than 4");

		else if (a > 5)
			System.out.println("Bigger than 5");

		else
			System.out.println("Bigger than 4");

	}

	public static void NumberToWords() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Key in number >> ");
		int num = scanner.nextInt();

		if (num == 1)
			System.out.println("One");
		else if (num == 2)
			System.out.println("Two");
		else if (num == 3)
			System.out.println("Three");
		else if (num == 4)
			System.out.println("Four");
		else if (num == 5)
			System.out.println("Five");
		else if (num == 6)
			System.out.println("Six");
		else if (num == 7)
			System.out.println("Seven");
		else if (num == 8)
			System.out.println("Eight");
		else if (num == 9)
			System.out.println("Nine");
		else
			System.out.println("Out of range");
	}

	public static void GuessThePassword() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Password: ");
		String password = scanner.nextLine();
		
		if (password.equals("secret!")) {
			System.out.println("Welcome");
		} else
			System.out.println("Wrong Password!");
	}

	public static void AreaOfFigure () {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Figure Name: ");
		String figure = scanner.nextLine();
		double area = 0;
		
		if (figure.equals("square")) {
			System.out.print("Key in side (cm): ");
			double num = scanner.nextInt();
			
			area = num*num;
		}
		
		else if (figure.equals("rectangle")) {
			System.out.print("Key in width (cm): ");
			double width = scanner.nextInt();
			
			System.out.print("Key in height (cm): ");
			double height = scanner.nextInt();
			
			area = width*height;
		}
		
		else if (figure.equals("circle")) {
			System.out.print("Key in radius (cm): ");
			double num = scanner.nextInt();
			area = 2 * 3.142 * num;
		}
		
		else
			area = 0;
			System.out.printf ("Area: " + area);
		
		
	}
	
	public static void CoffeeShop() {
		Scanner scanner = new Scanner(System.in);
		
		String order = scanner.nextLine();
		String extra = scanner.nextLine();
		double price = 0;
		
		if (order.equals("coffee")) {
			price = 1.00;
		}
		
		else if (order.equals("tea")) {
			price = 0.60;
		}
		
		if (extra.equals("sugar")) {
			price += 0.40;
		}
		
		System.out.printf("Final price: $%.2f", price);
	}
	
	public static void IncrementDecrement() {
		int a = 1;
		System.out.println(--a);
		System.out.println(a);
		
		a = 1;
		System.out.println(a--);
		System.out.println(a);
	}
	
	public static void PrintNNumbers() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 1;
		
		System.out.print(1);
		
		for (int i=2; i <= n; ++i) {
			System.out.print("+" + i);
			
			sum += i;
		}
		
		System.out.println("=" + sum);
	}
	
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		double humidity = Double.parseDouble(sc.nextLine());
//		
//		CheckHumidity(humidity);

//		ValueComparison();
//		StringComparison();

//		FreezingWeather();
//		BlockOfCode();
//		OddEven();
//		SeriesOfCondition();
//		NumberToWords();
//		GuessThePassword();
//		AreaOfFigure();
//		CoffeeShop();
		IncrementDecrement();
	}

}
