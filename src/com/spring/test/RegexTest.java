package com.spring.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public RegexTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// (\\.{1,}||\\*{1,})
		Pattern pattern = Pattern.compile("[^(?!\\*)](\\.{1,}||\\*{1,})");
		String tString = "122***";
		Matcher matcher = pattern.matcher(tString);
		if (matcher.find()) {
			System.err.println(matcher.group(0));
			System.err.println(matcher.group(1));
		}
		
	}
}
