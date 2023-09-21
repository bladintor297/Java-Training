package Day4;

import java.util.Scanner;

public class Part1 {

	public static Scanner scanner = new Scanner(System.in);

	public static void NumbersEndingWith() {

		int n = scanner.nextInt();

		for (int i = 1; i <= n; ++i)

			if (i % 10 == 7)
				System.out.println(i);

	};

	public static void ExamCountdown() {
		int days = scanner.nextInt();
		for (int i = days; i >= 1; --i) {
			System.out.printf("%d days before the exam%n", i);
		}
		System.out.println("The exam has come");
	}

	public static void IteratingOverChars() {
		for (char ch = 'a'; ch <= 'd'; ++ch) {
			System.out.print(ch + " ");
		}

		char ch = (char) 65;
		System.out.println(ch);
	}

	public static void LatinLetters() {
		char startLetter = scanner.nextLine().charAt(0);
		char endLetter = scanner.nextLine().charAt(0);

		for (char i = startLetter; i <= endLetter; ++i) {
			System.out.print(i + " ");
		}
	}

	public static void SumNumbersUntilStop() {
		long sum = 0;

		for (;;) {
			int num = scanner.nextInt();
			if (num == 0)
				break;

			sum += num;
			System.out.println("Sum = " + sum);
		}
		System.out.println("Good bye");

	}

	public static void MultiplicationTable() {

		int n = scanner.nextInt();

		for (int i = 1; i <= 10; ++i) {
			int result = n * i;
			System.out.printf("%d x %d = %d%n", n, i, result);

		}

	}

	public static void BiggestNumber() {
		int n = scanner.nextInt();
		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;

		for (int i = 1; i <= n; ++i) {
			int number = scanner.nextInt();

			if (number > maxNumber)
				maxNumber = number;
			if (number < maxNumber)
				minNumber = number;
		}
		System.out.println(maxNumber);
	}

	public static void VowelSum() {
		int n = Integer.parseInt(scanner.nextLine());
		int vowelSum = 0;

		for (int i = 0; i < n; ++i) {
			char ch = scanner.nextLine().charAt(0);

			switch (ch) {
			case 'a':
				vowelSum += 1;
				break;
			case 'e':
				vowelSum += 2;
				break;
			case 'i':
				vowelSum += 3;
				break;
			case 'o':
				vowelSum += 4;
				break;
			case 'u':
				vowelSum += 5;
				break;
			}
		}

		System.out.println(vowelSum);
	}

	public static void Division234() {
		int n = scanner.nextInt();

		double c2 = 0.0, c3 = 0.0, c4 = 0.0;

		for (int i = 0; i < n; ++i) {
			int num = scanner.nextInt();

			if (num % 2 == 0)
				c2++;
			if (num % 3 == 0)
				c3++;
			if (num % 4 == 0)
				c4++;
		}

		System.out.printf("%.2f%n", (c2 / n) * 100);
		System.out.printf("%.2f%n", (c3 / n) * 100);
		System.out.printf("%.2f%n", (c4 / n) * 100);

	}

	public static void RollerCoaster() {

		System.out.print("Seats available.:");
		int places = scanner.nextInt();
		System.out.print("Min Age:");
		int minAge = scanner.nextInt();
		System.out.print("Que Size:");
		int queSize = scanner.nextInt();

		int validPeopleCount = 0;

		for (int i = 0; i < queSize; ++i) {

			System.out.print("Age person " + (i + 1) + " ");
			int personAge = scanner.nextInt();

			if (personAge >= minAge) {

				if (places > validPeopleCount) {
					++validPeopleCount;
				}
				if (places == validPeopleCount) {
					System.out.println("The rollercoaster departures... ");
				} else
					System.out.println("Waiting...");
			}

			else
				System.out.println("Underage !!");
		}
	}

	public static void Marketplace() {

		String product = scanner.nextLine();
		String day = scanner.nextLine();
		if (product.equals("Banana")) {
			if (day.equals("Weekday")) {
				System.out.println("2.50");
			}

			else
				System.out.println("2.70");
		}

		else if (product.equals("Apple")) {
			if (day.equals("Weekday")) {
				System.out.println("1.30");
			}

			else
				System.out.println("1.60");
		}

		else if (product.equals("Kiwi")) {
			if (day.equals("Weekday")) {
				System.out.println("2.50");
			}

			else
				System.out.println("2.50");
		}

		else
			System.out.println("Invalid input");
	}
	
	public static void GreatestNumnerOfThree() {
		
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();
		
		if (first > second)
			if (first > third)
				System.out.println(first);
			else 
				System.out.println(third);
		else
			if (second > third)
				System.out.println(second);
			else 
				System.out.println(third);
	}

	public static void BonusPoint() {
		int points = scanner.nextInt();
		
		if (points >= 0 && points <= 3)
			points +=5;
		
		else if (points >= 4 && points <= 6)
			points +=15;
		
		else if (points >= 7 && points <= 9)
			points +=20;
		
		System.out.println (points);
	}
	
	public static void FoodOrDrink () {
		System.out.print("Food or Drink: ");
		String s = scanner.nextLine();
		
		if (s.equals("curry") || s.equals("noodles") || s.equals("sushi") || s.equals("spaghetti"))
			System.out.println("food");
		
		else if (s.equals("tea") || s.equals("water") || s.equals("coffee"))
			System.out.println("drink");
		
		else
			System.out.println("unknown");
	}
	
	public static void LogicalNOT() {
		
		int num = scanner.nextInt();
		boolean isValid = (num >= 100 && num <= 200) || num == 0;
		
		if (!isValid) {
			System.out.println("Invalid");
		}
		else System.out.println("Valid");
	}
	
	public static void MultipleLables() {
		String animal = scanner.nextLine();
		
		switch (animal) {
		case "dog":
		case "cat":
			System.out.println("mammal");
			break;
			
		default:
			System.out.println("unknown");
			break;
		}
	}
	
	public static void FruitOrVegetable() {

		String product = "";
		switch(product) {
			case "cucumber":
			case "pepper":
			case "carrot":
				System.out.println("vegetable");
				break;
		}
		
	}
	
	public static void VowelOrConsonant() {
		
		char letter = scanner.nextLine().charAt(0);
		
		System.out.println("If-Else\n------------");
		if ((letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U') ||
		(letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u'))
			System.out.println ("Vowel");
		
		else
			System.out.print("Consonant");
		
		System.out.println("\n\n\n\nSwitch Case\n------------");
		switch (letter) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
				break;
				
			default:
				System.out.println("Consonant");
				break;
				
		}
	}
	
	public static void ProductOfThreeNumbers() {
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		if (n1 == 0 || n2 == 0 || n3 == 0)
			System.out.println("Zero");
		
		else {
			int count = 0;
			if (n1 < 0)
				++count;
			if (n2 < 0)
				++count;
			if (n3 < 0)
				++count;
			
			if (count %2 == 0)
				System.out.println("positive");
			
			else
				System.out.println("Negative");
		}
			
	}
	
	public static void Cinema() {
		String type = scanner.nextLine();
		
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		
		int seats = rows * cols;
		
		switch (type) {
			case "Premier":
				System.out.printf("%.2f\n", seats*12);
				break;
			
			case "Normal":
				System.out.printf("%.2f\n", seats*7.5);
				break;
			
			
			case "Discount":
				System.out.printf("%.2f\n", seats*5);
				break;
		}
		
		
	}
	
	public static void NumberOperations() {
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		String operation = scanner.next();
		
		double result = 0;
		
		switch (operation) {
			case "+":
				result = num1 + num2;
				break;
				
			case "-":
				result = num1 - num2;
				break;
				
			case "*":
				result = num1 * num2;
				break;
				
			case "/":
				result = num1 / num2;
				break;
				
			case "%":
				result = num1 % num2;
				break;
			
		}
		System.out.printf("%.0f %s %.0f = %.2f", num1, operation, num2, result);
		
	}
	
	public static void ATM() {
		
		
		System.out.print("Balance: ");
		double balance = scanner.nextDouble();
		System.out.print("Wtihdraw Amount: ");
		double withdraw = scanner.nextDouble();
		System.out.print("Daily Limit: ");
		double limit = scanner.nextDouble();
		
		if (balance >= withdraw && withdraw <= limit)
			System.out.println("\nThe withdraw was successful.");
		
		else if (withdraw > limit)
			System.out.println("\nThe limit was exceeded");
		
		else
			System.out.println("\nInsufficient availability");
		
	}
	
	public static void main(String[] args) {
//		NumbersEndingWith();
//		ExamCountdown();
//		IteratingOverChars();
//		LatinLetters();
//		SumNumbersUntilStop();
//		MultiplicationTable();
//		BiggestNumber();
//		VowelSum();

//		Division234();
//		RollerCoaster();
//		Marketplace();
//		GreatestNumnerOfThree();
//		BonusPoint();
//		FoodOrDrink();
//		LogicalNOT();
//		MultipleLables();
//		VowelOrConsonant();
//		ProductOfThreeNumbers();
//		Cinema();
//		NumberOperations();
		ATM();
	}

}
