package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextFileByBufferedReader {
//Buffered Reader - EXPLAINS The file Reader is reading one Line("String")at a time.
	
	public static void main(String[] args) throws Exception {
//Exception is thrown ?
		
		BufferedReader br = new BufferedReader(new FileReader("D://IO//Hello.txt"));
//Object is been Made to store the BufferReader(Path)
		
		String line = br.readLine();
//Method is been Written(String line = br.readLine();
//whileLoop is Inserted , untill Line ("String") doesn't come's to "Null" value.
//Method is Inserted to continue the loop
		
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
//br= new BufferedReader (get's close )"Untill" condition has arrived.
			
		}
	}


