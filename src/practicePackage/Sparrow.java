package practicePackage;

public class Sparrow extends Animals implements Flyable {

	public Sparrow(String name, int weight, int height, String color, String personality) {
		super(name, weight, height, color, personality);
		
	}

	public void fly() {
		System.out.println("Sparrow Flying...");
		
	}
	

}
