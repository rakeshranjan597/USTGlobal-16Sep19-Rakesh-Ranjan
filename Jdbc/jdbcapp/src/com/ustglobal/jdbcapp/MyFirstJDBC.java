package com.ustglobal.jdbcapp;

import java.sql.*;
//import com.mysql.jdbc.Driver;

public class MyFirstJDBC {
	public static void main(String[] args) {
		
			// All 3 are interface ; declared bcz we need further
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
			
//		try {
//				// 1.	First two lines Loads the Driver
//			Driver driver = new Driver();	//	connection b/w java and dbms
//			DriverManager.registerDriver(driver);	// register the driver 
//			
//				// 2.	Get The Connection
//			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
//			
//			// mysql: which driver is it
//			// localhost: where the rdbms exists
//			// 3306: portnumber	, it is default port no. of mysql: each appl has separate port no. 
//			// ust_ty_db: database
//			
//			conn = DriverManager.getConnection(url);
//			
//				// 3.	Issue SQL Query
//			stmt = conn.createStatement();
//			String sql = "Select * from employee_info";
//			rs = stmt.executeQuery(sql);
//			
//				// 4. 	Read the Result
//			while(rs.next()) {
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				String sal = rs.getString("sal");
//				String gender = rs.getString("gender");
//				
//				System.out.println("~~~~~~~~~~~~~~~~~~~");
//				System.out.println("Id is : " + id);
//				System.out.println("Name is : " + name);
//				System.out.println("Salary is : " + sal);
//				System.out.println("Gender is : " + gender);
//			}
//		} catch(SQLException e) {
////			System.out.println(e);
//			e.printStackTrace();
//		} finally {
//			try {
//				
//				// 5.	Close the Connection
//				if(conn!= null) {
//					conn.close();
//				}
//				if(stmt!= null) {
//					stmt.close();
//				}
//				if(rs!= null) {
//					rs.close();
//				}
//			} catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		
		
		try {
			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			String sql = "select * from employee_info order by sal";
			ResultSet r = st.executeQuery(sql);
			
			System.out.println("~~~~~~~~~ Without Driver ~~~~~~~~~ ");
			while(r.next()) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~");
				System.out.println(" Id is :"+ r.getInt(1));
				System.out.println(" Name is :"+ r.getString(2));
				System.out.println(" Salary is :"+ r.getInt(3));
				System.out.println(" Gender is :"+ r.getString(4));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
			//		Insertion
//		
//		try {
//			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
//			String username = "root";
//			String password = "root";
//			Connection con = DriverManager.getConnection(url, username, password);
//			Statement st = con.createStatement();
//			String sql = "insert into employee_info values(55, 'ramesh', 40000, 'M' )";
//			int r = st.executeUpdate(sql);
//			if(r!=0) {
//				System.out.println("Data Inserted");
//			} else {
//				System.out.println("Data Not Inserted");
//			}
//			
//		} catch(SQLException e) {
//			e.printStackTrace();
//		}
		
	}
}
