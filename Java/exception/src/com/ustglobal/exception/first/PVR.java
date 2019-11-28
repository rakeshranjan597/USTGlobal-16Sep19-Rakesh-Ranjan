package com.ustglobal.exception.first;

public class PVR {
	void book() {
		try {
			System.out.println("Booking Started");
			System.out.println(15/0);
			System.out.println("Implementation Part");
			System.out.println("Booking Accepted");
		
		} catch (ArithmeticException e) {
			System.out.println("Booking Failed Bcz of Some Exception");
			throw e;
		}
	}
}
