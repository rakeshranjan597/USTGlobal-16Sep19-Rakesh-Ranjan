package com.ustglobal.exception.first;

public class TestG {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Paytm p = new Paytm();
		try {
			p.book();
			
		} catch (ArithmeticException ae) {
			System.out.println("Exception Caught in main method ");
	
		} finally {
			System.out.println("Executed Finally");
		
		}
		System.out.println("Main Ended");
	}
}
