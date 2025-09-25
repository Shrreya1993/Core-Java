package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadMergeFilesByBufferedWritter {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("D://IO//Hello.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("D://IO//Rays.txt"));

		BufferedWriter bw = new BufferedWriter(new FileWriter("G://IO//HelloRays.txt"));

		String line = br.readLine();
		String line1 = br1.readLine();

		while (line != null) {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}
		while (line1 != null) {
			bw.write(line1);
			bw.newLine();
			line1 = br1.readLine();
		}
		bw.close();
		br.close();
		br1.close();
	}

}
