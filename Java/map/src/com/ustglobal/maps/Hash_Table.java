package com.ustglobal.maps;

import java.util.Hashtable;

public class Hash_Table {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(101, "ajay");
		ht.put(105, "vijay");
		ht.put(104, "shankar");
		ht.put(103, "ravi");
		ht.put(102, "sanjay");
//		ht.put(102, null);		//	NullPointerException
//		ht.put(null, "raj");	//	NullPointerExceptiont
		
		System.out.println(ht);
	}
}
