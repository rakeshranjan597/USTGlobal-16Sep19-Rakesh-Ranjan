package com.ustglobal.lambdaexpressions;

public class TestFactorial {
	public static void main(String[] args) {
		FactorialInterface fact = (n)-> {
			int f = 1;
			for(int i=2; i<=n; i++) {
				f *= i;
			}
			return f;
		};
		System.out.println("Factorail is: "+fact.factorial(5));
	}
}
