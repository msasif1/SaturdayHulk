package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int age = 60;
		
		if (age < 13){
		System.out.println("You are child.");
		}
		else if (age >= 13 && age < 18){
			System.out.println("You are teenager.");
		}
		else if (age >= 60){
			if (age >= 100) {
				System.out.println("You are a champion.");
			}
			else {
				System.out.println("You are Senior.");
			}
		}
		else {
			System.out.println("You are adult.");
		}
		
	}
	}

