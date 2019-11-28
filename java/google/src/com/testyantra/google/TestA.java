package com.testyantra.google;

public class TestA {

	public static void main(String[] args) {
	
	Browser b = new Browser();
	
	Google g = new Gmail(); //upcasting
	b.open(g);
	
	Google gd = new GoogleDrive();  //upcasting
	b.open(gd);
		
	}

}
