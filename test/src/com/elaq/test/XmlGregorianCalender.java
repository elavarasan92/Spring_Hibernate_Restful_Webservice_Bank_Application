package com.elaq.test;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class XmlGregorianCalender {
	
	public Date getSQLDate(XMLGregorianCalendar xgcal) throws DatatypeConfigurationException
	{
		
	      java.util.Date dt = xgcal.toGregorianCalendar().getTime();
	      java.sql.Date sqlDt = new java.sql.Date(dt.getTime());
	     return sqlDt;
	}
	
	public static void main(String [] args) throws DatatypeConfigurationException
	{ GregorianCalendar gcal = new GregorianCalendar();
    XMLGregorianCalendar xgcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
    System.out.println(xgcal);
		XmlGregorianCalender obj = new XmlGregorianCalender();
		obj.getSQLDate(xgcal);

	}

//	To get a SQL version Date: 
//	java.sql.Date sqlDt = new java.sql.Date(dt.getTime());
}
