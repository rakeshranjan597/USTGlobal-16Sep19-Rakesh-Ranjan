package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student  s1 = new Student(101, "Ankita", 45.55);
		Student  s2 = new Student(102, "Salman", 85.78);
		Student  s3 = new Student(103, "Hritik", 75.16);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		System.out.println("~~~~~~~~~~~ For Loop ~~~~~~~~~~~~");
		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println(al.get(i));
//			System.out.println("Id is: "+s.id);
//			System.out.println("Name is: "+s.name);
//			System.out.println("Per is: "+s.per);
		}
		
		
		System.out.println();
		System.out.println("~~~~~~~~~~~ For Each ~~~~~~~~~~~");
		for(Student s:al) {
			System.out.println(s);
//			System.out.println("Id is: "+s.id);
//			System.out.println("Name is: "+s.name);
//			System.out.println("Per is: "+s.per);
		}
		
	}
}
