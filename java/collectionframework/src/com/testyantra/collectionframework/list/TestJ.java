package com.testyantra.collectionframework.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101,"ankitha",45.55);
		Student s2 = new Student(102,"supriya",55.55);
		Student s3 = new Student(103,"vijay",65.55);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(int i = 0; i<al.size(); i++) {
			Student s = al.get(i);
			System.out.println("ID is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("percentage is "+s.percentage);
		}
		System.out.println("===================for each======");
		for(Student s : al) {
			System.out.println(s);
		}
		
	}
}
