package com.testyantra.exception.first;

public class TestA {
	public static void main(String[] args) {
		
	System.out.println("Main started");
	
	int[] a = {10,20,30};
	
	System.out.println(a[1]);
	
	try {
		System.out.println(a[2]);
	}
	catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println("Index out of range");
	}
	System.out.println("Main ended");
	}
	
}
