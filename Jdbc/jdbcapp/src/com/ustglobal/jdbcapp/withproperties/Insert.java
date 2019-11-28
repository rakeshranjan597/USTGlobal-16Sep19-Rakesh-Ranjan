package com.ustglobal.jdbcapp.withproperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Insert {
	public static void main(String[] args) {
		
		Properties pro = new Properties();
		pro.put("user", "root");
		pro.put("password", "root");
		String url = "jdbc:mysql://localhost:3306/ust_ty_db";
		
		String sql = "insert into employee_info values(99,'ramesh', 150 , 'M')";
		
		try(Connection con = DriverManager.getConnection(url, pro);
				Statement st = con.createStatement();
				){
			int count = st.executeUpdate(sql);
			
			if(count!=0)
				System.out.println(count + " Rows Inserted ");
			else
				System.out.println("Failed to Insert");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
