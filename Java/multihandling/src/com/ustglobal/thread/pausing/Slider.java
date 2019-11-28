package com.ustglobal.thread.pausing;

public class Slider {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		for(int i=0; i<5; i++) {
			System.out.println(" Sliding ");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main Ended");
	}
}	

/*

1. Yield :-		It pause the execution of the current thread and allow other thread which has same or high priority
2. Join :- 		It pause the execution of the current thread and allow waits for
3. Sleep:-		It pause the execution of the current thread at a 

*/