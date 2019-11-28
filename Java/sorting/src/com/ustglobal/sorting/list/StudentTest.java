package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student  s1 = new Student(104, "Jahid", 45.55);
		Student  s2 = new Student(102, "aalman", 85.78);
		Student  s3 = new Student(103, "Hritik", 75.16);
		Student  s4 = new Student(101, "Karina", 55.55);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("~~~~~~ Before Sorting ~~~~~~~");
		displayStudentDetails(al);
		
		Collections.sort(al);	//	Sorting Here
		
		System.out.println();
		System.out.println("~~~~~~ After Sorting ~~~~~~~");
		displayStudentDetails(al);
	}
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("~~~~~~~~~~~~~~~~~~");
			System.out.println("Id is :"+s.id);
			System.out.println("Name is :"+s.name);
			System.out.println("Per is :"+s.per);
		}
	}
}
