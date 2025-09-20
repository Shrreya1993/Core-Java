package com.rays.collection.sorting;

public class Marksheet implements Comparable<Marksheet> {
//Generic - Marksheet
//Marksheet is an Object which is Comparable
	public String rollNo;
	public String name;
	public int phy;
	public int math;

	public Marksheet(String rollNo, String name, int phy, int math) {
		this.rollNo = rollNo;// Constructor Calling to escape by making Setter and Getter
		this.name = name;
		this.phy = phy;
		this.math = math;
	}

	@Override
	public int compareTo(Marksheet o) {
		return this.phy-o.phy;
//phy is the mode to compare the object(Marksheet)
	}

	@Override
	public String toString() {
		return " rollNo: " + rollNo + " name: " + name + " phy: " + phy + " math: " + math;
	}

}
