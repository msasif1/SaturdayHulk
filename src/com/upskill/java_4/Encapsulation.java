package com.upskill.java_4;

public class Encapsulation {

	// Encapsulation used to hide the data using setter and getter method. (PHI = Personal Health Information) (PPI - Personal Protected Information)
	
	private String name = "UpSkill";
	private int ssn = 1234;
	private String username = "asifms";
	
	// Setter Method - name                     // Set the data, Write
	public void setName(String value) {
		name = value;
	}
	    
	// Getter Method - Name   					// Get the data, Read
	public String getName() {
		return name;
	}
	
	// Setter Method = SSN                     // Set the data, Write
	public void setSSN(int value) {
		ssn = value;
	}
	
	// Getter Method - username   					// Get the data, Read
	public String getUserName() {
		return username;
		}
		
		
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
		obj.setName("Sohaib Asif");         // Here we set/update the Name
			System.out.println(obj.name);   // Here we get the Name.
			
			
		System.out.println(obj.username);  // Here we get the user name.
		
			
		obj.setSSN(9876);                  // Here we set/update the SSN.
		
			
		
		}
		
}
