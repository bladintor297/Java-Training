package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Part2 {

	public static Scanner scanner = new Scanner(System.in);

	public static void DayOfWeek() {
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		System.out.print("Day: ");
		int day = scanner.nextInt();

		if (day >= 1 && day <= 7)
			System.out.println(days[day - 1]);
		else
			System.out.println("Invalid day !");
	}

	public static void ReadingArrayVal() {
		String values = scanner.nextLine();
		String[] items = values.split(" ");
		int[] arr = new int[items.length];

		for (int i = 0; i < items.length; ++i)
			arr[i] = Integer.parseInt(items[i]);

		for (int i = 0; i < arr.length; ++i)
			System.out.println("arr[" + i + "] = " + arr[i]);
	}

	public static void ReadArrayVal2() {
		String inputLine = scanner.nextLine();
		String[] items = inputLine.split(" ");
		int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray();

		for (int i = 0; i < arr.length; ++i)
			System.out.println("arr[" + i + "] = " + arr[i]);
	}

	public static void ReverseArray() {
		int n = Integer.parseInt(scanner.nextLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(scanner.nextLine());

		for (int i = n - 1; i >= 0; --i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void PrintArraysStringJoin() {
		String[] strings = { "one", "two" };
		String s = String.join(" ", strings);
		System.out.println(s);

//		int[] arr = {1,2,3};
//		String a = String.join(" ", arr);
//		System.out.println(a);

	}

	public static void ArrayForeach() {
		int[] numbers = { 1, 2, 3, 4, 5 };

		for (int number : numbers)
			System.out.print(number + " ");
	}

	public static void ListOverview() {
		List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));

		nums.remove(2);
		nums.remove(Integer.valueOf(40));
		nums.add(100);
		nums.add(0, -100);

		for (int i = 0; i < nums.size(); i++)
			System.out.println(nums.get(i) + " ");

	}

	public static void ListValuesFromSingleLine() {
		String values = scanner.nextLine();

		List<Integer> items = Arrays.stream(values.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
		
		for (int i = 0; i < items.size(); i++)
			System.out.println(items.get(i));
		
		

	}

	public static void main(String[] args) {
//		DayOfWeek();
//		ReadingArrayVal();
//		ReadArrayVal2();
//		ReverseArray();
//		PrintArraysStringJoin();
//		ArrayForeach();
//		ListOverview();
		ListValuesFromSingleLine();
	}

}
