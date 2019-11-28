package com.testyantra.collectionframework.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(22.5);
		al.add(true);
		al.add("ajay");
		
		for(Object o : al) {
			System.out.println(o);
		}
		
	}
}
