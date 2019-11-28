package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeTest_HashSet {
	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(101, "rakesh", 30000);
		Employee e2 = new Employee(105, "abhay", 45000);
		Employee e3 = new Employee(103, "kunal", 40000);
		Employee e4 = new Employee(104, "bitu", 30000);
		Employee e5 = new Employee(102, "zahid", 20000);
		Employee e6 = new Employee(102, "zahid", 20000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		hs.add(e6);
		
		System.out.println("~~~~~~~ Using Iterator ~~~~~~~~");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("   Id is: "+ e.id);
			System.out.println("   Name is: "+ e.name);
			System.out.println("   Salary is: "+ e.salary);
		}
	}
}
