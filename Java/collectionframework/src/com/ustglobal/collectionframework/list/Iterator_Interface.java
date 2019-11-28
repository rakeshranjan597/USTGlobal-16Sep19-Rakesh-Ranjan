package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Interface {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(60.5);
		al.add("Rakesh");
		al.add(true);
		
		Iterator i = al.iterator();
		
		Object o1 = i.next();
		System.out.println(o1);
		
		Object o2= i.next();
		System.out.println(o2);
		
		Object o3 = i.next();
		System.out.println(o3);
		
		Object o4 = i.next();
		System.out.println(o4);
		
		System.out.println("~~~ Using Iterator ~~~");
		Iterator it = al.iterator();
		while(it.hasNext()) {
		
			Object o = it.next();
			System.out.println(o);
		}
		
		
		
		
	}
}
