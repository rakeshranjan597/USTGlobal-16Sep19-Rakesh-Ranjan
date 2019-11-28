package com.ustglobal.thread.pausing;

public class Counter {
	int v;
	
	//	synchronized:-		Used to reduce the race condition
	
	synchronized public void increment() {
		v++;
	}
	
	synchronized public void decrement() {
		v--;
	}
	
	synchronized public void showValue() {
		System.out.println("V value is: "+ v);
	}
}
