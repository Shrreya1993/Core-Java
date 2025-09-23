package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextFileByBufferedReaders {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("D://IO//Gmail.txt"));
		
		String line = br.readLine();
		
		while(line != null) {
			if(line.endsWith("@gmail.com")) {
				System.out.println(line);
				line = br.readLine();
			}else {
				line = br.readLine();
				
			}
			}
		br.close();
	}

}
