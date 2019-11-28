package com.ustglobal.jdbcapp.withproperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Select {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db";
		Properties pro = new Properties();
		pro.put("user","root");
		pro.put("password","root");
		
		String sql = "select * from employee_info";
		
		try(Connection con = DriverManager.getConnection(url,pro);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				) {
			while(rs.next()) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Id is: "+ rs.getInt("id"));
				System.out.println("Salary is: "+ rs.getInt("sal"));
				System.out.println("Name is: "+ rs.getString("name"));
				System.out.println("Gender is: "+ rs.getString("gender"));
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
