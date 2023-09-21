package Day8;

public class Car {
	private String brand;
	private String model;
	private int horsePower;
	
	//Constructors
	
	Car (String b, String m, int hp){
		this.brand = b;
		this.model = m;
		this.horsePower = hp;
	}
	
	// BrandMutators
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return String.format("%s : %s : %d", this.brand, this.model, this.horsePower);
	}
	
	// Model Mutators
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	//HorsePower Mutators
	public int getHorsePower() {
		return this.horsePower;
	}
	
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
	
}
