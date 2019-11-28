package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Double {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(15.5);
//		al.add(15.5);
		al.add(55.5);
//		al.add(null);
		al.add(null);
		
		System.out.println(al);	// internally calls the toString & toString is fully classified class & hexadecimal code
//		System.out.println(al.contains(15.45));
		
		List<Double> l = new ArrayList<Double>();
		l.add(35.41);
		l.add(15.5);
		l.add(15.5);
		l.add(55.5);
		l.add(153.2);
		
//		l.addAll(al);
//		System.out.println(l);
		
//		l.removeAll(al);
//		System.out.println(l);
				
		System.out.println(l.containsAll(al));
	}
}
