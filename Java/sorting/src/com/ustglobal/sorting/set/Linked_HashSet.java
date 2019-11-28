package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(15);
		hs.add("amit");
		hs.add(false);
		hs.add(false);
		hs.add("Ashu");
		
		System.out.println(hs);
		
		System.out.println("~~~~~ For Each ~~~~~");
		for(Object o: hs) {
			System.out.println(o);
		}
		
		System.out.println("~~~~ Iterator ~~~~~");
		Iterator it =hs.iterator();
		while(it.hasNext()) {
			Object h = it.next();
			System.out.println(h);
		}
	}
}
