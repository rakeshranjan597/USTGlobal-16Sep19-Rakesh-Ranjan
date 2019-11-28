package com.ustglobal.thread.pausing;

public class MyJoinThread_Test {
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		Myjointhread t = new Myjointhread();
		
		t.start();
		
		try {
			t.join(10000);
	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Ended");
	}
	
}
