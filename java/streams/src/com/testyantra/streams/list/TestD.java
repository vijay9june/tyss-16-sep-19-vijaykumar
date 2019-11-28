package com.testyantra.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(23);
		marks.add(25);
		marks.add(30);
		marks.add(49);
		marks.add(72);
		
		Comparator<Integer> cmp = (m1,m2) -> {
			if(m1>m2) {
				return 1;
			}else if(m1<m2) {
				return -1;
			}else {
				return 0;
			}
		};
		
		long noOfFaliedStudent = marks.stream().filter(i -> i < 40).count();
		System.out.println(noOfFaliedStudent);
		
		System.out.println("==============================");
		
		Integer i = marks.stream().min(cmp).get();
		System.out.println("wrost performer "+i);
		
		System.out.println("========================");
		Integer j = marks.stream().max(cmp).get();
		System.out.println("Best performer "+j);
	
	}







}
