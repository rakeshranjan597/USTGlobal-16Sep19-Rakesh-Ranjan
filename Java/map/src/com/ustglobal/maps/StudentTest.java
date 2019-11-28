package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(5, "rakesh", 87.5);
		Student s2 = new Student(15, "ambika", 76.5);
		Student s3 = new Student(2, "vikash", 84.5);
		Student s4 = new Student(8, "zahid", 86.5);
		Student s5 = new Student(7, "rekha", 73.5);
		Student s6 = new Student(9, "madhu", 66.5);
		Student s7 = new Student(12, "tina", 85.5);
		Student s8 = new Student(23, "sumer", 77.5);
		Student s9 = new Student(4, "nikhil", 57.5);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		ArrayList<Student> al3 = new ArrayList<Student>();
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
			
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al2);
		hm.put("third", al3);
		
		ArrayList<Student> fir = hm.get("second");
		Iterator<Student> it = fir.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("~~~~~~~~~~~~~~~~~");
			System.out.println(" Id is: "+ s.id);
			System.out.println(" Name is: "+ s.name);
			System.out.println(" Per is: "+ s.per);
		}
		
	}
}
