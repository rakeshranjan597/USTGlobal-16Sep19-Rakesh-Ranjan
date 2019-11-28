package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Class {
	public static void main(String[] args) {
		Vector ll = new Vector();
		ll.add(15);
		ll.add(0,60.5);
		ll.add("Rakesh");
		ll.add(null);
		ll.add(false);
		System.out.println(ll);
		
		System.out.println("~~~ For Loop ~~~ ");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("~~~ For Each ~~~ ");
		for (Object l : ll ) {
			System.out.println(l);
		}
		
		
		Iterator it = ll.iterator();
		
		System.out.println("~~~ Using Iterator ~~~");
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		ListIterator lt = ll.listIterator();
		
		System.out.println("~~~~ Forward Direction ListIterator ~~~~ ");
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		System.out.println("~~~~ Backward Direction ListIterator ~~~~");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
	}
}
