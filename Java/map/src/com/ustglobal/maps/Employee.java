package com.ustglobal.maps;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
		//	Sorting Based on Id
//	@Override
//	public int compareTo(Employee o) {
//		Integer i = this.id;
//		Integer j = o.id;
//		return i.compareTo(j);
//	}
	
	@Override
	public int compareTo(Employee o) {
		String i = this.name;
		String j = o.name;
		return i.compareTo(j);
	}
	
}
