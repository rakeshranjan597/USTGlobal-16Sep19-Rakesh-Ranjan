package com.ustglobal.exception.first;

public class MultipleException {
	public static void main(String[] args) {
		System.out.println("Main Started");
		int a[] = {10,11,12};
		String s = null;
		try {
			System.out.println(a[5]);		// If error occurred here rest code will never be executed
//			System.out.println(15/0);
//			System.out.println(s.toLowerCase());
			
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//			e.printStackTrace();
			System.out.println(e);	
		}
		System.out.println("Main Ended");
	}
}
