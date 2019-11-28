package com.ustglobal.exception.first;

public class Paytm {
	void book() {
		System.out.println("Paytm Started");
		
		IRCTC i = new IRCTC();
		i.confirm();
		
		System.out.println("Paytm Ended");
	}
}
