package com.ustglobal.java8features;

import java.util.function.Consumer;

public class Consumer_Functional_In {
	public static void main(String[] args) {
		
		Consumer<Student> c = s -> {
			System.out.println("Id is: "+s.id);
			System.out.println("Name is: "+s.name);
			System.out.println("Per is: "+s.per);
		};
		
		Student s1 = new Student(105, "aman", 81.5);
		c.accept(s1);
		
	}
}
