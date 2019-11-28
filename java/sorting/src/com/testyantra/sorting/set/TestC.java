package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(34);
		ls.add("nikita");
		ls.add(89.9);
		ls.add(34);
		ls.add("bhawana");
		ls.add(null);
		ls.add(null);   				//only one null allowed
		
		for(Object s : ls) {
			System.out.println(s);
		}
		
		System.out.println("*************using iterator***********");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
		
		
	}
}
