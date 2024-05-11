package practicePackage;

public class Zoo {

	public static void main(String[] args) {
		
		// 
		Animals an1 = new Animals("Lion", 250, 6, "Tawny yellow", "aggressive" );
		an1.terrestrialAnimals();
		
		System.out.println();
		
		MarineAnimals mA1 = new MarineAnimals("Dolphin", 250, 4, "Grey", "Friendly" );
		mA1.Fish();
		
		System.out.println();
		
		Chicken ch1 = new Chicken("Murgii", 3, 1, "White", "Confused");
		ch1.terrestrialAnimals();
		ch1.ch1();
		

	}

}
