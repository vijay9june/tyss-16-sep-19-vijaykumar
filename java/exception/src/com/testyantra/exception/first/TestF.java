package com.testyantra.exception.first;

public class TestF {

	public static void main(String[] args) {
		System.out.println("Main started");

		String s = "Hello";
		int[] a = {10,20,30};
		int b = 10;
		try {

			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);

		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("exception occured");
		
		}

		System.out.println("Main ended");
	}

}
