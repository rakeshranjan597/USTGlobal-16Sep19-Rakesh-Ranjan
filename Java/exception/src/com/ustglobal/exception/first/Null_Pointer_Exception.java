package com.ustglobal.exception.first;

public class Null_Pointer_Exception {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		String s = "";		//	Empty string wont raise exception
		System.out.println(s.toUpperCase());
		
		String s2 = null;		//	Exception Occurs
		try {
			System.out.println(s2.toUpperCase());
		} catch(NullPointerException npe) {
			System.out.println("Null Pointer Exception Occured");
		}
		
	}
}
