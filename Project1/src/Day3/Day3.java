package Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Day3 {
	public static void CharacterCodes() {
		char ch = 'a';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);

		ch = 'b';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);

		ch = 'A';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);

		ch = 'щ';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
	}

	public static void ReversedChar() {
		Scanner scanner = new Scanner(System.in);

		char firstChar = scanner.nextLine().charAt(0);
		char secondChar = scanner.nextLine().charAt(0);
		char thirdChar = scanner.nextLine().charAt(0);

		int[] arr = { (int) firstChar, (int) secondChar, (int) thirdChar };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("The code of '%c' is: %d%n", (char) arr[i], arr[i]);
		}

	}

	public static void CharacterLiterals() {
		char symbol = '\u9999';

		System.out.printf("%c", '\u9999');
		System.out.printf("%c", '\u9921');
		System.out.printf("%c", '\u9912');
		System.out.printf("%c ", '\u8829');
		System.out.printf("%c", '\u9899');
	}

	public static void SayingHello() {
		String firstName = "Ivan";
		String lastName = "Ivanov";

		String fullName = String.format("%s %s", firstName, lastName);

		int age = 21;

		System.out.printf("Hello I am %s, " + age + " years old.", fullName);
	}

	public static void ConcatNames() {
		Scanner sc = new Scanner(System.in);

		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		String delimiter = sc.nextLine();

		String result = firstName + delimiter + lastName;

		System.out.println(result);
	}

	public static void ModOperator() {
		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());
		num = (num % 100) / 10;

		System.out.println("Second last digit is " + num);
	}

	public static void OddEven() {

		Scanner sc = new Scanner(System.in);

		int num = Integer.parseInt(sc.nextLine());
		
		if(num%2 == 0)
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");
		
		if (num%27 == 0)
			System.out.println(num + " is divisible by 27");
		else 
			System.out.println(num + " is NOT divisible by 27");
	}

	public static void main(String[] args) {
//		CharacterCodes();
//		ReversedChar();
//		CharacterLiterals();

//		SayingHello();
//		ModOperator();
		OddEven();
	}
}
