package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
	double price;
	int ram;
	String name;
	
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

//	@Override
//	public String toString() {
//		return "Laptop [price=" + price + ", ram=" + ram + ", name=" + name + "]";
//	}

	
		//		Sorting Based on RAM
//	@Override
//	public int compareTo(Laptop lt) {
//		Integer i = this.ram;
//		Integer j = lt.ram; 
//		return i.compareTo(j);
//	}
	
		
		//		Sorting Based on Price
//	@Override
//	public int compareTo(Laptop lt) {
//		Double i = this.price;
//		Double j = lt.price; 
//		return i.compareTo(j);
//	}
	
	
		//		Sorting Based on Brand Name
	@Override
	public int compareTo(Laptop lt) {
		String i = this.name;
		String j = lt.name; 
		return i.compareTo(j);
	}
	
	
}
