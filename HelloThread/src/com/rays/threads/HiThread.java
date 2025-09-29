package com.rays.threads;

public class HiThread extends Thread{
	
	public String name;

	public HiThread(String name) {
		this.name = name;
	}
	@Override
	public void run() {
	    for(int i = 1; i<= 700; i++) {
	    	try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	System.out.println(i+"="+name);
	    }
	}

}
