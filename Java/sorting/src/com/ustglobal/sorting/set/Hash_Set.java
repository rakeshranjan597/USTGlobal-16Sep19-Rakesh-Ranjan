package com.ustglobal.sorting.set;

import java.util.HashSet;

public class Hash_Set {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(51.54);
		hs.add("Rakesh");
		hs.add(false);
		hs.add(null);
		hs.add(null);
		hs.add(12);
		
		System.out.println(hs);
		
		for(Object h: hs) {
			System.out.println(h);
		}
	}
}
