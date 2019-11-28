package com.ustglobal.sorting.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LaptopTest {
	public static void main(String[] args) {
		LinkedList<Laptop> ll = new LinkedList<Laptop>();
		Laptop l1 = new Laptop(55000, 6, "HP");
		Laptop l2 = new Laptop(45000, 8, "Dell");
		Laptop l3 = new Laptop(95000, 12, "Mac");
		Laptop l4 = new Laptop(35000, 4, "Asus");
		Laptop l5 = new Laptop(25000, 2, "Lenovo");
		
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		ll.add(l4);
		ll.add(l5);
//		System.out.println(ll);
		System.out.println("~~~~~~~~ Before Sorting ~~~~~~~");
		displayLaptopDetails(ll);
		
		Collections.sort(ll);	// Sorting Here
		
		System.out.println();
		System.out.println("~~~~~~~~ After Sorting ~~~~~~~~");
		displayLaptopDetails(ll);
	}
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp = it.next();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("   Name is: "+lp.name);
			System.out.println("   Ram is: "+lp.ram);
			System.out.println("   Price is: "+lp.price);
		}
	}
}
