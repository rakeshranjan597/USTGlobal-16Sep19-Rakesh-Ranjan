package com.ust_global.objectclass;

public class New_Imp_HashCode_ToString {
	public static void main(String[] args) {
		Car c1 = new Car(10000, "BMW", "Black");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(c1.hashCode());
		System.out.println(c1.toString());

		Car c2 = new Car(20000, "Audi", "MattBlack");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(c2.hashCode());
		System.out.println(c2.toString());
		
		Car c3 = new Car(30000, "Xylo", "White");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(c3.hashCode());
		System.out.println(c3.toString());
		
	}
}
