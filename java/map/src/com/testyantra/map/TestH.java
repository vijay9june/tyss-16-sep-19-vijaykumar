package com.testyantra.map;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Ajay");
		ht.put(401, "Vijay");
		ht.put(199, "Sonu");
		ht.put(144, "Monu");
		ht.put(101, "sumit");
//		ht.put(null, "john");     NullPointerException
//		ht.put(108, null);        NullPointerException
		System.out.println("Data "+ht);
		
	}
}
