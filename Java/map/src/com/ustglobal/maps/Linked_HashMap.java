package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class Linked_HashMap {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("Patna", 8000014);
		lhm.put("Haryana", 134203);
		lhm.put("Bangalore", 560076);
		
		System.out.println(lhm);
		
		Set<String> s = lhm.keySet();
		System.out.println("~~~~~ Key of Map ~~~~~");
		for(String key: s) {
			System.out.println("  Key is: "+key);
		}
		
		Collection<Integer> c = lhm.values();
		System.out.println("\n~~~~~ Value of Map ~~~~~");
		for(Integer val: c) {
			System.out.println("  Value is: "+val);
		}
		
	}
}
