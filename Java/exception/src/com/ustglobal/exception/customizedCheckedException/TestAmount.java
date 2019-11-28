package com.ustglobal.exception.customizedCheckedException;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		ValidAmount va = new ValidAmount();
		try {
			va.checkAmount(50000);
			System.out.println("Withdraw your cash");
		} catch(InvalidAmountException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Main Ended");
	}
}
