package com.ust_global.objectclass;

public class TestA {
	public static void main(String[] args) {
		
		PenDrive p =new PenDrive();
		USBport.connect(p);
		
		Mouse m = new Mouse();
		USBport.connect(m);
	}
}
