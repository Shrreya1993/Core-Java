package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestListing {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(9);
		list.add("Keshav");
		list.add('U');
		list.add(true);
		list.add("Gopal");
		list.add(99);

		System.out.println("list: " + list);
		System.out.println(list.get(4));
		System.out.println(list.remove(3));
		System.out.println(list.indexOf("Gopal"));
		System.out.println(list.lastIndexOf(true));
		System.out.println(list.set(2, 'K'));
		System.out.println("list: " + list);

	}

}
