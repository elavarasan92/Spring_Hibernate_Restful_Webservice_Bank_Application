package com.elaq.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileAccess {
	public static void main(String [] args)
	{
		Properties properties = new Properties();
		InputStream in = null;
		try
		{
			 in = new FileInputStream(new File(System.getProperty("PROPSFILE_PATH")));
			 properties.load(in);
			 
			 System.out.println("props file path"+properties.getProperty("PROPSFILE_PATH"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
