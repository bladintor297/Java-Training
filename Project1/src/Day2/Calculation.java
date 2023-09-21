package Day2;

import java.util.Scanner;
import java.math.*;

public class Calculation {

	public static void Centuries() {

		System.out.print("Key in century: ");
		Scanner scanner = new Scanner(System.in);
		byte centuries = (byte) Integer.parseInt(scanner.nextLine());
		short years = (short) (centuries * 100);
		int days = years * 365;
		long hours = days * 24;

		System.out.printf("%d centuries = %d years = %d days = %d hours.", centuries, years, days, hours);
	}

	public static void Counter() {
		byte counter = 0;
		for (int i = 0; i < 130; i++) {
			counter++;
			System.out.println(i + "\t" + counter);
		}
	}

	public static void IntLiteral() {
		int hexa = 0xFFFFFFFF;
		long number = 1L;

		System.out.println("Hexa: " + hexa);
		System.out.println("Number: " + number);
	}

	public static void ConvertMeter() {
		System.out.println("Input >>");
		Scanner scanner = new Scanner(System.in);

		int meters = Integer.parseInt(scanner.nextLine());
		double kilometers = meters / 1000.0;
		System.out.printf("%.2f", kilometers);
	}

	public static void PIPrecision() {
		float floatPI = 3.141592653589793238f;
		double doublePI = 3.141592653589793238;

		System.out.println("Float PI is: " + floatPI);
		System.out.println("Double PI is: " + doublePI);
	}

	public static void PoundToDollar() {
		Scanner scanner = new Scanner(System.in);
		double num = Double.parseDouble(scanner.nextLine());
		double result = num * 1.31;
		System.out.printf("%.3f", result);
	}

	public static void ScientificNotation() {
		double d = 10000000000000000000000000000000000.0;
		System.out.println(d);
		double d2 = 20e-3;
		System.out.println(d2);
		double d3 = Double.MAX_VALUE;
		System.out.println(d3);

	}

	public static void Abnormalities() {
		double a = 1.0f;
		double b = 0.33f;
		double sum = 1.33d;

		System.out.printf("a+b=%f sum=%f equal=%b", a + b, sum, (a + b == sum));

		double num = 0;
		for (int i = 0; i < 10000; i++)
			num += 0.0001;
		System.out.println("\n" + num);
	}

	public static void BigDecimal() {
		BigDecimal sum = new BigDecimal(0);
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < n; i++) {
			BigDecimal number = new BigDecimal(scanner.nextLine());
			sum = sum.add(number);
		}

		System.out.println(sum);
	}

	public static void SpecialNumber() {
		int n = 200;
		System.out.println("Special Numbers Are: \n");
		for (int num = 1; num <= n; num++) {
			int sumOfDigits = 0;
			int digits = num;

			while (digits > 0) {
				sumOfDigits += digits % 10;
				digits = digits / 10;
			}

			if ((sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11)) {
				System.out.println(num + " -> true");
			} else
				System.out.println(num + " -> false");
		}
	}

	public static void main(String[] args) {
//		Centuries();
//		Counter();
//		IntLiteral();
//		ConvertMeter();

//		PIPrecision();
//		PoundToDollar();
//		ScientificNotation();
//		Abnormalities();
//		BigDecimal();
		SpecialNumber();
	}
}
