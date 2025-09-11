package com.rays.constructorcalling1;

public class Student extends Person {

	public Student() {
		System.out.println("Student:Default Constructor");
	}

	public Student(String name) {
		super();
		System.out.println("name: " + name);
	}

	public Student(String name, String address) {
		super(name);
		System.out.println("address: " + address);
	}

	public Student(String name, String address,  long rollNo) {
		super(name, address);
		System.out.println("rollNo: " + rollNo);
	}
}
