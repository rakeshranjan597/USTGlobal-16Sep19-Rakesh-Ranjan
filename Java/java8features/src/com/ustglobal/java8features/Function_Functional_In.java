package com.ustglobal.java8features;

import java.util.function.Function;

public class Function_Functional_In {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		Integer res = f.apply(4);
		System.out.println("Square of no is : "+res);
	}
}
