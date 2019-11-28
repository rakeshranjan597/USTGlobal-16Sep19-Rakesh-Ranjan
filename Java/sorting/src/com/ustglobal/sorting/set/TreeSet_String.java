package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_String {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("roopa");
		ts.add("jaya");
		ts.add("sushma");
		ts.add("munni");
		ts.add("sheela");
		
		System.out.println(ts);
		
		System.out.println("~~~~~ For Each ~~~~~");
		for(Object o: ts) {
			System.out.println(o);
		} 
		
		System.out.println("~~~~ Iterator ~~~~~");
		Iterator<String> it =ts.iterator();
		while(it.hasNext()) {
			Object h = it.next();
			System.out.println(h);
		}
	}
}
