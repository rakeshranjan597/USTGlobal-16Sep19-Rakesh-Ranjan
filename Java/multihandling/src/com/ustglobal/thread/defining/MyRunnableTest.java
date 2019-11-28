package com.ustglobal.thread.defining;

public class MyRunnableTest {
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		MyRunnable t1 = new MyRunnable();
		
		Thread t  = new Thread(t1);
		
		t.start();
		
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Started");
		
	}
}