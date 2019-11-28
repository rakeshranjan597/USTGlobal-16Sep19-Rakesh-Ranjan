package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Interface {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add(17);
		al.add(65.5);
		al.add("yash");
		al.add(false);
		
		ListIterator lt = al.listIterator();
		System.out.println("~~~~ Forward Direction ~~~~ ");
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		System.out.println("~~~~ Backward Direction ~~~~");
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
		
		
	}
}
