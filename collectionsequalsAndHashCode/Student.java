package com.rays.collectionsequalsAndHashCode;

public class Student {

	private String name;
	private int rollNo;

	public Student(String name, int rollNo) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			System.out.println("obj null hai");
			return false;
		}
		if (!(obj instanceof Student)) {
			return false;
		}

		Student s = (Student) obj;

		return this.rollNo == s.rollNo && this.name == s.name;
	}

	@Override
	public int hashCode() {
		String str = name + rollNo;
		return str.hashCode();
	}

}
