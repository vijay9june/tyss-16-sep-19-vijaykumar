package com.testyantra.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		
		Student s1 = new Student(2, "divya", 62.5);
		Student s2 = new Student(3, "ambika", 56.32);
		Student s3 = new Student(4, "kiran", 55.32);
		Student s4 = new Student(5, "dinesh", 45.32);
		Student s5 = new Student(6, "chinnu", 66.33);
		Student s6 = new Student(7, "ankita", 76.32);
		Student s7 = new Student(8, "pooja", 69.32);
		Student s8 = new Student(9, "sonu", 72.32);
		Student s9 = new Student(1, "maya", 71.32);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 =new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 =new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Student> second = hm.get("second");
		
		Iterator<Student> it = second.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=================================");
			
			
		}
	}






















}
