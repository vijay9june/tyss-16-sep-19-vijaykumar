package com.testyantra.exception.customizedcheckedexception;

public class TestAmount {

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(50000);
			System.out.println("withdraw successful");
			
		} catch (InvalidAmountException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main ended");
		
	}
	
}
