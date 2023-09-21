package Day7;

import java.util.Scanner;

public class Part2 {

	public static Scanner scanner = new Scanner(System.in);

	public static void SignOfIntegerNumber(int number) {
		if (number > 0)
			System.out.printf("The number %d is positive.", number);

		else if (number < 0)
			System.out.printf("The number %d is negative.", number);

		else
			System.out.printf("The number %d is zero.", number);
	}

	public static void PrintLine(int start, int end) {
		for (int i = start; i <= end; ++i) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void PrintTriangle(int n) {

		for (int line = 1; line <= n; ++line)
			PrintLine(1, line);

		for (int line = n - 1; line >= 1; --line)
			PrintLine(1, line);

	}

	public static void getWidthHeight() {
		System.out.print("Enter width (cm): ");
		double width = Double.parseDouble(scanner.nextLine());
		System.out.print("Enter height (cm): ");
		double height = Double.parseDouble(scanner.nextLine());
		double area = calcRectangleArea(width, height);
		System.out.printf("Area is %.0f cm^2%n", area);
	}

	public static double calcRectangleArea(double width, double height) {

		return width * height;
	}

	public static double mathPower(double number, int power) {
		double result = 1;

		for (int i = 0; i < power; ++i)
			result *= number;
		return result;
	}

	public static void getMathPower() {
		System.out.print("Enter number: ");
		double n = scanner.nextDouble();

		System.out.print("Enter power: ");
		int p = scanner.nextInt();

		System.out.println(mathPower(n, p));
	}

	public static void increment(int num, int value) {
		num += value;
	}

	public static void getIncrement() {
		int num = 5;
		increment(num, 15);
		System.out.println(num);
	}

	public static void getMax(int val1, int val2) {
		if (val1 > val2)
			System.out.println(val1);

		else
			System.out.println(val2);
	}
	
	public static void getMax(char val1, char val2) {
		if (val1 > val2)
			System.out.println(val1);

		else
			System.out.println(val2);
	}
	
	public static void getMax(String val1, String val2) {
		if (val1.compareTo(val2)>0)
			System.out.println(val1);

		else
			System.out.println(val2);
	}
	
	public static void mainGetMax() {
		System.out.println("Choose one option\n1. Integer\n2. Char\n3. String\nYour choice: ");
		int opt = scanner.nextInt();
		
		if (opt == 1) {
			System.out.println("Int val1: ");
			int val1 = scanner.nextInt();
			System.out.println("Int val2: ");
			int val2 = scanner.nextInt();
			getMax(val1, val2);
		}
		
		else if (opt == 2) {
			System.out.println("Char val1: ");
			char val1 = scanner.next().charAt(0);
			System.out.println("Char val2: ");
			char val2 = scanner.next().charAt(0);
			getMax(val1, val2);
		}
		
		else {
			System.out.println("String val1: ");
			String val1 = scanner.nextLine();
			System.out.println("Char val2: ");
			String val2 = scanner.nextLine();
			getMax(val1, val2);
		}
	
		
			
	}
	
	

	public static void main(String[] args) {
		int i=0, j=0;
        X1: for(i = 0; i < 3; i++)
        {
            X2: for(j = 3; j > 0; j--)
            {
                if(i < j) continue X1;
                else break X2;
            }
        }
        System.out.println(i+" "+j);
    }

}
