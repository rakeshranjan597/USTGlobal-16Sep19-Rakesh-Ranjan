package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(15);
		ts.add(24);
		ts.add(64);
		ts.add(7);
//		ts.add("rakesh");	//	ClassCastException
		
		System.out.println(ts);
		
		System.out.println("~~~~~ For Each ~~~~~");
		for(Object o: ts) {
			System.out.println(o);
		}
		
		System.out.println("~~~~ Iterator ~~~~~");
		Iterator it =ts.iterator();
		while(it.hasNext()) {
			Object h = it.next();
			System.out.println(h);
		}
	}
}
