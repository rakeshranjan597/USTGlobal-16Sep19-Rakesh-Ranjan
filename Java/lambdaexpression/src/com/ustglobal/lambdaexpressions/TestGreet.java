package com.ustglobal.lambdaexpressions;

public class TestGreet {
	public static void main(String[] args) {
		GreetInterface gre = ()-> {
			System.out.println("Hii");
			System.out.println("Hello");
		};
		gre.greet();
	}
}
