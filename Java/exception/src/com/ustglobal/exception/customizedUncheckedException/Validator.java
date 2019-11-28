package com.ustglobal.exception.customizedUncheckedException;

public class Validator {
	void verify(int age) {
		if (age<18) { 
			throw new InvalidAgeException(" Better Luck Next Time !!");
		}
	}
}
