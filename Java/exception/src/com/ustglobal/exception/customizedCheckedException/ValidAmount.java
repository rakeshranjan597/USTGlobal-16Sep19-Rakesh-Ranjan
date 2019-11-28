package com.ustglobal.exception.customizedCheckedException;

public class ValidAmount {
	void checkAmount(int amount) throws InvalidAmountException {
		if (amount > 40000) {
			throw new InvalidAmountException();
		}
	}
}
