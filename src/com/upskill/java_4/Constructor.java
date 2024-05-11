package com.upskill.java_4;

public class Constructor {
	
/* Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
*/
	
	String studentName;
	int studentAge; 
	
	
	public Constructor(String name) {
		studentName = name;
	}
	
	public Constructor(int age) {
		studentAge = age;
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor("Sam");
		System.out.println(obj.studentName);
		
		Constructor obj1 = new Constructor(22);
		System.out.println(obj1.studentAge);
	}

}
