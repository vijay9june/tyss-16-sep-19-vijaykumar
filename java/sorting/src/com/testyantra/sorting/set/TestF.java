package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("priya");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("munni");
		ts.add("sheela");
		
		System.out.println("**************Using for each************");
		for (String s : ts) {
			System.out.println(s);
		}
		System.out.println("***********Using Iterator*****************");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
			
			
		}
		
	}
}
