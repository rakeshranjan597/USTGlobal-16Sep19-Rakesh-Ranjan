package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(15);
		pq.add(25);
		pq.add(35);
		pq.add(45);
		pq.offer(55);
		System.out.print("Before Poll : ");
		System.out.println(pq+"\n");
		
		Iterator<Integer> it = pq.iterator();
		System.out.println("~~~ Start Pooling Using Iterator ~~~~");
		while(it.hasNext()) {
			System.out.print(pq.poll()+" ");
		}
		System.out.println("\n\nAfter Pool : "+pq);
	}
}
