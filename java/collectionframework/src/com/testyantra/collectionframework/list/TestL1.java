package com.testyantra.collectionframework.list;


import java.util.Collections;
import java.util.LinkedList;

public class TestL1 {
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(13);
		l.add(34);
		l.add(3);
		l.add(10);
		
		//l.add(null); we should not pass null its throw nullPointerException
		
		System.out.println("Before sort "+l);
		Collections.sort(l);					
		System.out.println("After sort "+l);
		
		Collections.reverse(l);
		System.out.println("After reverse "+l);
		
		Collections.shuffle(l);
		System.out.println("After shuffle "+l);
		
		
	}
}
