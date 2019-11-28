package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(24);
		ts.add(9);
		ts.add(64);
		ts.add(74);
		
//		null not allowed
//		ts.add("diksha");     ClassCastException
//		ts.add(null);		  NullPointerException
		
		System.out.println("*************Using for each**************");
		for(Object s : ts) {
			System.out.println(s);
		}
		
		System.out.println("**************Using iterator******************");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
		
	}
}
