package com.testyantra.beanobject.bean;

public class TestA {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(12);
		s.setName("shivangi");
		s.setRollNo(134);
		
		Database db = new Database();
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(123);
		e.setName("Alia");
		e.setSalary(120000);
		e.setDesignation("Software Developer");
		
		
		db.save(e);
		
	}
	
	
}
