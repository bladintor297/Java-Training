package Day8;

import java.util.Scanner;

public class Part1 {

	public static Scanner scanner = new Scanner(System.in);

	public static void getMultipleOfEvenAndOdds() {
		System.out.print("Enter number: ");
		int num = scanner.nextInt();

		if (num < 0)
			num = Math.abs(num);

		int even = getSumOfEvenDigits(num);
		int odd = getSumOfOddDigits(num);

		System.out.println("Product Number: " + (even * odd));

	}

	public static int getSumOfEvenDigits(int num) {
		int sum = 0;

		while (num > 0) {
			if ((num % 10) % 2 == 0)
				sum = sum + num % 10;
			num = num / 10;
		}

		return sum;
	}

	public static int getSumOfOddDigits(int num) {
		int sum = 0;

		while (num > 0) {
			if ((num % 10) % 2 != 0)
				sum = sum + num % 10;
			num = num / 10;
		}

		return sum;
	}

	public static void main(String[] args) {
//		getMultipleOfEvenAndOdds();
	}
}
