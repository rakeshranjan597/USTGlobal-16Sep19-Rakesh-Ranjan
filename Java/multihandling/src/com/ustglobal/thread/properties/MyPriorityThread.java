package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread{
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		int  p = Thread.currentThread().getPriority();
		System.out.println("Main Thread Priority: "+ p);
		
		Thread.currentThread().setPriority(7);
		int sp = Thread.currentThread().getPriority();
		System.out.println("MyPriority Thread Priority: "+ sp);
		
		MyPriorityThread mp = new MyPriorityThread();
		int q = mp.getPriority();
		System.out.println("MyPriority Thread Priority: "+ q);
		
		mp.setPriority(10);
		System.out.println("MyPriority Thread Priority: "+ mp.getPriority());
		
		System.out.println("Main Ended");
	}
}
