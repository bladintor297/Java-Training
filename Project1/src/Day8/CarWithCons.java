package Day8;

import java.util.Scanner;

public class CarWithCons {

	private String model;
	private String brand;
	private int horsePower;
	static Scanner scanner = new Scanner(System.in);

	public CarWithCons(String brand, String model) {
		this.brand = brand;
		this.model = model;
		horsePower = -1;
	}

	public CarWithCons(String brand, String model, int horsePower) {
		this(brand, model);
		this.horsePower = horsePower;
	}
	
	@Override
	public String toString() {
		if (this.horsePower == -1) 
			return String.format("%s : %s ", this.brand, this.model);
		
		return String.format("%s : %s : %d", this.brand, this.model, this.horsePower);
	}

	public static void main(String[] args) {
		String brand = scanner.nextLine();
		String model = scanner.nextLine();
		String horsePower = scanner.nextLine();
		CarWithCons c;
		if(horsePower.equals("")) {
			c = new CarWithCons(brand, model);
		}
		else {
			c = new CarWithCons(brand, model, Integer.parseInt(horsePower));
		}
		
		System.out.print(c);
			
	}

}
