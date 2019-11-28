package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reduce_Method {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
			
		Optional<Integer> l2 = al.stream().reduce((i,j) -> i+j );
		System.out.println("Sum is: "+ l2);
		
	}
}
