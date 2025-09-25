package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadJpgFile {

	public static void main(String[] args) throws IOException {

		String source = "D://IO//SunRise 2.jpg";
		String target = "D://IO//Morning2.jpg";

		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int ch = in.read();
		while (ch != -1) {
			out.write(ch);
			ch = in.read();
		}
		out.close();
		in.close();
	}

}
