package com.elaq.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class CurrentDate {
	
	Calendar calendar = Calendar.getInstance();
	static List<Calendar> holidayList= new ArrayList<Calendar>();
	
public Calendar getRepublicDay(int year)
{
	calendar.set(year, 1,26);
	System.out.println(calendar);
	holidayList.add(calendar);
	return calendar;
}
	
public Calendar getGoodFriday(int year)
{
	calendar.set(year, 3,25);
	System.out.println(calendar);
	holidayList.add(calendar);
	return calendar;
}
public Calendar getAnnualClosingOfBanks(int year)
{
	calendar.set(year, 4,1);
	System.out.println(calendar);
	holidayList.add(calendar);
	return calendar;
}



public Calendar getIndependenceDay(int year)
{
	calendar.set(year, 8,15);
	System.out.println(calendar);
	holidayList.add(calendar);
	return calendar;
}



public Calendar getVijayaDashami(int year)
{
	calendar.set(year, 10,11);
	System.out.println(calendar);
	holidayList.add(calendar);
	return calendar;
}

public Calendar getMoharam(int year)
{
	calendar.set(year, 10,12);
	System.out.println(calendar);
	holidayList.add(calendar);
	return calendar;
}


	public static void main(String [] args)
	{
		
//		 Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
//	      
//	      Date date = calendar.getTime();
//		int day = calendar.get(Calendar.DATE);
//		
//		System.out.println("date===="+day);
		CurrentDate obj = new CurrentDate();
		
		obj.getRepublicDay(2015);
		System.out.println(holidayList.get(2));
		

}
}