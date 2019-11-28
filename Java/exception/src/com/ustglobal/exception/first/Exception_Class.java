package com.ustglobal.exception.first;

public class Exception_Class {
	public static void main(String[] args) {
		System.out.println("Main Started");
		int a[] = {10,11,12};
		String s = null;
		try {
			System.out.println(a[5]);		// If error occurred here rest code will never be executed
			System.out.println(15/0);
			System.out.println(s.toLowerCase());
			
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();		//		It will also trace in which line getting Exception
			System.out.println(ai);		//		It will only find the Exception 
//			System.out.println("Array Index Out of Bound Exception Occurred");
			
		} catch (ArithmeticException ae) {
			System.out.println("Zero Division Exceotion Occured");
		
		} catch (NullPointerException npe) {
			System.out.println("Null Pointer Exception Occured");
		
		} catch (Exception e) {			//		This Exception must use at the end of code, otherwise raise error
			System.out.println(e);		//		It is already handled by the catch block like
		} 								//		ArrayIndexOutOfBoundsException, ArithmeticException, NullPointerException
	}
}
