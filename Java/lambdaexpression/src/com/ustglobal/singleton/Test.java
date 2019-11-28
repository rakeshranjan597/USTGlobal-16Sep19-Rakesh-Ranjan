package com.ustglobal.singleton;

public class Test {
	public static void main(String[] args) {
		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "Hello";
		System.out.println("HashCode of ms: "+ms.hashCode());
		
		MySingleton mx = MySingleton.getDbConnection();
		mx.s = "Hi";
		System.out.println("HashCode of ms: "+mx.hashCode());
		
		System.out.println(ms.s);
		System.out.println(mx.s);
	}
}
