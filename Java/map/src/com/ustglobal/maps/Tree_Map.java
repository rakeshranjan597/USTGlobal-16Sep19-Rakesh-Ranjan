package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
	public static void main(String[] args) {
	
		//	Other Than Generic , it will raise an error
		TreeMap<String, Integer> lhm = new TreeMap<>();
		lhm.put("Patna", 8000014);
		lhm.put("Haryana", 134203);
		lhm.put("Bangalore", 560076);
//		lhm.put(null, 560076);		//	NullPointerException
		
		System.out.println(lhm);
		
		for(Map.Entry<String, Integer> m: lhm.entrySet() ) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.print("Key is: "+key);
			System.out.println(" ~~~~ Value is: "+ value +"");
		}
	}
}
