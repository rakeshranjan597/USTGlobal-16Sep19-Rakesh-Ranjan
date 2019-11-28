package com.ustglobal.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class Retreive_Dy_ExecuteQuery {
	
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id = ?";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
//			Driver driver = new Driver();	//	connection b/w java and dbms
//			DriverManager.registerDriver(driver);	// register the driver 			
			
			conn = DriverManager.getConnection(url);
			ps = conn.prepareStatement(sql);
			String empid = args[0];
			int id = Integer.parseInt(empid);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("sal"));
				System.out.println(rs.getString("gender"));
			}
			
		} catch(SQLException e) {
//			e.printStackTrace();
			System.out.println(e);
		} finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(ps!=null) {
					ps.close();
				}
				if(rs!=null) {
					rs.close();
				}
			} catch(SQLException e) {
				System.out.println(e);
			}
		}
	}
}
