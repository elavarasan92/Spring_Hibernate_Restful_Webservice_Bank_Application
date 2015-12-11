package com.elaq.test;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
//import java.util.Date;
import java.util.List;

public class DateRepeater {

	
	public void dateListMehtod(java.sql.Date scheduledDate,int interval, int stopAfter) {
		
		List<String> dateList = null;
		String date, endate;
		String[] arrayOfDates;
		List<Date> sqlDateList=new ArrayList<Date>();

		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//Date d = scheduledDate;

		c.setTime(scheduledDate);
		switch (interval) {
		case 0:
			date = sdf.format(c.getTime());
			for (int i = 0; i < stopAfter; i++) {
				c.add(Calendar.DAY_OF_YEAR, 1);
				endate = sdf.format(c.getTime());
				date = date + " " + endate;
			}
			arrayOfDates = date.split(" ");
			dateList = Arrays.asList(arrayOfDates);

			break;
		case 1:
			date = sdf.format(c.getTime());
			for (int i = 1; i < stopAfter; i++) {
				c.add(Calendar.WEEK_OF_YEAR, 1);
				endate = sdf.format(c.getTime());
				date = date + " " + endate;
			}
			arrayOfDates = date.split(" ");
			dateList = Arrays.asList(arrayOfDates);

			break;

		case 2:
			date = sdf.format(c.getTime());
			for (int i = 1; i < stopAfter; i++) {
				c.add(Calendar.MONTH, 1);
				endate = sdf.format(c.getTime());
				date = date + " " + endate;
			}
			arrayOfDates = date.split(" ");
			dateList = Arrays.asList(arrayOfDates);

			
			break;
		}
	//	System.out.println(dateList);

		for(String dl : dateList)
		{
			 sqlDateList.add(java.sql.Date.valueOf(dl));
		}
			System.out.println(sqlDateList);
		}
	

	public static void main(String[] args) {
		DateRepeater obj = new DateRepeater();
		obj.dateListMehtod(java.sql.Date.valueOf("2015-08-05"),0,3);

	}

}
