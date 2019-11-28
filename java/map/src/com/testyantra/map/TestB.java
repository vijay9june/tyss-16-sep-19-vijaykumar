package com.testyantra.map;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku", 998014);
		hm.put("mala", 898789);
		hm.put("sheela", 745875);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu", 9874858);
		hm1.put("riya", 9568778);
		hm1.put("kriti", 789899);
		
		boolean hasKey = hm.containsKey("mala");
		System.out.println("Has key "+hasKey);
		
		System.out.println("==================================");
		
		boolean hasValue = hm.containsValue(898789);
		System.out.println("Has value "+hasValue);
		
		hm.putAll(hm1);
		System.out.println("===============================");
		
		System.out.println("After put all "+hm);
		
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty "+isEmpty);
		
		hm.clear();
		System.out.println("After clear "+hm);
		
	}
}
