package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class CustomerTest_TreeSet {
	public static void main(String[] args) {
		
//		Customer_SortByName sbn = new Customer_SortByName();
//		TreeSet<Customer> ts = new TreeSet<>(sbn);
		
		Customer_SortById sbi = new Customer_SortById();
		TreeSet<Customer> ts = new TreeSet<>(sbi);
		
		Customer c1 = new Customer(104, "Rakesh", 45000);
		Customer c2 = new Customer(102, "Ashu", 35000);
		Customer c3 = new Customer(101, "Vikash", 55000);
		Customer c4 = new Customer(105, "Nikhil", 25000);
		Customer c5 = new Customer(103, "Bunty", 30000);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		
		System.out.println("~~~~~~~~~~ Using Iterator ~~~~~~~~~~~");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("   Id is: "+c.id);
			System.out.println("   Name is: "+c.name);
			System.out.println("   Salary is: "+c.salary);
			
		}
	}
}
