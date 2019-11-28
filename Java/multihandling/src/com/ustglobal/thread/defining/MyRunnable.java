package com.ustglobal.thread.defining;

public class MyRunnable extends Thread implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}

}
