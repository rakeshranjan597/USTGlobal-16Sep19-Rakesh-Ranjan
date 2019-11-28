package com.ustglobal.collectionframework.list;

public class Student_ArrayObject {
	int id;
	String name;
	double per;
	
	public Student_ArrayObject(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student_ArrayObject [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	
}
