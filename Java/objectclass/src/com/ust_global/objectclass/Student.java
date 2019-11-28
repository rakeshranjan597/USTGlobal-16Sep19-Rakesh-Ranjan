package com.ust_global.objectclass;

public class Student {
	int id;
	String name;
	double per;
	
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Name is: "+name+", id is: "+id+", per is: "+per;
	}
}
