package com.ust_global.objectclass;

public class TestB {
	public static void main(String[] args) {
		Pen p = new Pen();
		System.out.println("hashCode is :"+p.hashCode());
		
		Pen q = new Pen();
		System.out.println("hashCode is :"+q.hashCode());
	}
}
