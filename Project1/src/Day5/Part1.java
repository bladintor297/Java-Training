package Day5;
//package p.util;
import java.util.Scanner;


public class Part1 {

	public static Scanner scanner = new Scanner(System.in);

	public static void WhileLoop() {
		int i = 0;

		while (i <= 5) {
			System.out.println(i);
			++i;
		}
	}

	public static void NumberInRange() {
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		int i = num;
		while (i >= 0) {

			if ((i > 0) && (i <= 100)) {
				System.out.println(num + " is valid");
				break;
			}

			else {
				System.out.println("\n" + num + " is invalid");
				System.out.print("Enter a new number: ");
				num = scanner.nextInt();
			}

		}

	}

	public static void NumberProcessor() {
		int number = Integer.parseInt(scanner.nextLine());
		String command = scanner.nextLine();

		while (!command.equals("End")) {
			switch (command) {
			case "Inc":
				number++;
				break;
			case "Dec":
				number--;
				break;
			}

			command = scanner.nextLine();
		}
		System.out.println(number);
	}

	public static void SumDigits() {

		int n = scanner.nextInt();
		int sum = 0;

		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		System.out.println(sum);
	}

	public static void Sequence2k1() {
		int n = scanner.nextInt();
		int k = 1;

		while (k <= n) {
			System.out.println(k);

			k = k * 2 + 1;
		}
	}

	public static void SpecialBonus() {
		System.out.print("Number : ");
		int stopNum = scanner.nextInt();
		int previousNum = stopNum;
		while (true) {
			System.out.print("Number : ");
			int num = scanner.nextInt();
			if (num == stopNum) {
				break;
			}
			previousNum = num;
		}

		System.out.print(previousNum * 1.2);
	}

	public static void NumbersNtoOne() {
		int n = scanner.nextInt();

		for (int i = n; i >= 1; --i) {
			if (i < n)
				System.out.print(", ");
			System.out.print(i);
		}
		System.out.println();
	}

	public static void EvenPowerOf2() {
		int n = scanner.nextInt();
		int num = 1;

		for (int i = 0; i <= n; i += 2) {
			if (i > 0)
				System.out.print(", ");
			System.out.print(num);

			num = num * 2 * 2;
		}
		System.out.println();
	}

	public static void NestedLoops() {
		int n = 15;

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void TriangleOfStars() {
		int n = 15;

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				if (col == row)
					System.out.print("*");

				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void TriangleOfStarsWhile() {
		int height = 15;
		int row = 1;

		while (row <= height) {
			int col = 0;

			while (col++ < row)
				System.out.print("*");
			System.out.println();

			row++;

		}

	}

	public static void ChrismasTree() {
		boolean flag = true;
		if (flag = false) {
			System.out.println("1");
		} else if (flag) {
			System.out.println("2");
		} else if (!flag) {
			System.out.println("3");
		} else
			System.out.println("4");

	}

	public static void main(String[] args) {
//		WhileLoop();
//		NumberInRange();
//		NumberProcessor();
//		SumDigits();
//		SpecialBonus();
//		Sequence2k1();
//		NumbersNtoOne();
//		EvenPowerOf2();
//		NestedLoops();
//		TriangleOfStars();
//		TriangleOfStarsWhile();
		ChrismasTree();
//		s;
	}

}
