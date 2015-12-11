package com.elaq.test;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Cache1 {
	public static Map<String,String> C5CodesMap = new HashMap<String,String>();
	public static String C5CodeList;
	public static StringTokenizer st;
	public static String tmpValue;
	public static void loadC5Codes()
	{
	C5CodeList = "AB:ASBA CURRENT ACCOUNTS|AC:VFD CURRENT|AD:SELECT ADD-ON|AE: EXCLUSIVE ADD-ON|AF: SELECT CURRENT- ADD- ON";
	st = new StringTokenizer(C5CodeList,"|"); 
	
	while(st.hasMoreTokens())
	{
	
		tmpValue = st.nextToken();
		

		}
		//System.out.println(st.nextToken());
		
		} 
	}
public static void main(String [] args)
{
	//Cache obj = new Cache();
	Cache1.loadC5Codes();
	
}
}