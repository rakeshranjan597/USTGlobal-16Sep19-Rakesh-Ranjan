package com.ustglobal.exception.customizedCheckedException;

public class InvalidAmountException extends Exception {
	
	private String message = "Daily limit is 40000";
	
	@Override
	public String getMessage() {
		return message;
	}
}
