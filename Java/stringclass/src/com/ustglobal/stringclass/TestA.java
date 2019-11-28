package com.ustglobal.stringclass;

public class TestA {
	public static void main(String[] args) {
		String s1 = "aishu";
		String s2 = "deepika";
		
		String s3 = new String("aishu");
		String s4 = new String("aishu");
		String s5 = "aishu";
		
		System.out.println(s1==s2);		// false	because two different object
		System.out.println(s3==s4);		// false	because two different object
		System.out.println(s1==s5);		// true		because referencing same object
		
		System.out.println(s1.equals(s2));		// false
		System.out.println(s3.equals(s4));		// true
		System.out.println(s1.equals(s5));		// true
		
		String s6 = s1.toLowerCase();		// Create different object
		System.out.println(s6);
		String s7 = s1.toUpperCase();		// Create different object
		System.out.println(s7);
		char c = s1.charAt(0);
		System.out.println(c);
		
		boolean b = s1.equalsIgnoreCase("AIShu"); 
		System.out.println(b);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		StringBuffer sb1 = new StringBuffer("rak");
		System.out.println(sb1);
		sb1.append("esh");
		sb1.append("ranjan");
		System.out.println(sb1);
		
	}
}
