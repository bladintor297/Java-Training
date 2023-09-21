package Day9;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Part1 {

	public static Scanner sc = new Scanner(System.in);

	public static void SwapList() {
		LinkedList<String> l_list = new LinkedList<String>();

		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("Orange");

		System.out.println("The original linked list: " + l_list);
		Collections.swap(l_list, 0, 2);
		System.out.println("The new linked list: " + l_list);
	}

	public static void joinList() {

		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("c1");
		System.out.println("List of first linked list: " + c1);

		LinkedList<String> c2 = new LinkedList<String>();
		c2.add("c2");
		System.out.println("List of first linked list: " + c2);

		LinkedList<String> a = new LinkedList<String>();

		a.addAll(0, c1);
		a.addAll(c2);

		// Print List
		System.out.println("New linked list (list): " + a);

		// Print Element
		System.out.print("New linked list (string): ");
		for (String var : a) {
			System.out.print(var + " ");
		}
	}

	public static void IteratingMap() {
		Map<String, Double> fruits = new LinkedHashMap<>();

		fruits.put("banana", 2.20);
		fruits.put("kiwi", 4.50);

		for (Map.Entry<String, Double> entry : fruits.entrySet()) {
			System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
		}
	}

	public static void countRealNumbers() {

		double[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

		Map<Double, Integer> counts = new TreeMap<>();

		for (double num : nums) {

			if (!counts.containsKey(num))
				counts.put(num, 0);
			counts.put(num, counts.get(num) + 1);
		}

		for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
			DecimalFormat df = new DecimalFormat("#.#####");
			System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
		}
	}

	public static void wordsSynonyms() {

		System.out.print("How many pairs: ");
		int n = sc.nextInt();

		Map<String, String> counts = new TreeMap<>();

//		while(!sc.nextLine().equals("end")) {

		for (int i = 0; i < n; ++i) {
			System.out.print("Enter word: ");
			String word = sc.next();

			System.out.print("Enter synonym: ");
			String synonym = sc.next();

			if (!counts.containsKey(word)) {
				counts.put(word, synonym + " ");
				continue;
			}
			counts.put(word, counts.get(word) + ", " + synonym);
		}
//		}

		for (Map.Entry<String, String> entry : counts.entrySet()) {
			System.out.printf("%s -> %s%n", (entry.getKey()), entry.getValue());
		}
	}

	public static int ProcessingArraysAPI() {
		int num = 0;
//		int num = Arrays.stream(new int[] {15,25,35}).min().getAsInt();
//		int num = Arrays.stream(new int[] {15,25,35}).min().orElse(2);
//		int num = Arrays.stream(new int[] {}).min().orElse(2);
//		int num = Arrays.stream(new int[] {15,25,35}).min().getAsInt();
//		int num = Arrays.stream(new int[] {15,25,35}).sum();

//		ArrayList<Integer> nums = new ArrayList<>() {{
//			add(15);
//			add(25);
//			add(35);
//		}};

//		//Getting Min Val		
//		//num = nums.stream().mapToInt(Integer::intValue).min().getAsInt();
//		//num = nums.stream().min(Integer::compareTo).get();
//		
//		//Getting Max Val		
//		//num = nums.stream().mapToInt(Integer::intValue).max().getAsInt();
//		//num = nums.stream().max(Integer::compareTo).get();
//		
//		//Getting Sum Val
//		num = nums.stream().mapToInt(Integer::intValue).sum();

		return num;
	}

	public static void manipulatingCollections() {

		System.out.println("-- Print nums to array --");
		System.out.print("Input: ");
		int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

		for (int i = 0; i < nums.length; ++i) {
			System.out.println("arr[" + i + "] -> " + nums[i]);
		}

		System.out.println("\n-- Concantenate Array of Strings --");
		String[] words = { "abc", "def", "geh", "yyy" };

		words = Arrays.stream(words).map(w -> w + "yyyy").toArray(String[]::new);

		for (int i = 0; i < words.length; ++i) {
			System.out.println("arr[" + i + "] -> " + words[i]);
		}

	}

	public static void wordFilter() {
		String[] words = Arrays.stream(sc.nextLine().split(" ")).filter(w -> w.length() % 2 == 0)
				.toArray(String[]::new);

		for (String word : words) {
			System.out.println(word);
		}
	}

	public static void largest3Numbers() {
		List<Integer> nums = Arrays.stream(sc.nextLine().split(" ")).map(e -> Integer.parseInt(e))
				.sorted((n1, n2) -> n2.compareTo(n1)) // default is ascending
				.limit(3).collect(Collectors.toList());

		for (int num : nums)
			System.out.println(num + " ");
	}

	public static void randomizeWords() {

		int count = 0;
		System.out.print("--- Press Enter to continue the function ---");
		while (!sc.nextLine().equals("0")) {

			String[] words = sc.nextLine().split(" ");
			List<String> wordList = Arrays.asList(words);

			Random rnd = new Random();

			for (int i = 0; i < wordList.size(); i++) {
				int j = rnd.nextInt(wordList.size());
				Collections.swap(wordList, i, j);
			}

			System.out.print("#" + ++count + " : ");
			for (String word : wordList) {
				System.out.print(word + " ");
			}

			System.out.println();
			System.out.print("\nPress Enter to continue the function---");
		}
	}

	public static void bigFactorial() {
		int n = Integer.parseInt(sc.nextLine());
		BigInteger f = new BigInteger(String.valueOf(1));

		for (int i = 1; i <= n; ++i) {
			f = f.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
		}
		System.out.print(f);
	}

	public static void main(String[] args) {
//		SwapList();
//		joinList();
//		IteratingMap();
//		countRealNumbers();
//		wordsSynonyms();
//		System.out.print(ProcessingArraysAPI());
//		manipulatingCollections();
//		wordFilter();
//		largest3Numbers();
//		randomizeWords();
		bigFactorial();
	}

}
