package com.rays.thread;

public class TestHelloThread {
	public static void main(String[] args) {

		HelloThread t1 = new HelloThread("Ram");
		HelloThread t2 = new HelloThread("Ghram");
		HelloThread t3 = new HelloThread("Kumaya");
		HelloThread t4 = new HelloThread("Hari");
		HelloThread t5 = new HelloThread("Jamna");


		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
