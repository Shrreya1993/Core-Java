package com.rays.thread;

public class HelloThread extends Thread {

	private String name;

	public HelloThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " = " + name);
		}

	}

}
