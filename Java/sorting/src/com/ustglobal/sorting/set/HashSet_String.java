package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_String {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("rakesh");
		hs.add("amit");
		hs.add("Vikash");
		hs.add("Ashu");
		
		System.out.println(hs);
		
		System.out.println("~~~~~ For Each ~~~~~");
		for(Object o: hs) {
			System.out.println(o);
		}
		
		System.out.println("~~~~ Iterator ~~~~~");
		Iterator<String> it =hs.iterator();
		while(it.hasNext()) {
			Object h = it.next();
			System.out.println(h);
		}
		
	}
}
