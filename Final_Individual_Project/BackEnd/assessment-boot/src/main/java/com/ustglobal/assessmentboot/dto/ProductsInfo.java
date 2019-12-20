package com.ustglobal.assessmentboot.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name = "products_info")
public class ProductsInfo {
	@Id
	@Column
	@GeneratedValue
	private int pid;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private String company;
	@Column
	private int quantity;
	@Column
	private double price;
	
	@Exclude
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "productInfo")
	private List<OrderInfo> orderInfo;
	
}
