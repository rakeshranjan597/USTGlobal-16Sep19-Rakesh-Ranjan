package com.ustglobal.thread.defining;

public class ThreadTest {
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		MyThread t1 = new MyThread();
		
//		t1.run();	//	Never Call this run() method, it behaves like normal pgm, All code will be executed inside main thread only
//		t1.run();
		
		t1.start();
//		t1.start();
	
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Ended");
		
	}
}
