package com.ustglobal.streams.list;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

}
