package com.ela.pojo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;
public class Holiday
{
	  static List resultList= new ArrayList();

public List getDateRange(Date startDate, Date endDate){
   
	Calendar aCalendar;
    Date testDate;
  
    aCalendar = Calendar.getInstance();
    aCalendar.setTime(startDate);
    testDate = startDate;
  
    while(!testDate.after(endDate)){
         resultList.add(testDate);
         aCalendar.add(java.util.Calendar.DATE, 1);
         testDate = aCalendar.getTime();
    }
    return resultList;
}

public static void main(String[] args) throws ParseException
{
	Holiday obj = new Holiday();
	
	 String expectedPattern = "dd/MM/yyyy";
	    SimpleDateFormat formatter = new SimpleDateFormat(expectedPattern);
	      String sDate = "12/12/2015";
	      String eDate = "21/12/2015";
	      Date startDate = formatter.parse(sDate);
	      Date endDate = formatter.parse(eDate);
	 
	obj.getDateRange(startDate, endDate);
	for (Object temp : resultList) {
		System.out.println(temp);
	}

}
}
