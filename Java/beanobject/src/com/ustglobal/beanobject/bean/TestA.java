package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setName("Shivgami");
		s.setRollno(134);
		
		DataBase db = new DataBase();
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(10);
		e.setName("Aliya");
		e.setSalary(120000);
		db.save(e);
	}
}
