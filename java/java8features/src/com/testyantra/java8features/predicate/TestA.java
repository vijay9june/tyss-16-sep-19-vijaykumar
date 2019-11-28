package com.testyantra.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		
		Predicate<Employee> p = (e) -> {
			if(e.salary>25000) {
				return true;
			}else {
				return false;
			}
		};
		
		Employee e = new Employee(101, "vijay", 15000);
		
	}
}
