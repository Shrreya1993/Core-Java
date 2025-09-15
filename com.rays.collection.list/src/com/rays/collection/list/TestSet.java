package com.rays.collection.list;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		Set s = new HashSet();

		s.add('d');
		s.add('D');
		s.add('e');
		s.add('U');
		s.add(44);
		s.add("Ridam");
		s.add(true);
		s.add("YES");
		s.add(888);

		System.out.println(s);

	}

}
