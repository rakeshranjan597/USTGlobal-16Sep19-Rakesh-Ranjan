package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_Collect_Method {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(50);
		al.add(80);
		al.add(30);
		al.add(85);
		al.add(25);
		al.add(75);
		
		System.out.println("Before Sorting: "+al);
		
		List<Integer> sortedList = al.stream().sorted().collect(Collectors.toList());
		
		System.out.println("After Sorting: "+sortedList);
	}
}
