package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestEmployee {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		Employee e1 = new Employee(101,"rakesh",34000);
		Employee e2 = new Employee(102,"sachin",38000);
		Employee e3 = new Employee(103,"vikash",34000);
		Employee e4 = new Employee(104,"ajeet",44000);
		Employee e5 = new Employee(105,"mukesh",35000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
//		System.out.println(al);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~ For Loop ~~~~~~~~~~~~~~~~~~");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~ For Each ~~~~~~~~~~~~~~~~~~");
		for(Employee i : al) {
			System.out.println(i);
		}
	}
}
