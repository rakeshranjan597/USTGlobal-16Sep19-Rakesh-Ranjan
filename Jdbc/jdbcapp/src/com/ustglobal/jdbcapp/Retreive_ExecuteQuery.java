package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class Retreive_ExecuteQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
			
		try {
			Driver driver = new Driver();	//	connection b/w java and dbms
			DriverManager.registerDriver(driver);	// register the driver 			
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
				
			conn = DriverManager.getConnection(url);
			
			stmt = conn.createStatement();
			String sql = "Select * from employee_info";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String sal = rs.getString("sal");
				String gender = rs.getString("gender");
				
				System.out.println("~~~~~~~~~~~~~~~~~~~");
				System.out.println("Id is : " + id);
				System.out.println("Name is : " + name);
				System.out.println("Salary is : " + sal);
				System.out.println("Gender is : " + gender);
			}
		} catch(SQLException e) {
//			System.out.println(e);
			e.printStackTrace();
			
		} finally {
			try {
				
				if(conn!= null) {
					conn.close();
				}
				if(stmt!= null) {
					stmt.close();
				}
				if(rs!= null) {
					rs.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
