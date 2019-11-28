package com.ustglobal.jdbcapp;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class O_Retreive_ExecuteQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
			
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password= "tiger";
			conn = DriverManager.getConnection(url, user, password);
			
			stmt = conn.createStatement();
			String sql = "Select * from emp";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("Name:  "+rs.getString("ename"));
				System.out.println("Salary:  "+rs.getString("sal"));
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
