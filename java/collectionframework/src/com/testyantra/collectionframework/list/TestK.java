package com.testyantra.collectionframework.list;

import java.util.ArrayList;

public class TestK {

public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101,"ankit",45.55);
		Student s2 = new Student(102,"ajay",55.55);
		Student s3 = new Student(103,"vijay",66.55);
		Student s4 = new Student(104,"sanjit",75.55);
		Student s5 = new Student(105,"sumit",78.55);
		
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
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
