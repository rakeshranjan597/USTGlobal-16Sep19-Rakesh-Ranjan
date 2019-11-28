package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		Employee e1 = new Employee(1, "Rakesh");
		Employee e2 = new Employee(5, "Amit");
		Employee e3 = new Employee(3, "Sachin");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Comparator<Employee> cmp = (a,b) -> {
			return a.name.compareTo(b.name);
		};
		
		
		List<Employee> sortedEmp = al.stream().sorted(cmp).collect(Collectors.toList());
		
//		Collections.sort(al);	//	Comparable
		
		Iterator<Employee> it = sortedEmp.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is: "+e.id);
			System.out.println("Name is: "+e.name);
		}

	}
}
