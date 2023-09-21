package Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shuffle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String values = sc.nextLine();
		List<String> list_Strings = Arrays.stream(values.split(" ")).collect(Collectors.toList());
		List<Integer> nums = new ArrayList<>();

		System.out.print("\nString List: ");
		String inputLine = sc.nextLine();
		List<String> list = Arrays.stream(inputLine.split(" ")).collect(Collectors.toList());

		Collections.shuffle(list);

		System.out.println(list);

	}

}
