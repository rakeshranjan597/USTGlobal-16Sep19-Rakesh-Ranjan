package com.ustglobal.thread.pausing;

public class Myjointhread extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");

			try {
				Thread.sleep(1000);		//		sleep()... is static method
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
