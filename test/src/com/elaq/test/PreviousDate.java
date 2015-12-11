package com.elaq.test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PreviousDate {
	public String getYesterdayDateString(Date scheduledDate ) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(scheduledDate);
        cal.add(Calendar.DATE, -1);    
        System.out.println(dateFormat.parse(dateFormat.format(cal.getTime())));
        return dateFormat.format(cal.getTime());
}
	
	public static void main(String... args) throws ParseException
	{
		PreviousDate obj = new PreviousDate();
		obj.getYesterdayDateString(java.sql.Date.valueOf("2015-08-31"));
	}
}
