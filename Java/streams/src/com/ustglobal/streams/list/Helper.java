package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {
	
	Comparator<Student> cmp = (a,b) -> {
//		if(a.per > b.per) {
//			return 1;
//		} else if(a.per < b.per) {
//			return -1;
//		} else {
//			return 0;
//		}
		Double i = a.per;
		Double j = b.per;
		return i.compareTo(j);
	};
	
	void displayAllStudent(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("   Id is: "+s.id);
			System.out.println("   Name is: "+s.name);
			System.out.println("   Per is: "+s.per);
		}
	}
	
	void displayFailedStudents(ArrayList<Student> al) {
		List<Student> failedStudent = al.stream().filter(i -> i.per < 35 ).collect(Collectors.toList());
		
		Iterator<Student> it = failedStudent.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("   Id is: "+s.id);
			System.out.println("   Name is: "+s.name);
			System.out.println("   Per is: "+s.per);
		}
	}
	
	void displayPassedStudents(ArrayList<Student> al) {
		List<Student> failedStudent = al.stream().filter(i -> i.per > 35 ).collect(Collectors.toList());
		
		Iterator<Student> it = failedStudent.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("   Id is: "+s.id);
			System.out.println("   Name is: "+s.name);
			System.out.println("   Per is: "+s.per);
		}
	}
	
	void displayTopperStudent(ArrayList<Student> al) {
		Student s = al.stream().max(cmp).get();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("   Id is: "+s.id);
		System.out.println("   Name is: "+s.name);
		System.out.println("   Per is: "+s.per);
	}
	
	void displayLowestStudent(ArrayList<Student> al) {
		Student s = al.stream().min(cmp).get();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("   Id is: "+s.id);
		System.out.println("   Name is: "+s.name);
		System.out.println("   Per is: "+s.per);
	}
}
