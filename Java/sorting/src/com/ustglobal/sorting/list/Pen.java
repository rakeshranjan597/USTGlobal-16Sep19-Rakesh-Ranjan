package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {
	double price;
	String brand;
	String color;
	
	public Pen(double price, String brand, String color) {
		super();
		this.price = price;
		this.color = color;
		this.brand = brand;
	}

			//	Sorting Based on Price
//	@Override
//	public int compareTo(Pen p) {
//		Double i = this.price;
//		Double j = p.price;
//		return i.compareTo(j);
//	}
	
	
			//	Sorting Based on Brand
//	@Override
//	public int compareTo(Pen p) {
//		String i = this.brand;
//		String j = p.brand;
//		return i.compareTo(j);
//	}
	
	
			//	Sorting Based on Color
	@Override
	public int compareTo(Pen p) {
		String i = this.color;
		String j = p.color;
		return i.compareToIgnoreCase(j);
	}
	
}
