package com.ustglobal.thread.pausing;

public class TestA {
	public static void main(String[] args) throws InterruptedException {
		Object obj1 = new Object();
		Object obj2 = new Object();

		Runnable r1 = () -> {
			synchronized (obj1) {
				System.out.println("T1 Started");
				System.out.println("T1 has locked Obj1");

				try {
					// wait(), notify(), notifyALl() must write inside synchronized
					obj1.wait();	//	pauses, the current execution... wait and release the lock

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
				synchronized (obj2) {
					System.out.println("T1 has locked Obj2");
				}
			}
			System.out.println("T1 finished");
		};
		
		Runnable r2 = () -> {
			synchronized (obj2) {
				
				System.out.println("T2 Started");
				System.out.println("T2 has locked Obj2");
				
				synchronized (obj1) {
					System.out.println("T2 has locked Obj1");
//					obj1.notify();	//	Wakes up a single thread that is waiting on this object's
					obj1.notifyAll();	//	Wakes up all threads that are waiting on this object's monitor.
				}
			}
			System.out.println("T2 finished");
		};
		Thread.sleep(1500);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
	} 
}
