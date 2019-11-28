package com.testyantra.thread.properties;

public class MyThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		String tname = Thread.currentThread().getName();
		System.out.println("Current thread "+tname);
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("My Thread name "+mname);
		
		Thread.currentThread().setName("Bala");
		
		t1.setName("Golu");
		System.out.println("MyThread name "+t1.getName());
		
		System.out.println(10/0);
		
		System.out.println("Main ended");
		
	}
	
}
