package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;
public class New_Insert_Dy_ExecuteUpdate {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		FileReader fr = null;
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
		
			fr = new FileReader("db.properties");
			Properties pro = new Properties();
			pro.load(fr);
			
			String url = pro.getProperty("url");
			String sql = pro.getProperty("insert-query");
			
			conn = DriverManager.getConnection(url, pro);
			
//			String sql = "insert into employee_info values(?,?,?,?)";
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
			
		} catch(Exception e) {
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
				if(fr!=null) {
					fr.close();
				}
			} catch(Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
