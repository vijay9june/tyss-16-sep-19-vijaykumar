package com.testyantra.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJ {
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(12);
		pq.add(24);
		pq.add(24);
		pq.add(35);
		pq.offer(1);
		
		System.out.println("Before poll "+pq);
		System.out.println("****************Using Iterator**************");
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("After poll "+pq);
		
		
	}
	
}
