package com.testyantra.lambdaexpressions;

public class TestGreet {
	public static void main(String[] args) {
		
		GreetInterface gi = (message) -> {};
		gi.greet("Hello","message");
		
	}
}
