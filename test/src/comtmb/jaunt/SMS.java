package comtmb.jaunt;

import com.jaunt.UserAgent;

public class SMS {
		
		public static void main(String[] args)
	{
	try{
		  UserAgent userAgent = new UserAgent();   
		  userAgent.visit("http://site25.way2sms.com/content/index.html");
		  
		  userAgent.doc.apply(     //fill-out the form by applying a sequence of inputs
				    "8531990331",        //string input is applied to textfield
				    "elavarasan"        //string input is applied to textarea
				  ); 
				  userAgent.doc.submit("create trial account"); //press the submit button labelled 'create trial account'
				  System.out.println(userAgent.getLocation());  //print the current location (url)
				}
		  
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
		   
}
}