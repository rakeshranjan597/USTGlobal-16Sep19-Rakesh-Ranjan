package com.ustglobal.jdbcapp.withoutfinally;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class DeleteWithTryResources {
	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("db2.properties")) {
			Properties pro = new Properties();
			pro.load(fr);
			String url = pro.getProperty("url");
			String sql = pro.getProperty("delete-query");
			try(Connection conn = DriverManager.getConnection(url, pro);
					Statement st = conn.createStatement();
					){
				int count = st.executeUpdate(sql);
				if(count!=0) {
					System.out.println(count+" Rows Affected!!");
				} else {
					System.out.println("Failed to delete");
				}
				
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
