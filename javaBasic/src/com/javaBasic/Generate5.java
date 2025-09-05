package com.javaBasic;

import java.util.Random;

public class Generate5 {
	public static void main(String[] args) {
		Random rand = new Random();

		
		System.out.println("Random numbers between 1 to 100:");

		for (int i = 0; i < 5; i++) {
			int number = rand.nextInt(100) + 1;
			System.out.println(number);

	
		}
	}

}
