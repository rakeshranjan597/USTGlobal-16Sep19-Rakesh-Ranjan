package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class ArrayList_Generic {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rakesh");
		al.add("Shani");
		al.add("Vikash");
		al.add("Ashu");
		
		System.out.println(al);
		
		String s = al.get(2);	//	Directly store into String because String typed Object
		System.out.println(s.toUpperCase());
		
		Object o = al.get(1);	//  Now storing String into Object class: UpCasting
		String st = (String)o;	//	Converting Object Class into String Class: DownCasting

		System.out.println(o);
		
		System.out.println(st.toUpperCase());
		
	}
}
