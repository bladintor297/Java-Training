package Day6;

import java.util.Scanner;

public class Part1 {

	public static Scanner scanner = new Scanner(System.in);

	public static void BuildingFloors() {

		int floors = scanner.nextInt();
		int rooms = scanner.nextInt();

		for (int f = floors; f >= 1; f--) {
			for (int r = 0; r < rooms; r++) {
				if (f == floors)
					System.out.print("L" + f + r);

				else if (f % 2 == 0)
					System.out.print("O" + f + r);

				else
					System.out.print("A" + f + r);
				
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}
	
	public static void TravelSavings() {
		
		System.out.print("Enter a destination: ");
		String destination;
		
		while (!(destination = scanner.nextLine()).equals("end")) {
			
			System.out.print("\nNeed sum: ");
			double neededSum = scanner.nextDouble();
			double collectedSum = 0;
			
			while(collectedSum < neededSum) {
				System.out.print("Collected Sum: ");
				collectedSum += scanner.nextDouble();
			}
			
			System.out.println("Going to " + destination);
		}
		
	}
	
	public static void LettersCombination() {
		
		System.out.print("Start value: ");
		char start = scanner.nextLine().charAt(0);
		System.out.print("End value: ");
		char end = scanner.nextLine().charAt(0);
		System.out.print("Exclude value: ");
		char exc = scanner.nextLine().charAt(0);
		
		int counter = 0;
		
		System.out.println();
		for (char l1 = start; l1 <= end; l1++) 
			for (char l2 = start; l2 <= end; l2++) 
				for (char l3 = start; l3 <= end; l3++)
					if ((l1 != exc )&& (l2 != exc ) && (l3 != exc)) {
						System.out.printf("%c%c%c ",l1,l2,l3);
						++counter;
					}
		System.out.println("\nCounter value: " + counter);
			
		
	
	}
	
	public static void main (String[]args) {
//		BuildingFloors();
//		TravelSavings();
		LettersCombination();
	}
} 
