package com.ustglobal.immutable;

public class TestString {
	public static void main(String[] args) {
		MyString ms = new MyString(12, "Divya");
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms);
		
		MyString ms1 = ms.changeContet(13, "Anu");
		System.out.println(ms1.getName());
		System.out.println(ms1.getRollNo());
		System.out.println(ms1);
	}
}
