package com.rays.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Ram");
		list.add(7);
		list.add('b');
		list.add("Ram");
		list.add("Ram");
		list.add(null);
		list.add(null);

		System.out.println("list: " + list);
		System.out.println(list.get(6));
		System.out.println(list.set(0, "Sita"));
		System.out.println("list: " + list);
		System.out.println(list.indexOf("Ram"));
		System.out.println(list.lastIndexOf("Ram"));
		System.out.println(list.subList(0, 7));

	}

}
