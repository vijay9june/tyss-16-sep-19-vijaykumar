package com.testyantra.lambdaexpressions;

public class TestSquare {
	public static void main(String[] args) {
		
	
	
	SquareInterface si = x -> x * x;
	int value = si.square(4);
	System.out.println("square is "+value);
	
	}	
}
