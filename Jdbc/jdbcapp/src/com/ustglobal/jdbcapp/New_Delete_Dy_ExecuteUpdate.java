package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class New_Delete_Dy_ExecuteUpdate {
	public static void main(String[] args) {
		
//		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//		String sql = "delete from employee_info where id =?";
				
		Connection conn = null;
		PreparedStatement ps =null;
		FileReader fr = null;
		
		try {
			fr = new FileReader("db.properties");
			Properties pro = new Properties();
			pro.load(fr);
			
			String url = pro.getProperty("url");
			String sql = pro.getProperty("delete-query");
			conn = DriverManager.getConnection(url,pro);
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
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(ps!=null) {
					ps.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
