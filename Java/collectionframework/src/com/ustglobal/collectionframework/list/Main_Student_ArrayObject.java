package com.ustglobal.collectionframework.list;

import java.util.Arrays;

public class Main_Student_ArrayObject {
	public static void main(String[] args) {
		Object obj[] = new Object[5];
		obj[0] = new Student_ArrayObject(1, "rakesh", 64.5);
		obj[1] = new Student_ArrayObject(2, "amit", 64.5);
		obj[2] = new Student_ArrayObject(3, "ashu", 74.5);
		obj[3] = new Student_ArrayObject(4, "vikash", 84.5);
		obj[4] = new Student_ArrayObject(5, "manu", 90.5);
		
//		System.out.println(Arrays.toString(obj));
		System.out.println("~~~~~~~~~~~~~ For Loop ~~~~~~~~~~~~");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~ For Each ~~~~~~~~~~~~");
		for(Object i : obj) {
			System.out.println(i);
		}
	}
}
