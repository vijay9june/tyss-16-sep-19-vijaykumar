package com.testyantra.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	void displayAllStudent(ArrayList<Student> al) {
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=====================================");
			
		}
		
		
	}
	
	void displayPassedStudents(ArrayList<Student> al) {
		
		List<Student> l = 
				al.stream().filter(i -> i.percentage >= 40 ).collect(Collectors.toList());
		
		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("=====================================");
			
		} 
		
	}
	
	void topperOfClass(ArrayList<Student> al) {
	
	Comparator<Student> cmp = (s1,s2) -> {
		if(s1.percentage>s2.percentage) {
			return 1;
		}else if(s1.percentage<s2.percentage) {
			return -1;
		}else {
			return 0;
		}
	};
	
	
	
	
	
		Student s =  al.stream().max(cmp).get();
	}
	
	
	
	
	
	
	




}
