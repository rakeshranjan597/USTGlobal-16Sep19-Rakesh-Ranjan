package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Map_Collect_Method {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
		List<Integer> l = al.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(l);
		
		for(Integer i : l) {
			System.out.println(i);
		}
	}
}
