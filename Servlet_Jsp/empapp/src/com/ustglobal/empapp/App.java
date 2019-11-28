package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.AppDAO_Hibernate;
import com.ustglobal.empapp.dao.AppDAO_JDBC;
import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeFactory;

public class App {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search employee data");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch) {
	
			case 1:			
//				EmployeeDAO dao = EmployeeFactory.getEmployeeDAO();
//				List<EmployeeBean> res = dao.selectEmp();
				
				EmployeeDAO dao = new AppDAO_JDBC();
				List<EmployeeBean> res = dao.selectEmp();
				
				for(EmployeeBean eb1: res) {

					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Id is : "+ eb1.getId());
					System.out.println("Name is : "+ eb1.getName());
					System.out.println("Salary is : "+ eb1.getSal());
					System.out.println("Gender is : "+ eb1.getGender());
				}
				break;
				
			case 2:
				System.out.print("Enter id: ");
				int id = sc.nextInt();
//				sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.next();
				System.out.print("Enter Salary: ");
				int sal = sc.nextInt();
				System.out.print("Enter Gender: ");
				String gender = sc.next();
				
				EmployeeBean eb2 = new EmployeeBean();
				eb2.setId(id);
				eb2.setName(name);
				eb2.setSal(sal);
				eb2.setGender(gender);
				
				EmployeeDAO imp2 = EmployeeFactory.getEmployeeDAO();
				int count2 = imp2.insertEmp(eb2);
				if(count2!=0)
					System.out.println(count2+" rows Aftected!!");
				else
					System.out.println("Failed to Insert");
				break;
				
			case 3:
				break;
				
			case 4:
				EmployeeDAO imp4 = EmployeeFactory.getEmployeeDAO();
				System.out.print("Enter id: ");
				int id4 = sc.nextInt();
				int count4 = imp4.deleteEmp(id4);
				if(count4!=0)
					System.out.println(count4+" rows Aftected!!");
				else
					System.out.println("Failed to Delete");
				break;
				
			case 5:
				EmployeeDAO imp5 = EmployeeFactory.getEmployeeDAO();
				
				System.out.print("Enter id: ");
				int id5 = sc.nextInt();
				EmployeeBean eb5 = imp5.searchEmp(id5);
				if(eb5!=null) {
					
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Id is : "+ eb5.getId());
					System.out.println("Name is : "+ eb5.getName());
					System.out.println("Salary is : "+ eb5.getSal());
					System.out.println("Gender is : "+ eb5.getGender());
				} else {
					System.out.println("~~ Data Not Found ~~~");
				}
				break;
			default:
				System.out.println("Wrong Entry plz press between 1-5");
		}
		
	}
}
