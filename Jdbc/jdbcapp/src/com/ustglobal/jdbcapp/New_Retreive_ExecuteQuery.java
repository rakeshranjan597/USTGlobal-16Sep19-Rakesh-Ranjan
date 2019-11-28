package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class New_Retreive_ExecuteQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		
		try {
			
//			reader = new FileReader("db.properties");
//			Properties prop = new Properties();
//			prop.load(reader);
//			Class.forName(prop.getProperty("driver-class-name"));	
//			String url = prop.getProperty("url");
//			String sql = prop.getProperty("select-query");
//			conn = DriverManager.getConnection(url,prop);
			
			
			Properties prop = new Properties();
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			String sql = "Select * from employee_info";
			prop.put("user", "root");
			prop.put("password", "root");
			conn = DriverManager.getConnection(url,prop);
			
			stmt = conn.createStatement();
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
		} catch(Exception e) {
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
				if(reader!=null) {
					reader.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
