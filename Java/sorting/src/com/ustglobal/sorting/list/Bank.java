package com.ustglobal.sorting.list;

public class Bank /*implements Comparable<Bank>*/{
	String name;
	int pincode;
	long micr;
	
	public Bank(String name, int pincode, long micr) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.micr = micr;
	}

//	@Override
//	public int compareTo(Bank o) {
//		String p = this.name;
//		String q = o.name;
//		return p.compareTo(q);
//	}
	
}
