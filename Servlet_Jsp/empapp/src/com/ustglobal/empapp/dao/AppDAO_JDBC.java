package com.ustglobal.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.ustglobal.empapp.dto.EmployeeBean;

public class AppDAO_JDBC implements EmployeeDAO {
	
	public ArrayList<EmployeeBean> selectEmp() {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
					
			conn = DriverManager.getConnection(url);
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			ArrayList<EmployeeBean> result = new ArrayList<>();
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int salary = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				bean.setId(id);
				bean.setName(name);
				bean.setSal(salary);
				bean.setGender(gender);
				
				result.add(bean);
			}
			return result;
			
		} catch(Exception e) {
			System.out.println(e);
			return null;
			
		} finally {
			try {
				if(conn!=null)
					conn.close();
				if(st!=null)
					st.close();
				if(rs!=null)
					rs.close();
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public EmployeeBean searchEmp(int id) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id=?";
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			conn = DriverManager.getConnection(url);
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				
				return bean;
			} else {
				return null;
			}
			
		} catch(Exception e) {
			System.out.println(e);
			return null;
			
		} finally {
			try {
				if(conn!=null)
					conn.close();
				if(ps!=null)
					ps.close();
				if(rs!=null)
					rs.close();
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}

	public int insertEmp(EmployeeBean bean) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values(?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DriverManager.getConnection(url);
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bean.getId());
			ps.setString(2, bean.getName());
			ps.setInt(3, bean.getSal());
			ps.setString(4, bean.getGender());
			
			int count = ps.executeUpdate();
			return count;
		
		} catch(Exception e) {
			System.out.println(e);
		
		} finally {
			try {
				if(conn!=null)
					conn.close();
				if(ps!=null)
					ps.close();
				
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		
		return 0;
	}

	public int updateEmp(EmployeeBean bean) {	
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";
		Connection conn = null;
		Statement st = null;
		try {
			conn = DriverManager.getConnection(url);
			st = conn.createStatement();
			int count = st.executeUpdate(sql);
			if(count!=0)
				System.out.println(count+" rows Aftected!!");
			else
				System.out.println("Failed to Update");
		
		} catch(Exception e) {
			System.out.println(e);
		
		} finally {
			try {
				if(conn!=null)
					conn.close();
				if(st!=null)
					st.close();
				
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		
		return 0;
	}

	public int deleteEmp(int id) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "delete from employee_info where id = ?";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DriverManager.getConnection(url);
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int count = ps.executeUpdate();
			
			return count;
		
		} catch(Exception e) {
			System.out.println(e);
		
		} finally {
			try {
				if(conn!=null)
					conn.close();
				if(ps!=null)
					ps.close();
				
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		return 0;
	}
	
}
