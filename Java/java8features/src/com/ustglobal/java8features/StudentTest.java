package com.ustglobal.java8features;

import java.util.function.Predicate;

public class StudentTest {
	public static void main(String[] args) {
		
		Predicate<Student> p = s -> {
			if(s.per>=35) {
				return true;
			} else {
				return false;
			}
		};
		
		Student s = new Student(101, "rakesh", 88.5);
		boolean res = p.test(s);
		System.out.println(" Result is: "+ res);
	}
}
