package com.ustglobal.jdbcapp.csvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InsertWithCsvFile {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);
				Connection conn = DriverManager.getConnection(url);
				PreparedStatement ps = conn.prepareStatement(sql);
				) {
			
			while(reader.ready()) {
				
				String line = reader.readLine();
				String[] datas = line.split(",");
				
				int id = Integer.parseInt(datas[0]);
				String name = datas[1];
				int sal = Integer.parseInt(datas[2]);
				String gender = datas[3];
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, sal);
				ps.setString(4, gender);
				
				ps.addBatch();
				
//				int count = ps.executeUpdate();
//				if(count!=0) {
//					System.out.println(count+ "Row Inserted!!!");
//				} else {
//					System.out.println("Failed to Insert!!!");
//				}
				
			}
			int count[] = ps.executeBatch();
			System.out.println(count.length+" rows inserted");
			
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
