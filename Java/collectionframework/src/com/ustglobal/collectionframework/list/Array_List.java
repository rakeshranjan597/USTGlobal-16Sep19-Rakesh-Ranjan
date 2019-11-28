package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class Array_List {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(15);
		al.add(0,60.5);
		al.add("Rakesh");
		al.add(null);
		al.add(true);
		al.add(false);
		al.add('s');
//		al.add('raj');		// Error raj is not char
		System.out.println(al);
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("~~~~~~~~~~~~~~~");
		
		for(Object o : al) {
			System.out.println(o);
		}
	}
}
