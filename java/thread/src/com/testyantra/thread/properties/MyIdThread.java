package com.testyantra.thread.properties;

public class MyIdThread extends Thread {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("myid thread "+mi.getId());
		
		
		System.out.println("priority "+Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(16);  //IllegalArgumentException
		
		//mi.setId(); there is no set Id method
		
		System.out.println("Main ended");
		
	}
}
