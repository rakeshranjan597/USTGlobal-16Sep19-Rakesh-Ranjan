package com.ustglobal.exception.first;

public class Arithmetic_Exception {
	public static void main(String[] args) {
		System.out.println("Main Started");
		int a[] = {10,20,30};
		int b = 10;
		try {
			System.out.println(b/0);
			System.out.println(a[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index not present");
		}catch(ArithmeticException ae){
			System.out.println("No divided by zero");
		}
		System.out.println("Main Ended");
	}
}
