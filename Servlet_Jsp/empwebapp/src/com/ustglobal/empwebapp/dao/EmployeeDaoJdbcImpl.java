package com.ustglobal.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ustglobal.empwebapp.dto.EmployeeInfo;

public class EmployeeDaoJdbcImpl implements EmployeeDAO {
	private static final String url = "jdbc:mysql://localhost:3306/empwebapp?user=root&password=root";
	private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	
	private static final String SELECT_SQL = "select * from emp where id=?";
	private static final String INSERT_SQL = "insert into emp values(?,?,?,?)";
	private static final String UPDATE_SQL = "update emp set password=? where id=?";
	
	
	@Override
	public EmployeeInfo auth(int id, String password) {
		EmployeeInfo info = searchEmployee(id);
		if(info!=null) {
			String pass = info.getPassword();
			if(pass.equals(password)) {
				return info;
			}
		}
		return null;
	}
	
	@Override
	public EmployeeInfo searchEmployee(int id) {
		String sql = SELECT_SQL;
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement ps = conn.prepareStatement(sql);
					){
				ps.setInt(1, id);
				try(ResultSet rs = ps.executeQuery()){
					if(rs.next()) {
						EmployeeInfo info = new EmployeeInfo();
						info.setId(rs.getInt("id"));
						info.setName(rs.getString("name"));
						info.setEmail(rs.getString("email"));
						info.setPassword(rs.getString("password"));
						
						return info;
					} else {
						return null;
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean changePassword(int id, String password) {
		String sql = UPDATE_SQL;
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement ps = conn.prepareStatement(sql);
					){
				ps.setString(1, password);
				ps.setInt(2, id);
				int count = ps.executeUpdate();
				boolean check = count > 0 ? true : false;
				return check;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean registrationEmployee(EmployeeInfo info) {
		String sql = INSERT_SQL;
		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(url);
					PreparedStatement ps = conn.prepareStatement(sql);
					){
				ps.setInt(1, info.getId());
				ps.setString(2, info.getName());
				ps.setString(3, info.getEmail());
				ps.setString(4, info.getPassword());
				
				int count = ps.executeUpdate();
				if(count>0) {
					return true;
				} else {
					return false;
				}		
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
