package com.ustglobal.empapp.util;

import com.ustglobal.empapp.dao.AppDAO_Hibernate;
import com.ustglobal.empapp.dao.AppDAO_JDBC;
import com.ustglobal.empapp.dao.EmployeeDAO;

public class EmployeeFactory {

	private EmployeeFactory()  { }
	
	public static EmployeeDAO getEmployeeDAO() {
		
		return new AppDAO_JDBC();
		
//		return new AppDAO_Hibernate();
	}
}
