package com.rays.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileByBufferedWriter {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("D://IO//SunilOs.txt"));

		bw.write("Hellow Sunflower");
		bw.newLine();
		bw.write("Wellcome to the Birth");

		bw.close();
		System.out.println("sucessfully");

	}

}
