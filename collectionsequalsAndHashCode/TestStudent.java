package com.rays.collectionsequalsAndHashCode;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student("Pawan", 101);
		Student s2 = new Student("Ram", 102);

		System.out.println(s1.equals(s2));
		System.out.println("s1: " + s1.hashCode());
		System.out.println("s2: " + s2.hashCode());
	}

}
