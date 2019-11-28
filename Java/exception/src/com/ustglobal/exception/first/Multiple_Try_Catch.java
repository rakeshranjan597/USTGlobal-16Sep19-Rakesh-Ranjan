package com.ustglobal.exception.first;

public class Multiple_Try_Catch {
	public static void main(String[] args) {
		System.out.println("~~~Main Started~~~");
		int a[] = {10,20,30};
		int b = 50;
		try {
			System.out.println(b/1);
		}catch(ArithmeticException ae){
			System.out.println("No divided by zero");
		}
		
		try {
			System.out.println(a[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index not present");
		}
		System.out.println("~~~Main Ended~~~");
	}
}
