package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;
public class Insert_Dy_ExecuteUpdate {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
		
			conn = DriverManager.getConnection(url);	
			ps = conn.prepareStatement(sql);
			
			String empId = args[0];
			int id = Integer.parseInt(empId);
			ps.setInt(1, id);
			
			String name = args[1];
			ps.setString(2, name);
			
			String empSalary = args[2];
			int salary = Integer.parseInt(empSalary);
			ps.setInt(3, salary);
			
			String gender = args[3];
			ps.setString(4, gender);
			
			int count = ps.executeUpdate();
			if(count!=0)
				System.out.println(count+" Rows Affected");
			else
				System.out.println("Error");
			
		} catch(SQLException e) {
//			e.printStackTrace();
			System.out.println(e);
			
		} finally {
			
			try {
				
				if(conn!= null) {
					conn.close();
				}
				if(ps!= null) {
					ps.close();
				}
			} catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
