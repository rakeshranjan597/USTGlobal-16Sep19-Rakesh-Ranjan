package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Scanner Class");

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Age is: " + age);
		sc.nextLine();
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Age is: " + name);
		
		System.out.print("Enter Boolean: ");
		Boolean bool = sc.nextBoolean();
		System.out.println("Age is: " + bool);
		// Other than true/false := Exception will raise..... InputMismatchException
	}
}
