package com.ustglobal.mobileapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ustglobal.mobileapp.dto.Person;

public class MobileAppDAO_JDBC implements MobileAppDAO{
	
	private static final String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
	
	@Override
	public List<Person> showAllContact() {
		
		String sql = "select * from contact";
		try(Connection con = DriverManager.getConnection(url);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				) {
			
			List<Person> lt = new ArrayList<Person>(); 
			while(rs.next()) {
				Person p = new Person();
				p.setName(rs.getString("name"));
				
				lt.add(p);
			}
			
			return lt;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int addContact(Person p) {
		
		String sql = "insert into contact values(?,?,?)";
		try(Connection con = DriverManager.getConnection(url);
				PreparedStatement ps = con.prepareStatement(sql);
				) {
			ps.setString(1, p.getName());
			ps.setLong(2, p.getPnumber());
			ps.setString(3, p.getGroups());
			
			int count = ps.executeUpdate();
			return count;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteContact(String name) {

		String sql = "delete from contact where name=? ";
		try(Connection con = DriverManager.getConnection(url);
				PreparedStatement ps = con.prepareStatement(sql);
				) {
		
			ps.setString(1, name);
			int count = ps.executeUpdate();
			return count;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int editContact(Person p) {
		
		String sql = "update contact set pnumber=?, groups=? where name=? ";
		try(Connection con = DriverManager.getConnection(url);
				PreparedStatement ps = con.prepareStatement(sql);
				) {
//			ps.setString(1, p.getName());
			ps.setLong(1, p.getPnumber());
			ps.setString(2, p.getGroups());
			ps.setString(3, p.getName());
			
			int count = ps.executeUpdate();
			
			return count;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Person searchContact(String name) {
		
		String sql = "select * from contact where name=? ";
		try(Connection con = DriverManager.getConnection(url);
				PreparedStatement ps = con.prepareStatement(sql);
				) {
			ps.setString(1, name);
			
			try(ResultSet rs = ps.executeQuery()){
				
				Person p = new Person();
				if(rs.next()) {
					p.setName(rs.getString("name"));
					p.setPnumber(rs.getLong("pnumber"));
					p.setGroups(rs.getString("groups"));
				}

				return p;
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}