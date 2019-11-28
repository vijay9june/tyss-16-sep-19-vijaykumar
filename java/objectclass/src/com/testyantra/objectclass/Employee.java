package com.testyantra.objectclass;

public class Employee {

	int id;
	String name;
	double salary;
	private Employee obj;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
		return true;
		}
		
		Employee e = (Employee)obj;
		if(this.id == e.id ) {
			if(this.name.equals(e.name)) {
				if(this.salary == e.salary ) {
					return true;
				}else 
				{
					return false;
				}
				}else
				{
					return false;
				}
		
		}
		
			return false;
	}
	
	
}
