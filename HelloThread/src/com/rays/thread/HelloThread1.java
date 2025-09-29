package com.rays.thread;

public class HelloThread1 extends Thread{

	public String name;
	public String city;
	
	public HelloThread1(String name, String city) {
		this.name = name;
		this.city = city;
			}
	@Override
	public void run() {
 for(int i = 1; i <=100; i++) {
//	 try {
//		sleep(1000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	 System.out.println(i +" = "+ name + " "+city);
			
		}
			}
}