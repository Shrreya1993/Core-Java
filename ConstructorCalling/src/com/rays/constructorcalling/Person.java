package com.rays.constructorcalling;

public class Person {

	public Person() {
		System.out.println("Person:Default Constructor");
	}

	public Person(String name) {
		this();
		System.out.println("name: " + name);
	}

	public Person(String name, String address) {
		this(name);
		System.out.println("address: " + address);
	}

	public Person(String name, String address, int age) {
		this(name, address);
		System.out.println("age: " + age);
	}

}