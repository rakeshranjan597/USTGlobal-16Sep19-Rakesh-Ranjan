package com.ustglobal.collectionframework.list;

public class Employee {
	int empid;
	String name;
	double sal;

	public Employee(int empid, String name, double sal) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}
