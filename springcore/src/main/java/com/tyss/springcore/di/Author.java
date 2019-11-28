package com.tyss.springcore.di;

public class Author {
	
	public Author() {
		System.out.println("Author Object Created");
	}
	
	private String name;
	private String penName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPenName() {
		return penName;
	}
	public void setPenName(String penName) {
		this.penName = penName;
	}
	
}
