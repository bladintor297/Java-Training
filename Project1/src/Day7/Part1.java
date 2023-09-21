package Day7;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Part1 {

	public static Scanner scanner = new Scanner (System.in);
	
	public static void PrintListOnConsole() {
		List<String> list = new ArrayList<> (Arrays.asList(
				"one", "two", "three", "four", "five", "six"));
		
//		First Method using String join
		System.out.println("\n\nFirst Method: String.join()");
		System.out.println(String.join("\n", list));
		
//		Second Method is using loop
		System.out.println("\n\nSecond Method: For Loop");
		for (int i = 0; i < list.size(); ++i) {
			System.out.printf("arr[%d] = %s%n", i, list.get(i));
		}
		
	}

	static String joinElementByDelimiter(List<Double> items, String delimiter) {
		
		String output = " ";
		
		for (Double item : items) {
			output += (new DecimalFormat("0.#").format(item) + delimiter);
		}
		
		return output;
		
	}

	public static void SumAdjecent() {
		List <Double> num = Arrays.stream(scanner.nextLine().split(" ")).map(
				Double::parseDouble).collect(Collectors.toList());
		
		for (int i = 0; i < num.size() - 1; ++i) {
			
			if (num.get(i).equals(num.get(i+1))) {
				num.set(i, num.get(i) + num.get (i + 1));
				num.remove(i+1);
				i = -1;
			}
			
		}
		
		String output = joinElementByDelimiter(num, " ");
		System.out.println(output);
	}
	
	public static void GaussTrick() {
		List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
				.map(Integer::parseInt).collect(Collectors.toList());
		
		int size = numbers.size();
		
		for (int i=0; i<size/2; ++i) {
			numbers.set(i, numbers.get(i) + numbers.get(numbers.size()- 1));
			numbers.remove(numbers.size()-1);
			
		}
		
		System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
	}
	
	static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList){
		List<Integer> nums = new ArrayList<>();
		
		for (int i = shorterList.size(); i < longerList.size(); ++i) {
			nums.add(longerList.get(i));
		}
		return nums;
	}
	
	public static void MergingList() {
		
		List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
				.map(Integer::parseInt).collect(Collectors.toList());
		
		List<Integer> nums2 = Arrays.stream(scanner.nextLine().split(" "))
				.map(Integer::parseInt).collect(Collectors.toList());
		
		List <Integer> resultNums = new ArrayList<>();
		for (int i = 0; i < Math.min(nums1.size(), nums2.size()); ++i) {
			resultNums.add(nums1.get(i));
            resultNums.add(nums2.get(i));
		}
		
		if (nums1.size() > nums2.size()) {
			resultNums.addAll(getRemainingElements(nums1, nums2));
		}
		
		else if (nums2.size() > nums1.size()) {
			resultNums.addAll(getRemainingElements(nums2, nums1));
		}
		
		Collections.sort(resultNums); /* sort ascending */
		Collections.reverse(resultNums); /* sort descending */
		
		for (int i = 0; i < resultNums.size(); ++i)
			System.out.println("num["+i+"] = " + resultNums.get(i));
//		System.out.println(resultNums.toString().replaceAll("[\\[\\],]", ""));
	}
	
	public static void SortingLists() {
		List <String> names = new ArrayList<>(Arrays.asList(
				"Peter", "Michales", "George", "Victor", "John"));
		Collections.sort(names);
		System.out.println("---Natural Order---");
		System.out.println(String.join(", ", names));
		
		Collections.reverse(names);
		System.out.println("\n---Reverse Order---");
		System.out.println(String.join(", ", names));
	}
 	
	public static void main(String[] args) {
//		PrintListOnConsole();
//		SumAdjecent();
//		GaussTrick();
//		MergingList(); 
		SortingLists();
	}

}
