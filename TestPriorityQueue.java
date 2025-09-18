package com.rays.collection.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {

		Queue q = new PriorityQueue();

		q.offer(1);
		q.offer(8);
		q.offer(3);
		q.offer(17);
//		q.offer("KGF");
//		q.offer('t');
		q.offer(6);
		q.offer(4);

		System.out.println(q);

	}

}
