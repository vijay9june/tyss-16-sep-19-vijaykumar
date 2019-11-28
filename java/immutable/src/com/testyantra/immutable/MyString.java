package com.testyantra.immutable;

public final class MyString {
	private final int rollno;
	private final String name;
	
	public MyString(int rollno , String name) {
		
		this.rollno = rollno;
		this.name = name;
		
	}
	public int getRollNo() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public MyString changeContent(int rollno , String name) {
		MyString m = new MyString(rollno, name);
		return m ;
	
	}
}
