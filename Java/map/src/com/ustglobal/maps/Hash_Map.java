package com.ustglobal.maps;

import java.util.HashMap;

class Hash_Map {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 2);
		hm.put("mala", 1);
		hm.put("bala", 3);
		hm.put("sheela", 2);
		hm.put("sheela", 1);
		
		System.out.println(hm);
		
		hm.put("sheela", 15);
		System.out.println(hm);
		
		hm.put("rita", 15);
		System.out.println(hm);
		
		Object x = hm.get("sheela");		// Get and value will return.,,, if key not avil will return null
		System.out.println(x);
		
		Object y = hm.get("anai");
		System.out.println(y);
		System.out.println(hm);
		
		Object xx = hm.remove("rita"); 		// Remove and value will return.,,, if key not avil will return null
		System.out.println(xx);
		System.out.println(hm);
	}
}
