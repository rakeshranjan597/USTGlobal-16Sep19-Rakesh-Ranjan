package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.io.FilterReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;


public class New_Update_Dy_ExecuteUpdate {
	public static void main(String[] args) {
		
//		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//		String sql = "update employee_info set name = ?, sal= ?, gender=? where id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("db.properties");
			Properties pro = new Properties();
			pro.load(fr);
			
			String url = pro.getProperty("url");
			String sql = pro.getProperty("update-query");
			
			Class.forName(pro.getProperty("driver-class-name"));
			
			conn = DriverManager.getConnection(url, pro);
			ps = conn.prepareStatement(sql);
		
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empSal = args[2];
			int sal = Integer.parseInt(empSal);
			
			String gender = args[3];
			
			ps.setInt(4, id);
			ps.setString(1, name);
			ps.setInt(2, sal);
			ps.setString(3, gender);
			
			int count = ps.executeUpdate();
			if(count!=0) {
				System.out.println(count+" Row Affected!!");
			} else {
				System.out.println("Failed to Update");
			}
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			try {
				if(conn!= null) {
					conn.close();
				}
				if(ps!= null) {
					ps.close();
				}
				if(fr!=null) {
					fr.close();
				}
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
