package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Entry {
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("Patna", 8000014);
		lhm.put("Haryana", 134203);
		lhm.put("Bangalore", 560076);
		System.out.println(lhm);
		
		for(Map.Entry<String, Integer> m: lhm.entrySet() ) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.print("Key is: "+key);
			System.out.println(" ~~~~ Value is: "+ value +"");
		}
	}
	
}
