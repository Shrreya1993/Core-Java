package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) {
//Exception is not written here

		File f = new File("D://IO//Hello.txt");

		if (f.exists()) {
			System.out.println("file name: " + f.getName());
//Name of File is called out = "Hello.txt" 
			System.out.println("absolute path: " + f.getAbsolutePath());
//Path to get to this File text"D:(Drive)\IO(Folder)\Hello.txt(File Name)"
			System.out.println("readable: " + f.canRead());
//Returns the answer in Boolean(true)-Is Readable
			System.out.println("writable: " + f.canWrite());
//Returns the answer in Boolean (false)-Can be Rewritable
			System.out.println("is file: " + f.isFile());
//In the Pathway ("D:\IO\"Hello.txt")ends with the file name (true)-Boolean Form expression
			System.out.println("is directory: " + f.isDirectory());
//In the Pathway ("D:\IO) ends with the Folder Name (true) or else it is(false)- Boolean expression
			Date d = new Date(f.lastModified());
//
			System.out.println("last modified: " + d);
//
			System.out.println("size:  " + f.length());
//Size of the file Character is counted
		} else {
			System.out.println("file not found");
//if the File is Not found on the GivenPathway than ("file not found")get printed

		}
	}

}
