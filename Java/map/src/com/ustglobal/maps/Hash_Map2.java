package com.ustglobal.maps;

import java.util.HashMap;

public class Hash_Map2 {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku", 2);
		hm.put("mala", 1);
		hm.put("sheela", 2);
		
		HashMap hm1 = new HashMap();
		hm1.put("riya", 2);
		hm1.put("deepu", 1);
		hm1.put("kriti", 2);
		
		boolean hasKey = hm.containsKey("mala");
		System.out.println("Has Key: "+hasKey);
		
		boolean hasValue = hm.containsValue(25);
		System.out.println("Has Value: "+hasValue);
		
		hm.putAll(hm1);
		System.out.println("Copy 2nd Map to 1st Map: "+hm);
		System.out.println("Size of Map: "+hm.size());
		
//		hm.clear();			//		Delete all data of Map
		System.out.println("Is Empty? "+hm.isEmpty());
		
		
	}
}
