package com.ustglobal.java8features;

import java.util.function.Predicate;

public class Predicate_Functional_In {
	public static void main(String[] args) {
		
		//	Used to stored the lambda Expression
		Predicate<Integer> p = i -> {
			if(i%2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		
		boolean res = p.test(11);
		System.out.println(res);
	}
}
