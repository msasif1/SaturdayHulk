package practicePackage;

public class MarineAnimals extends Animals {
	
	public MarineAnimals(String name, int weight, int length, String color, String personality) {
		super(name, weight, length, color, personality);
		
	}

	public void Fish() {
		System.out.println("Fish name: " + name);
		System.out.println("Weight: " + weight + " lbs.");
		System.out.println("Length: " + length + " ft.");
		System.out.println("Color: " + color);
		System.out.println(name + " is a " + personality + " fish.");
		
	}
	

}
