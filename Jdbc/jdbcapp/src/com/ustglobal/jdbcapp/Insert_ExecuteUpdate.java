package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;
public class Insert_ExecuteUpdate {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			stmt = conn.createStatement();
			String sql = "insert into employee_info values(19,"
					+ "3 'shreya', 3300, 'F')";
			
			int count = stmt.executeUpdate(sql);
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
				if(stmt!= null) {
					stmt.close();
				}
			} catch(SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
}
