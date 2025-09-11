package com.rays.abstracts;

public class BusinessMan extends Person implements RichMan, SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("earn money.....");
	}

	@Override
	public void donation() {
		System.out.println("gives donation.....");
	}

	@Override
	public void party() {
		System.out.println("doing party.......");
	}

	@Override
	public void helpToOthers() {
		System.out.println("help to others.....");
	}

}
