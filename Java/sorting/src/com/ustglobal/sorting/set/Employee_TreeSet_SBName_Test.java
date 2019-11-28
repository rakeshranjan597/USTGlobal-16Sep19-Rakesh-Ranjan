package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Employee_TreeSet_SBName_Test {
	public static void main(String[] args) {
		
			//	Sorting based on Name
		Comparator<Employee_TreeSet> cm = (e1,e2) -> {
			return e1.name.compareTo(e2.name);
		};
		
		TreeSet<Employee_TreeSet> ts = new TreeSet<>(cm);
		
		Employee_TreeSet e1 = new Employee_TreeSet(105, "Rakesh", 5.10);
		Employee_TreeSet e2 = new Employee_TreeSet(103, "Aman", 4.10);
		Employee_TreeSet e3 = new Employee_TreeSet(102, "Satish", 5.5);
		Employee_TreeSet e4 = new Employee_TreeSet(101, "Zahid", 5.8);
		Employee_TreeSet e5 = new Employee_TreeSet(104, "Vikash", 6.0);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5); 
		
		System.out.println("~~~~~~~ Using Iterator ~~~~~~");
		Iterator<Employee_TreeSet> it = ts.iterator();
		while(it.hasNext()) {
			Employee_TreeSet e = it.next();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("   Id is: "+e.id);
			System.out.println("   Name is: "+e.name);
			System.out.println("   Height is: "+e.height);
		}
	}
}
