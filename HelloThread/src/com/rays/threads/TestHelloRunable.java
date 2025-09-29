package com.rays.threads;

public class TestHelloRunable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new HelloRunable("Sita"));
		Thread t2 = new Thread(new HelloRunable("Geeta"));

		t1.setPriority(10);
		t2.setPriority(5);

		t1.start();
		t2.start();
	}

}
