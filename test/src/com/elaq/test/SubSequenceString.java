package com.elaq.test;

import com.sun.xml.internal.bind.v2.model.core.Element;

public class SubSequenceString {

	public static void main(String [] args)
	{
		String str = "Hai how are you";
		if(str.contains(new String("Hai").subSequence(0, 2)))
		{
			System.out.println(str.subSequence(4, 6));
	
		}
	}
}
