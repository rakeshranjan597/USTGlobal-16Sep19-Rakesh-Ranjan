package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ustglobal.empapp.dto.EmployeeBean;

public class AppDAO_Hibernate implements EmployeeDAO{
	
	public ArrayList<EmployeeBean> selectEmp(){
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
					
			conn = DriverManager.getConnection(url);
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			ArrayList<EmployeeBean> result = new ArrayList<>();
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				bean.setId(id);
				bean.setName(name);
				bean.setSal(salary);
				bean.setGender(gender);
				
				result.add(bean);
			}
			return result;
			
		} catch(Exception e) {
			System.out.println(e);
			return null;
			
		} finally {
			try {
				if(conn!=null)
					conn.close();
				if(st!=null)
					st.close();
				if(rs!=null)
					rs.close();
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public EmployeeBean searchEmp(int d){
		
		return null;
	}

	@Override
	public int insertEmp(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEmp(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmp(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
