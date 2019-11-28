package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;
public class Update_ExecuteUpdate {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			stmt = conn.createStatement(); 
			String sql = "update employee_info set sal = 50 "
					+ "where id = 105 ";
			
			int count = stmt.executeUpdate(sql);
			if(count!=0)
				System.out.println(count+" Rows Affected");
			else
				System.out.println("Failed to Update");
			
		} catch(SQLException e) {
//			e.printStackTrace();
			System.out.println(e);
			
		} finally {
			
			try {	
				if(conn!= null) {
					conn.close();
				}
				if(stmt!= null) {
					stmt.close();
				}
			} catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
