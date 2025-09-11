package com.rays.constructorcalling1;

public class Doctor extends Person {

	public Doctor() {
		System.out.println("Doctor:Default Constructor");
	}

	public Doctor(String name) {
		super();
		System.out.println("name: " + name);
	}

	public Doctor(String name, String address) {
		super(name);
		System.out.println("address: " + address);
	}

	public Doctor(String name, String address, String specialization) {
		super(name, address);
		System.out.println("specialization: " + specialization);
	}

}
