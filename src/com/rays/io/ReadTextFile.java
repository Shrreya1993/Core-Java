package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
//Why the Exception is thrown here?
//imported(java.io.IOException;)

		FileReader file = new FileReader("D://IO//Hello.txt");
//Object is been made and ClassPath is been Explained above(Imported-java.io.FileReader;)

		int i = file.read();
//Asper by the Asci Value(Characters in the file are been readed)-Method (file.read;)
//While Loop is Inserted to Continue the reading char in file until the Asci value of char comes to (-1)

		while (i != -1) {
			System.out.println((char) i);
			i = file.read();
//i = file.read();("Method is being repated,as been the while loop has Inserted)
			
		}
		file.close();
//If condition in while loop has occured to(i = -1) than the reading of char has been stoped.

	}

}
