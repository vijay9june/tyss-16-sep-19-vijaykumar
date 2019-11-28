package com.testyantra.sorting.list;

import java.util.Comparator;

public class SotByColor implements Comparator<Marker> {
	
	@Override
	public int compare(Marker o1, Marker o2) {
		
		String s= o1.color;
		String t = o1.color;
		
		return s.compareTo(t);
	
	}
}
