package com.ustglobal.java8features;

import java.util.function.Supplier;

public class Supplier_Functional_In {
	public static void main(String[] args) {
		
		Supplier<Student> s = () -> new Student(5, "ajay", 74.5);
		
		Student s1 = s.get();
		System.out.println("Id is: "+s1.id);
		System.out.println("Name is: "+s1.name);
		System.out.println("Per is: "+s1.per);
		
		Supplier<Integer> i = () -> 15;
		
		Integer val = i.get();
		System.out.println("Returned value is: "+val);
	}
}
