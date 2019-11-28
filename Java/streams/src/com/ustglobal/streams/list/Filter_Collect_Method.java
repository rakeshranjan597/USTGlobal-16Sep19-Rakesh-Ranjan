package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Collect_Method {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		
		List<Integer> l = al.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(l);
		
		for(Integer i : l) {
			System.out.println(i);
		}
	}
}
