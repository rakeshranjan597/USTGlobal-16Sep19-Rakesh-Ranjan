package com.ustglobal.jdbcapp.withoutfinally;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SelectWithTryResources {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("db2.properties");) {
			Properties pro = new Properties();
			pro.load(fr);
//			Class.forName(pro.getProperty("driver-class-name"));
			String url = pro.getProperty("url");
			String sql = pro.getProperty("select-query");
			
			try(Connection conn = DriverManager.getConnection(url, pro);
					Statement st = conn.createStatement();
					ResultSet rs = st.executeQuery(sql); 
							){
				while(rs.next()) {
					System.out.println("~~~~~~~~~~~~~~~~");
					System.out.println("Id is :"+ rs.getInt("id"));
					System.out.println("Name is :"+ rs.getString("name"));
					System.out.println("Salary is :"+ rs.getInt("sal"));
					System.out.println("Gender is :"+ rs.getString("gender"));
				}
				
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
