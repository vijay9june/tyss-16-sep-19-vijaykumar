package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		ls.add(12.3);
		ls.add(25.32);
		ls.add(1.5);
		ls.add(64.5);
		ls.add(45.2);
		
		System.out.println("*************Using for each**************");
		for(Double s : ls) {
			System.out.println(s);
		}
		
		System.out.println("**************Using iterator******************");
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Double p = it.next();
			System.out.println(p);
		}
	}
}
