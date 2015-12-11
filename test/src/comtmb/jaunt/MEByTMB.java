package comtmb.jaunt;

import java.util.Iterator;

import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.UserAgent;

public class MEByTMB {

	public static void main(String[] args)
	{
		try
		{
			 UserAgent userAgent = new UserAgent();
			 userAgent.visit("http://localhost:8080/TMBPOSTServiceConsume/MEBYTMB.htm");
	Element fromAccountContainer = userAgent.doc.findFirst("<div class=\"row\" id=\"From-Savings-Account\">");
	Elements fromAccounts = fromAccountContainer.findEvery("<option>");
	Iterator<Element> fromAccountsItr = fromAccounts.iterator();
	fromAccountsItr.next(); //First value is default display. Ignore it by calling next()
	while(fromAccountsItr.hasNext()){
		
		Element fromAccountElem = fromAccountsItr.next();
		System.out.println(fromAccountElem.innerXML().replace('\r', ' ').replace('\n', ' ').replace('\t', ' ').replaceAll("\\s+", " ").replaceAll("&nbsp;","").replaceAll("&ndash;","-"));// may to be tuned further
		
	}
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	}
