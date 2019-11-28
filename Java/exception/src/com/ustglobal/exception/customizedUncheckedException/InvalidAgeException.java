package com.ustglobal.exception.customizedUncheckedException;

public class InvalidAgeException extends RuntimeException{
	String message = "Invalid age below 18 yrs not allowed";
	
	public InvalidAgeException() {

	}
	
	public InvalidAgeException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
}
