package com.testyantra.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK1 {
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(23.5);
		al.add(45.5);
		al.add(55.5);
		al.add(85.3);
		al.add(23.5);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		al.add(2, 54.6);
		System.out.println("After add in second index "+al);
		al.remove(0);
		System.out.println("After removing 0th index "+al);
		al.remove(null);
		System.out.println("After removing null "+al);
		Double val = al.get(4);
		System.out.println("object at 4th index");
		al.set(2, 76.6);
		System.out.println("After replacing 2nd index "+al);
		al.clear();
		System.out.println("After clear method "+al);
		al.contains(55.5);
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);
		
		al.addAll(al1);
		System.out.println("After add all "+al);
		
		boolean contain = al.containsAll(al1);
		System.out.println("Contains all of al1 "+contain);
		
		
		boolean res = al.removeAll(al1);
		System.out.println("Removed all of al1 "+res);
		
		
		
		
	}
}
