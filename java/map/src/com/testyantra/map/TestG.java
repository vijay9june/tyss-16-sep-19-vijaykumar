package com.testyantra.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "vijay", 20000);
		Employee e2 = new Employee(2, "Ajay", 20200.23);
		Employee e3 = new Employee(3, "lalit", 20320.32);
		Employee e4 = new Employee(4, "abhi", 19000);
		Employee e5 = new Employee(5, "sumit", 30000);
		Employee e6 = new Employee(6, "amit", 29000);
		Employee e7 = new Employee(7, "sanjeet", 25000);
		Employee e8 = new Employee(8, "ankit", 18000);
		Employee e9 = new Employee(9, "aayush", 22000);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(e4);
		al2.add(e5);
		al2.add(e6);
		
		ArrayList<Employee> al3 = new ArrayList<Employee>();
		al3.add(e7);
		al3.add(e8);
		al3.add(e9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		
		hm.put("first", al1);
		hm.put("second", al2);
		hm.put("third", al3);
		
		ArrayList<Student> first = hm.get("first");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Salary is "+s.salary);
			System.out.println("=================================");
			
			
		}
	}
}
