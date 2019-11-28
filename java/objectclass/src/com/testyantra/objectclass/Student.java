package com.testyantra.objectclass;

public class Student {

	int id;
	String name;
	Double percentage;
	
	public Student(int id, String name, Double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
