package com.ustglobal.rmsspringmnvc.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.ToString.Exclude;

@Entity
@Table(name="retailer")
public class RetailerBean {
	
	@Id
	@Column
	@GeneratedValue
	private int rid;
	@Column
	private String name;
	@Column(unique = true)
	private String email;
	@Column
	private String password;
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
