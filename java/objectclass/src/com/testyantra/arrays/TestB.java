package com.testyantra.arrays;

public class TestB {

	public static void main(String[] args) {
		
		int[] nums = { 10,20,30,40 };
//	System.out.println(nums[10]); arrayIndexOutOfBoundsException
	receive(nums);
	int[] values = getArray();
	for(int val : values) {
		System.out.println(val);
	}
	
	}
	static void receive(int[] numbers) {
		
		for(int num : numbers) {
			System.out.println(num);
		}
	
	}
	static int[] getArray() {
		int[] values = { 20,30,40,50 };
		return values;
	}
	
	static void receive(String[] Strings) {
		
		for(String Str : Strings) {
			System.out.println(Str);
		}
		
		static String[] getArray() {
			String[] elements = {"ram", "shyam", "abhi"};
			return elements;
		}
	}
	
}
