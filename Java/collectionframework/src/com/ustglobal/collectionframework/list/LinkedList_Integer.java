package com.ustglobal.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Integer {
	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(92);
		ll.add(21);
		ll.add(55);
		ll.add(76);
		ll.add(94);
		ll.add(34);
		
		System.out.println("Before Sorting: "+ll);
		Collections.sort(ll);	// Parameter is List.. ArrayList, LinkedList, Vector, Stack
		System.out.println("After Sorting :"+ll);
		
		Collections.reverse(ll);
		System.out.println("Reverse :"+ll);		// Parameter is List... 
		
		Collections.shuffle(ll);
		System.out.println("Sufffle :"+ll);
	}
}	
