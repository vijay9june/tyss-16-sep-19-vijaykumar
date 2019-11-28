package com.testyantra.java8features;

import java.util.ArrayList;

public class TestS {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5, "vikram", 56.7));
		al.add(new Student(3, "susant", 35.7));
		al.add(new Student(2, "yash", 66.7));
		al.add(new Student(6, "aishu", 37.7));
		al.add(new Student(1, "akshay", 85.2));
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
		h.displayPassedStudents(al);
		h.topperOfClass(al);
		
	}
}

