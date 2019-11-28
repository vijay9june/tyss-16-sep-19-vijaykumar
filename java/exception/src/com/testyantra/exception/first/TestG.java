package com.testyantra.exception.first;

public class TestG {
	public static void main(String[] args) {

		System.out.println("Main started");

		Paytm p = new Paytm();

		try {

			p.book();

		}catch(ArithmeticException ae) {

			System.out.println("Eception caught in main");

		}finally {

			System.out.println("executing finally block");

		}

		System.out.println("Main ended");

	}
}
