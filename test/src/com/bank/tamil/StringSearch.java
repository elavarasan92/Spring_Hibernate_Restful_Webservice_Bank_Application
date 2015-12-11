package com.bank.tamil;

import java.util.regex.Pattern;

public class StringSearch {

	public static void main(String[] args)
	{
		String s1 = "AbBaCca";
		String s2 = "bac";
		System.out.println(Pattern.compile(Pattern.quote(s2), Pattern.CASE_INSENSITIVE).matcher(s1).find());
	}
}
