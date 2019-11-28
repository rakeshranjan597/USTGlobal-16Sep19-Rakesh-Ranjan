package com.ustglobal.collectionframework.list;

class A {
	private void fun() {
		System.out.println("Fun 1");
	}
}
class Test extends A {
	private void fun() {
		System.out.println("Fun 2");
	}
	
	public static void main(String[] args) {
		A t = new A();
//		t.fun();
	} 
	
}
