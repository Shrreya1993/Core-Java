package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter f = new FileWriter("D://IO//Rays.txt");
		
		f.write("Hello World\nThis is my Imagination\nI am the Queen");
		
		f.close();
		System.out.println("text data write sucessfully");
	}

}
