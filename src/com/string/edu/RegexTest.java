package com.string.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String args[]) {
		//List<String> result = new ArrayList<>();
		// String pattern = "[a-z]+";
		// String pattern = "[ Na-z]+";
		// String text = "Now is the time";
		//
		// String pattern = "<.+>";
		//String pattern = "<[^>]+>"; // All tags
		//String pattern = ">[^<]+<"; // Tag content 
		//String pattern = "<(\\w+)>[\\w .,]+</\\1>"; // Include all Tags
		//String text = "<p><b>Beginning with bold text</b> next, text body,<i>italic text</i> end of text.</p>";
		//
		String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w{2,}";
		//String text = "a.b_c.d@i.ua";
		String text = "a.b_c.d@i.ua aa_@gmail.com;bb@ukr.net";
		//
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//
		if (m.matches()) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		m.reset();
		while (m.find()) {
			//result.add(text.substring(m.start(), m.end()));
			//System.out.print(text.substring(m.start(), m.end()) + "*");
			//System.out.println(text.substring(m.start()+1, m.end()-1).trim()); // Tag content 
			System.out.println(text.substring(m.start(), m.end())); // Tag content
		}
		//System.out.println("\nResult = " + result);
	}
}
