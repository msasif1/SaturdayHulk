package practicePackage;

public class Animals {
	
	String name;
	int weight;
	int length;
	String color;
	String personality;
	
	public Animals(String name, int weight, int height, String color, String personality) {
		super();
		this.name = name;
		this.weight = weight;
		this.length = height;
		this.color = color;
		this.personality = personality;
	}
	
	public void terrestrialAnimals() {
		System.out.println("Animal name: " + name);
		System.out.println("Weight: " + weight + " lbs.");
		System.out.println("Length: " + length + " ft.");
		System.out.println("Color: " + color);
		System.out.println(name + " is a " + personality + " animal.");
	}
	

}
