package com.testyantra.sorting.list;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker(50,"blue"));
		al.add(new Marker(70,"red"));
		al.add(new Marker(80,"green"));
		al.add(new Marker(40,"black"));
				
		System.out.println("Before sorting------------> ");
		display(al);
		
		SortByPrice sb = new SortByPrice();
		SotByColor sc = new SotByColor();
		Collections.sort(al,sc);
//  	Collections.sort(al, sb);
		
		System.out.println("After sorting-----------> ");
		display(al);
		
	}

	 static void display(ArrayList<Marker> a) {
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("Price is "+m.price);
			System.out.println("Color is "+m.color);
			System.out.println("===============================");
		}
	}
}
