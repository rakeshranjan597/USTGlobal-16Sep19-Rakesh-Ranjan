package com.ustglobal.exception.customizedUncheckedException;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		Validator v = new Validator();
		try {
			v.verify(12);
		} catch(InvalidAgeException ie) {
			System.out.println("Exception Occurred");
		}
		
			v.verify(13);
		
		System.out.println("Main Ended");
	}
}
