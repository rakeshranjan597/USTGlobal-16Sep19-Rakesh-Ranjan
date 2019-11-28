package com.ustglobal.exception.first;

public class ArrayIndexOutOfBounds_Exception {
	public static void main(String[] args) {
		System.out.println("Main Started");
		int arr[] = {10,20,30};
		int a = 10;
		int b = 0;
		try {
			System.out.println(arr[3]);
			b = 10/0;
			System.out.println(b);	
			System.out.println(arr[1]);
			System.out.println(arr[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of Bound Exception");
		}
		finally {
			System.out.println("fdj");
		}
		System.out.println("Main Ended");
	}
}
