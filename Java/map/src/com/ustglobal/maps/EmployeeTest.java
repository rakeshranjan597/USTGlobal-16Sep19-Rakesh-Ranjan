package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(105, "rakesh", 40000);
		Employee e2 = new Employee(104, "amit", 45000);
		Employee e3 = new Employee(111, "sanjay", 40000);
		Employee e4 = new Employee(115, "rajesh", 38000);
		Employee e5 = new Employee(103, "vikash", 35000);
		Employee e6 = new Employee(101, "zahid", 44000);
		Employee e7 = new Employee(151, "ravi", 25000);
		Employee e8 = new Employee(121, "sunny", 30000);
		Employee e9 = new Employee(109, "monu", 45000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(e4);
		al2.add(e5);
		al2.add(e6);
		
		ArrayList<Employee> al3 = new ArrayList<Employee>();
		al3.add(e7);
		al3.add(e8);
		al3.add(e9);

		HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
		hm.put("a", al);
		hm.put("b", al2);
		hm.put("c", al3);
		
		for(Map.Entry<String, ArrayList<Employee>> m: hm.entrySet()){
			
			Object getKey = m.getKey();
			System.out.println("~~~~~~~~~~~~~~~~~~~ The key is : " +getKey +" ~~~~~~~~~~~~~~~~~~\n");
			
			ArrayList<Employee> all = m.getValue();
			
			Collections.sort(all);
			
			Iterator<Employee> it = all.iterator();
			while(it.hasNext()) {
				Employee e = it.next();
				System.out.print(" ~~~ Id is: "+e.id);
				System.out.print(" ~~~ Name is: "+e.name);
				System.out.print(" ~~~ Salary is: "+e.salary +"\n");
			}
			System.out.println();
		}

	}
}
