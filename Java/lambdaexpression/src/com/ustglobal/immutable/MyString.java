package com.ustglobal.immutable;

public class MyString {
	private int rollNo;
	private String name;
	
	public MyString(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
	
	public MyString changeContet(int rollno, String name) {
		MyString m = new MyString(rollno, name);
		return m;
	}
}
