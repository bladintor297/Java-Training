package Day8;

import java.util.Scanner;

public class CarTest {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter brand: ");
		String brand = sc.nextLine();
		
		System.out.print("Enter model: ");
		String model = sc.nextLine();
		
		System.out.print("Enter horsepower: ");
		int horsePower = sc.nextInt();
		
		Car c1 = new Car(brand, model, horsePower);
		
		System.out.print(c1);
		
	}

}
