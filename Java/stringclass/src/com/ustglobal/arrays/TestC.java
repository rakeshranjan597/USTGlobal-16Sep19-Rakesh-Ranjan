package com.ustglobal.arrays;
//
//public class TestC {
//	public static void main(String[] args) {
//		Student s1 = new Student(1, "arya", 78.99);
//		Student s2 = new Student(2, "nitin", 70.99);
//		Student s3 = new Student(3, "ashu", 60.45);
//		
//		Student s[] = new Student[3];
//		s[0] = s1;
//		s[1] = s2;
//		s[2] = s3;
//		
//		for(Student i: s) {
//			System.out.println(i);
//		}
//	}
//}

	class C{
		static void fun() {
			System.out.println("hii");
		}
	}
	class D extends C{
		static void fun() {
			System.out.println("Hello");
		}
	}
	class TestC extends D{
		public static void main(String[] args) {
			TestC.fun();
		}
	}
