package com.spring.test.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestStream {

	public static void main(String[] args) throws IOException {
		File file = new File(ClassLoader.getSystemResource("ceshi.txt").getPath());
	    
		InputStream inputStream = new FileInputStream(file);
		
		StringBuffer content = new StringBuffer();

		BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
		String inputLine = null;
		while ( (inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();
	    System.err.println(content.toString());
	}

}
