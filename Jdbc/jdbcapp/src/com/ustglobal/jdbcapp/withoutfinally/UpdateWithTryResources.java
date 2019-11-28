package com.ustglobal.jdbcapp.withoutfinally;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateWithTryResources {
	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("db2.properties")){
			
			Properties pro = new Properties();
			pro.load(fr);
			String url = pro.getProperty("url");
			String sql = pro.getProperty("update-query");
			
			
			try(Connection con = DriverManager.getConnection(url, pro);
					PreparedStatement ps = con.prepareStatement(sql);
					){
				
				ps.setInt(4, Integer.parseInt(args[0]));
				ps.setInt(2, Integer.parseInt(args[2]));
				ps.setString(1, args[1]);
				ps.setString(3, args[3]);
				
				
				int count = ps.executeUpdate();
				if(count!=0) {
					System.out.println(count+ " rows affected");
				}
				else {
					System.out.println("Failed to Update");
				}
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
	
	}
}
