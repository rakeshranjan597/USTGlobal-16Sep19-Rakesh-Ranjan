package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Min_Max_Method {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(50);
		al.add(80);
		al.add(30);
		al.add(85);
		al.add(25);
		al.add(75);
		
		Comparator<Integer> cmp = (a,b) -> {
			if(a > b) {
				return 1;
			} else if (a < b) {
				return -1;
			} else {
				return 0;
			}
		};
		
		
		Integer minVal = al.stream().min(cmp).get();
		System.out.println("Min Value: "+minVal);
		
		Integer maxVal = al.stream().max(cmp).get();
		System.out.println("Max Value: "+maxVal);
		
	}
}
