package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLastName {
	public static void main(String[] args) {
		String regex_for_LastName =  "^[a-zA-Z]{0,10}";
			
			
			
			Pattern pattern = Pattern.compile(regex_for_LastName);
			Matcher matcher = pattern.matcher("Deshpande");
			
			System.out.println("LastName Valid : " +matcher.matches());
			
	}

}
