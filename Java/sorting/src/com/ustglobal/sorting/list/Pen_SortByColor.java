package com.ustglobal.sorting.list;

import java.util.Comparator;

public class Pen_SortByColor implements Comparator<Pen>{

	@Override
	public int compare(Pen o1, Pen o2) {
		String p = o1.color;
		String q = o2.color;
		return q.compareTo(p);
	}

}
