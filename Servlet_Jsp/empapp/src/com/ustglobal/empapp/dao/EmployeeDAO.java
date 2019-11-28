package com.ustglobal.empapp.dao;

import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public interface EmployeeDAO {
	
	List<EmployeeBean>	selectEmp();	
	
	EmployeeBean searchEmp(int d);
	
	int insertEmp(EmployeeBean bean);
	
	int updateEmp(EmployeeBean bean);
	
	int deleteEmp(int id);
}
