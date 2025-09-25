package com.rays.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.*;

public class BufferedInputStreamAndBufferedOutputStreamJpg {

	public static void main(String[] args) throws IOException {

		BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\IO\\SunRise 4.jpg"));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\IO\\Morning 4.jpg"));

		byte[] buff = in.readAllBytes();
		out.write(buff);
		out.flush();

	}

}
