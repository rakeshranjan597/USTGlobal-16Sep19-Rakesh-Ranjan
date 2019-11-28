package com.ustglobal.accessmodifier.pkg2;

import com.ustglobal.accessmodifier.pkg1.Sample;

public class Run {
	public static void main(String[] args) {
		Demo d = new Demo();
		//	Private
//		System.out.println(d.a);
//		d.add();
		
//		Sample s = new Sample();
//		System.out.println();
//		s.sub();
		
		/*
		//	Default
		System.out.println(d.b);
		d.sub();
		*/
		
		//	Protected
		System.out.println(d.c);
		d.mul();
		
		//	Public
		System.out.println(d.name);
		d.div();
	}
}
