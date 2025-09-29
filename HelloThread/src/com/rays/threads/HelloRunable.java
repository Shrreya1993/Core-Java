package com.rays.threads;

public class HelloRunable implements Runnable {

	private String name;

	public HelloRunable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "=" + name);

		}
	}

}
