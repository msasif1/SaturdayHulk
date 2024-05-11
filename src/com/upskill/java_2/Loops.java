package com.upskill.java_2;

public class Loops {

	public static void main(String[] args) {
//		practiceForLoop();
//		practiceWhileLoop();
//		practiceDoWhileLoop();
//		practiceInfiniteLoop();
		practiceNestedForLoop();
}
	
//	public static void practiceForLoop() {
//		
//		int i = 1;
//		for (i=1; i<=10; i++) {
//			System.out.println("For Loops Number = " + i);
//		}
//	}
//	
//	
//	public static void practiceWhileLoop() {
//		int i = 1;
//		while (i <= 10) {
//		System.out.println("While Loop number: " + i);
//		i++;
//		}
//	}
//	
//	
//	public static void practiceDoWhileLoop() {
//		int i = 1;
//		do {
//			System.out.println("Do While Loops number: " + i);
//			i++;
//		} while (i <= 10);
//	}
//	
//	
//	public static void practiceInfiniteLoop() {
//		int i;
//		for (i=1; ; i++) {
//			System.out.println("Infinite Loops number: " + i);
//		}
//	}
	
	public static void practiceNestedForLoop() {
		int i, j;
		for (i=1; i<=10; i++) {
			for (j=1; j<=10; j++) {
				int multiplierTable = i*j;
			
			System.out.print(multiplierTable + " ");
		}
			System.out.println(" ");
	}
	
	}
	
}