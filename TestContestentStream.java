package com.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestentStream {

	public static void main(String[] args) {

		ArrayList<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Ram", "5880029393"));
		list.add(new Contestant("Ramila", "5880029393"));
		list.add(new Contestant("kamya", "7398373298"));
		list.add(new Contestant("Farhan", "9932112393"));
		list.add(new Contestant("Invalid", "29393"));
		list.add(new Contestant("Sam", "8881822222"));
		list.add(new Contestant("Jamaii", "7771129393"));
		list.add(new Contestant("Smita", "6611882223"));
		list.add(new Contestant("Hiram", "4772228882"));
		list.add(new Contestant("Laila", "3337773393"));
		list.add(new Contestant("Geeta", "5882333393"));

//Get the phone no
		System.out.println("-----Get phone no--------");
		list.stream().map(e -> e.phoneNo).forEach(System.out::println);
//Get Filter phone no
		System.out.println("-----Filter phone No-----");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).forEach(System.out::println);
//remove Duplicate phone no
		System.out.println("-------remove Duplicate phone no------");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct().forEach(System.out::println);
//shuffle phone no
		System.out.println("-----Suffle phoneNo-----");
		list.stream().map( e ->e.phoneNo).filter(e -> e.length() == 10).distinct().
		collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
			Collections.shuffle(e);
			return e.stream();
			})).limit(3).forEach(System.out::println);


		}}
