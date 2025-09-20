package com.rays.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComprator {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("Ram",50000,"TCS"));
		list.add(new Employee("Puneet",45000,"BigBoss"));
		list.add(new Employee("Deepak",30000,"NCS"));
		list.add(new Employee("Shyam",75000,"Infosys"));
		list.add(new Employee("Anam",32000,"TCS"));
		list.add(new Employee("Sita",50000,"NCS"));
		
		OrderBySalary bySalary = new OrderBySalary();
		
		Collections.sort(list, bySalary);

		list.forEach(System.out::println);
		
		OrderByName byName = new OrderByName();
		
		Collections.sort(list, byName);
		
		list.forEach(System.out::println);
		
		
	}

}
