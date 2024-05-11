package com.upskill.java_6;

public class MultithreadingRunnable implements Runnable {

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		try {
			System.out.println("Thread # " + Thread.currentThread().getId());
			
		} catch (Exception e) {
		System.out.println("Exception is caught.");
	}
	}
}
