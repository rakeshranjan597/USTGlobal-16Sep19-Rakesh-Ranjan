package com.ustglobal.thread.pausing;

public class ThreadTest {
	public static void main(String[] args) {
	
		System.out.println("Main Started");
		MyThread t = new MyThread();
		t.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
			Thread.yield();
		}
		
		System.out.println("Main Ended");
	}
}
   