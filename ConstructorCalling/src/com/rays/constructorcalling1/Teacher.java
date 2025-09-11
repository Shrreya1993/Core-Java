package com.rays.constructorcalling1;

public class Teacher extends Person {

	public Teacher() {
		System.out.println("Teacher:Default Constructor");
	}

	public Teacher(String name) {
		super();
		System.out.println("name: " + name);
	}

	public Teacher(String name, String address) {
		super(name);
		System.out.println("address: " + address);
	}

	public Teacher(String name,String address,String subject) {
		super(name,address);
		System.out.println("subject: "+subject);
	}

}
