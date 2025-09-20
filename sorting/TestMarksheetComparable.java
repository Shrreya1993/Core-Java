package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarksheetComparable {

	public static void main(String[] args) {

		List<Marksheet> list = new ArrayList<Marksheet>();
//Marksheet M = new Marksheet M1
//M1("106","Pavan",59,65)

		list.add(new Marksheet("106", "Pavan", 59, 65));
		list.add(new Marksheet("103", "Aman", 67, 78));
		list.add(new Marksheet("104", "Harsh", 78, 88));
		list.add(new Marksheet("102", "Ishan", 77, 57));
		list.add(new Marksheet("101", "Urusa", 99, 63));
		list.add(new Marksheet("105", "Rishi", 87, 46));

		list.forEach(System.out::println);

		System.out.println("-----------------------------------");
		Collections.sort(list);

		list.forEach(System.out::println);
	}

}
