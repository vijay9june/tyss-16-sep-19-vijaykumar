package com.testyantra.map;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku", 998014);
		hm.put("mala", 898789);
		hm.put("sheela", 745875);
		hm.put(null , 985666);
		hm.put(null, 888888);
		
		System.out.println("Data "+hm);
		
		hm.put("mala", 789899);
		System.out.println("After Modify "+hm);
		
		hm.put("dimple", 789899);
		System.out.println("After dimple "+hm);
	
		System.out.println("After Null "+hm);
		System.out.println("===================");
		System.out.println("After Adding duplicate null ");
		System.out.println(hm);
		
		Object phoneno = hm.get("sheela");
		System.out.println("value "+phoneno);
		
		System.out.println("==================");
		
		Object phoneno1 = hm.get("she");
		System.out.println("value "+phoneno1);
		
		System.out.println("============");
		
		Object value = hm.get("sheela");
		System.out.println("value "+value);
		
		System.out.println("=========================");
		hm.remove("kuku");
		System.out.println("value "+value);
		System.out.println("After Remove----------------> "+hm);
	}






}
