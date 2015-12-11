package com.elaq.test;

import java.util.Iterator;

import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;

public class ForiegnLanguageString {

	public static void main(String[] args)
	{
		try{
			Value value = new Value();
			  UserAgent userAgent = new UserAgent();   
			  userAgent.visit("http://localhost:8080/TMBPOSTServiceConsume/register.html");
			   
			  Element table  = userAgent.doc.findFirst("<table>"); 
			  Elements option = table.findEvery("<option>");
			  Iterator<Element> optionItr = option.iterator();
			  while(optionItr.hasNext())
			  {
				  Element options = optionItr.next();
				  value.setValue(options.innerXML());
				 // value.setValue(options.getAttx("value").trim());
				  if(value.getValue()==null)
				  {
					  System.out.println("null");
				  }
				  else
				  {
					  System.out.println("value"+value.getValue().s.replace('\r', ' ').replace('\n', ' ').replace('\t', ' ').replaceAll("\\s+", " ").replaceAll("&nbsp;","").replaceAll("&ndash;","-"));// may to be tuned further
				  }
			  }
			  
		}
		catch(JauntException e){         //if an HTTP/connection error occurs, handle JauntException.
		  System.err.println(e);
		}
	}
}
