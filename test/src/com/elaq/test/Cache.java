package com.elaq.test;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Cache {
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
	
		tmpValue=st.nextToken();
		//System.out.println(tmpValue);
		String [] C5CodeKeyVal = tmpValue.split(":");
		for(int i=0;i<C5CodeKeyVal.length;i++)
		{
		System.out.println(C5CodeKeyVal[i]);	
		}
		//System.out.println(C5CodeKeyVal);
		if (C5CodeKeyVal.length == 2) {
			C5CodesMap.put(C5CodeKeyVal[0], C5CodeKeyVal[1]);
		//	System.out.println(C5CodesMap);

		}
		//System.out.println(st.nextToken());
		
		} 
	}
	
	public static String getC5Code(String C5Key)
	{
		//
		
		//System.out.println(C5CodesMap.get(C5Key));
		return C5CodesMap.get(C5Key);
	}
public static void main(String [] args)
{
	//Cache obj = new Cache();
	Cache.loadC5Codes();
	Cache.getC5Code("AC");
	
}
}