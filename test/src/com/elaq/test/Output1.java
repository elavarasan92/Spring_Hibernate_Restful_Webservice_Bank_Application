package com.elaq.test;

public class Output1 {
	public static void main(String [] args)
	{
		String c = "hello i love java";
		int start = 2;
		int end = 9;
		char s[] = new char[end-start];
		c.getChars(start, end, s, 0);
		System.out.println(s);
	}

}
