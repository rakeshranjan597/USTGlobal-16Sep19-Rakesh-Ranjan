package com.ustglobal.java8features.prediacte;

import java.util.function.Predicate;

public class EmployeeTest_Predicate {
	public static void main(String[] args) {
		
		Predicate<Employee_Predicate> p = x -> {
			if(x.salary > 30000 && x.id > 100) {
				return true;
			} else {
				return false;
			}
		};
		
		Employee_Predicate ep = new Employee_Predicate(154, "ranjeet", 45000);
		boolean res = p.test(ep);
		System.out.println("Result is : "+res);
	}
}
