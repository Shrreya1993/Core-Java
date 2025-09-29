package com.rays.thread;

public class TESThelloThread1 {
	public static void main(String[] args) {
		
		HelloThread1 t1=new HelloThread1("ram", "jaipur");
		HelloThread1 t2=new HelloThread1("Shyam","Indore");
		
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
