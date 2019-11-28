package com.ust_global.objectclass;

public class Imp_HashCode_ToString {
	public static void main(String[] args) {
		Student s = new Student(15,"Rakesh",87.5);
		System.out.println(s.hashCode());
		System.out.println(s.toString());
	}
}
