package com.rays.abstracts;

public class TestBusinessMan {

	public static void main(String[] args) {

		RichMan rm = new BusinessMan();
		rm.party();
		rm.donation();
		rm.earnMoney();

		System.out.println("------------------");

		SocialWorker sw = new BusinessMan();
		sw.helpToOthers();

		System.out.println("------------------");

		BusinessMan b = new BusinessMan();
		b.getName("Ram");
		b.donation();
		b.earnMoney();
		b.party();
		b.helpToOthers();

	}

}
