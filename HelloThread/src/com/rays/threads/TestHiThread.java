package com.rays.threads;

public class TestHiThread {

	public static void main(String[] args) {
		
		HiThread H = new HiThread("Heena");
		HiThread I = new HiThread("Shrreya");
		
		H.start();
		I.start();
	}
}
