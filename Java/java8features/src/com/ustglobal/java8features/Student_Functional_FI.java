package com.ustglobal.java8features;

import java.util.function.Function;

public class Student_Functional_FI {
	public static void main(String[] args) {
		
		Function<Integer, Student> f = id -> {
			Student s = new Student(2, "vijay", 84.5);
			s.id = id;
			return s;
		};
		
		Student s = f.apply(24);
		System.out.println(" Id is: "+s.id);
		System.out.println(" Name is: "+s.name);
		System.out.println(" Per is: "+s.per);
	}
}
