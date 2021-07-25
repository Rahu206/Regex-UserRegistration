package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
	public static void main(String[] args) {
		String regex_for_Email = "^[a-zA-Z0-9+.-]+@[a-zA-Z0-9.]+$" ;
				
		Pattern pattern = Pattern.compile(regex_for_Email);
		Matcher matcher = pattern.matcher("abc.xyz@bl.co.in");
		
		System.out.println("Email Valid : " +matcher.matches());
	}

}
