package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete_Dy_ExecuteUpdate {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "delete from employee_info where id =?";
				
		Connection conn = null;
		PreparedStatement ps =null;
		
		try {
			conn = DriverManager.getConnection(url);
			ps = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			ps.setInt(1, id);
			
			int count = ps.executeUpdate();
			if(count!=0) {
				System.out.println(count+" Row affected!!");
			} else {
				System.out.println("Failed to Update");
			}
			
		} catch(SQLException e) {
			System.out.println(e);
		} finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(ps!=null) {
					ps.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
