package com.ustglobal.beanobject.bean;

public class TestB {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(123);
		e.setName("Rakesh");
		e.setSalary(150000);
		e.setDept(10);
		e.setDesignation("Developer");
		
		DataBase2 d2 = new DataBase2();
		d2.receive(e);
	}
}
