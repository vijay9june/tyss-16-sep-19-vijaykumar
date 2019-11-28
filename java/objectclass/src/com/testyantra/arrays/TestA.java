package com.testyantra.arrays;

public class TestA {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("================================");
		
		for(int num : nums) {
			System.out.println(num);			
		}
		System.out.println("===================");
		
		char[] ch = {'a','b','c','d'};
		for(int i = 0;i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("=========================");
		for(int c : ch) {
			System.out.println(c);
		}
		System.out.println("=====================");
		boolean b[] = {true,false,true,false,true,true};
		
		byte[] num = {1,2,3,4,5};
		for(int i = 0; i<nums.length; i++ ) {
			System.out.println(num[i]);
		}
		
		for(int num1 : nums) {
			System.out.println(num1);
		}
		
		long[] num1 = {15545,555665455,44555555};
		for(int i = 0; i<num.length; i++) {
			System.out.println(num1[i]);
		}
		
		
	}
}
