package com.ust_global.objectclass;

public class New_Equals {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Rakesh",50000);
		Employee e2 = new Employee(2,"Ravi",50000);
		Employee e3 = new Employee(1,"Rakesh",50000);
		Employee e4 = e2;
		
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(e2.equals(e4));
	}
}
