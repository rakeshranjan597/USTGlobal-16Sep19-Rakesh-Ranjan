package com.ustglobal.jdbcapp.withproperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class delete {
	public static void main(String[] args) {
		
		Properties pro = new Properties();
		pro.put("user", "root");
		pro.put("password", "root");
		String url = "jdbc:mysql://localhost:3306/ust_ty_db";
		
		String sql = "delete from employee_info where id = 60";
		
		try(Connection con = DriverManager.getConnection(url, pro);
				Statement st = con.createStatement();
				){
			int count = st.executeUpdate(sql);
			
			if(count!=0)
				System.out.println(count + " Rows Inserted ");
			else
				System.out.println("Failed to Delete");
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
