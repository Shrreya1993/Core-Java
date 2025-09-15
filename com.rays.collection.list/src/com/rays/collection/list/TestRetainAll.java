package com.rays.collection.list;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();

		c1.add("HI");
		c1.add(7);
		c1.add(7);
		c1.add('e');
		c1.add(true);

		System.out.println("c1: " + c1);
		System.out.println("c1 size: " + c1.size());
		System.out.println(c1.contains("HI"));
		System.out.println("c1: " + c1);
		System.out.println(c1.remove('e'));
		System.out.println(c1.add(6));
		System.out.println("c1: " + c1);

		System.out.println("--------------------------------------------");

		Collection c2 = new ArrayList();

		c2.add("Delhi");
		c2.add('U');
		c2.add('R');
		c2.add(false);
		c2.add(9);

		System.out.println(c2.remove('U'));
		System.out.println(c2.add(10));
		System.out.println(c2.contains(false));
		System.out.println(c2.isEmpty());
		System.out.println("c2: " + c2);

	}
}
