package com.ustglobal.wrapperclasses;

public class TestA {
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is: "+ a);
		Integer i = a;	//	Boxing or Auto Boxing
		System.out.println("i is: "+ i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x si: "+ x);
		int y = x;		//	UnBoxing or Auto UnBoxing
		System.out.println("y is: "+ y);
		
		int value = Integer.parseInt("123");
		System.out.println(value);
		
		Boolean res = Boolean.parseBoolean("true");
		System.out.println(res);
		
		
	}
}
