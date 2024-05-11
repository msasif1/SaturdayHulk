package com.upskill.java_6;

public class MultithreadingThread extends Thread{
	
	@SuppressWarnings("deprecation")
	public void run(){
		try {
			System.out.println("Thread # " + Thread.currentThread().getId());
			
		} catch (Exception e) {
		System.out.println("Exception is caught.");
	}
}
}
