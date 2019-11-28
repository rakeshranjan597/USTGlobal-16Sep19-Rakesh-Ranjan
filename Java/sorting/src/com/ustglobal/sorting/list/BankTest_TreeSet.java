package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class BankTest_TreeSet {
	public static void main(String[] args) {
		
//		Bank_SortByName sbn = new Bank_SortByName();
//		TreeSet<Bank> ts = new TreeSet<>(sbn);
		
//		Bank_SortByPinCode sbpc = new Bank_SortByPinCode();
//		TreeSet<Bank> ts = new TreeSet<>(sbpc);
		
		Bank_SortByMicr sbm = new Bank_SortByMicr();
		TreeSet<Bank> ts = new TreeSet<>(sbm);
		
		
		Bank b1 = new Bank("HDFC", 560076, 845798456);		
		Bank b2 = new Bank("SBI", 560056, 845798454);
		Bank b3 = new Bank("CBI", 560096, 84579846);
		Bank b4 = new Bank("ICIC", 560066, 845798486);
		Bank b5 = new Bank("ICIC", 560066, 845798486);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("~~~~~~~~ Using Iterator ~~~~~~~~");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("   Name is: "+b.name);
			System.out.println("   Pincode is: "+b.pincode);
			System.out.println("   MICR is: "+b.micr);
		}
	}
}
