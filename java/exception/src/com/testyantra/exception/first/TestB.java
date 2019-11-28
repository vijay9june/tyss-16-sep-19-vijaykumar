package com.testyantra.exception.first;

public class TestB {

	public static void main(String[] args) {

		System.out.println("Main started");

		int a = 10;
		int b = 0;
		try {
			
			b = 10/2;
			System.out.println(b);
			System.out.println("Hello");
			System.out.println("Happy deepawali");

		}catch(ArithmeticException ae) {
			System.out.println("number is diveded by zero");
		}

		System.out.println("Main ended");

	}

}

