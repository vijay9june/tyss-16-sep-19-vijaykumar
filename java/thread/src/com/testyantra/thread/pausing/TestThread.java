package com.testyantra.thread.pausing;

public class TestThread {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		MyThread t = new MyThread();
		t.start();
		
		for(int i = 0; i<10; i++) {
			System.out.println("main thread");
		}
			
		System.out.println("Main ended");
		
	}
}
