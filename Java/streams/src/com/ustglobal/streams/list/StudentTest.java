package com.ustglobal.streams.list;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(105, "zahid", 25.5));
		al.add(new Student(103, "shani", 95.5));
		al.add(new Student(102, "dhram", 84.5));
		al.add(new Student(104, "rakesh", 65.5));
		al.add(new Student(101, "aman", 30.5));
		
		Helper h = new Helper();
//		h.displayAllStudent(al);
//		h.displayFailedStudents(al);
//		h.displayPassedStudents(al);
//		h.displayTopperStudent(al);
		h.displayLowestStudent(al);
		
	}
}
