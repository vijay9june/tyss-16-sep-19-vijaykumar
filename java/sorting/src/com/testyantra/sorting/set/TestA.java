package com.testyantra.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(45);
		hs.add("deepa");
		hs.add(56.7);
		hs.add(12);                         //duplicate not supported
		hs.add(null);
		hs.add(null);                       //more than 1null not supported
		
		
		System.out.println("***********Using for each************");
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("*************Using iterator**************");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
		
	}
}
