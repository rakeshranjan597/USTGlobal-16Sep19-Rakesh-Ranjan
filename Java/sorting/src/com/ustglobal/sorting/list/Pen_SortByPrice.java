package com.ustglobal.sorting.list;

import java.util.Comparator;

public class Pen_SortByPrice implements Comparator<Pen> {

	@Override
	public int compare(Pen p1, Pen p2) {
		if(p1.price > p2.price) {
			return 1;
		} else if(p1.price < p2.price) {
			return -1;
		} else {
			return 0;
		}
	}

}
