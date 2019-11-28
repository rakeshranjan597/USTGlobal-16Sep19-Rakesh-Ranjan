package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double per;
	
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	//		Sorting based on Id
/*
	@Override
	public int compareTo(Student s) {
		if(this.id > s.id) {
			return 1;
		} else if(this.id<s.id) {
			return -1;
		} else {
			return 0;
		}
	}
*/	
	
	@Override
	public int compareTo(Student s) {
		Integer i = this.id;
		Integer j = s.id;
		return i.compareTo(j);
	}
	
	
	//	Sorting based on Per
/*	
	@Override
	public int compareTo(Student s) {
		if(this.per > s.per) {
			return 1;
		} else if(this.per<s.per) {
			return -1;
		} else {
			return 0;
		}
	}
*/
	/*
	//	Soting based on String
	@Override
	public int compareTo(Student s) {
		String p = this.name;
//		p = p.toLowerCase();
		String q = s.name;
//		q = q.toLowerCase();
//		return p.compareTo(q);		// Will Not Ignore The Case
		
		
		return p.compareToIgnoreCase(q);	// To Ignore the case
		
	}
	*/
	
	
}	