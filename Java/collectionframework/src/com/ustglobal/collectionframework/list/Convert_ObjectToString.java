package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
//import java.util.Arrays;

public class Convert_ObjectToString {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Shreya");
		
		Object o = al.get(0);
		String name = (String)o;	//	If it will be String generic then no need to do down Casting
		
		String s = (String)al.get(0);
		
		System.out.println(o);
		System.out.println(name.toUpperCase());
	}
}
