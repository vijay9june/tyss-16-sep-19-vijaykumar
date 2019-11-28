package com.testyantra.sorting.list;


import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		
		Bank b1 = new Bank("HDFC", 560025, 65654565);
		Bank b2 = new Bank("IDFC", 570025, 65523565);
		Bank b3 = new Bank("SBI", 566525, 65565565);
		Bank b4 = new Bank("PNB", 561225, 65234565);
		Bank b5 = new Bank("PNB", 561225, 65234565);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("************Using Iterator ******************");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode  is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			System.out.println("========================");

		}
		
	}
}
